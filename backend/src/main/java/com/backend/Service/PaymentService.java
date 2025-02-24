package com.backend.Service;

import com.backend.DTO.PaymentInfoRequest;
import com.backend.Model.Payment;
import com.backend.Repository.PaymentRepository;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PaymentService {

	private final PaymentRepository paymentRepository;

	public PaymentService(PaymentRepository paymentRepository, @Value("${stripe.key.secret}") String secretKey) {
		this.paymentRepository = paymentRepository;
		Stripe.apiKey = secretKey;
	}

	public PaymentIntent createPaymentIntent(PaymentInfoRequest paymentInfoRequest) throws StripeException {
		List<String> paymentMethodTypes = new ArrayList<>();
		paymentMethodTypes.add("card");

		Map<String, Object> params = new HashMap<>();
		params.put("amount", paymentInfoRequest.getAmount());
		params.put("currency", paymentInfoRequest.getCurrency());
		params.put("payment_method_types", paymentMethodTypes);

		return PaymentIntent.create(params);
	}

	public ResponseEntity<String> stripePayment(Long userId) throws Exception {
		Payment payment = paymentRepository.findByUserId(userId);

		if (payment == null) {
			throw new Exception("Payment information is missing");
		}

		payment.setAmount(00.00);
		paymentRepository.save(payment);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	public Payment getPaymentByUserId(Long userId) {
		return paymentRepository.findByUserId(userId);
	}

}
