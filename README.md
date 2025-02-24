# 📚 Page Turners - Online Bookshelf  

## 📝 Overview  

**Page Turners** is an innovative web application designed for book enthusiasts, providing a seamless digital platform for exploring, renting, and reviewing books. The goal of this project is to break physical barriers and offer a modern, user-friendly reading experience.  

With **Page Turners**, users can:  
- Browse a vast collection of books.  
- Add books to their favorites list.  
- Rent books and manage rentals efficiently.  
- Leave reviews and contribute to the reading community.  
- Benefit from an automated late fee management system.  
- Admins can add or update book details to maintain the digital library.  

The project follows **Agile methodology** and is developed using **GitHub** for collaboration.  

---

## 🔧 Tech Stack  

### Backend 🖥️  
Built using **Spring Boot** and **PostgreSQL**, the backend handles authentication, book management, rentals, payments, and API interactions.  

- **Java 17** – Stable and enterprise-ready programming language.  
- **Spring Boot**:  
  - `Spring Boot Starter Web` – REST API development.  
  - `Spring Boot Starter Data JPA` – Database operations (CRUD).  
  - `Spring Boot Starter Data REST` – Auto-exposure of RESTful resources.  
  - `Spring Boot Starter OAuth2 Resource Server` – Secure authentication.  
- **PostgreSQL** – Reliable relational database for data management.  
- **Lombok** – Reduces boilerplate code for cleaner development.  
- **AWS SDK for S3** – Cloud storage for book-related assets.  
- **Stripe Java SDK** – Secure payment processing.  
- **JWT (JSON Web Token)** – Token-based authentication.  
- **JUnit & Spring Security Test** – Unit testing and security testing.  
- **Docker** – Containerization for backend services.  

### Frontend 🌐  
Developed with **React, TypeScript, and Vite**, ensuring a fast, responsive, and user-friendly interface.  

- **ReactJS** – Component-based UI for an interactive experience.  
- **TypeScript** – Enhances code quality with static typing.  
- **Vite** – Lightning-fast build tool for optimized development.  
- **Bootstrap & React-Bootstrap** – Modern and responsive UI components.  
- **React Router DOM** – Efficient navigation management.  
- **Font Awesome** – Rich icons for better UI aesthetics.  
- **Axios** – Handles API requests and data fetching.  
- **Stripe.js & React-Stripe.js** – Secure and seamless payment integration.  
- **Husky, ESLint, Prettier** – Code linting and formatting for maintainability.  
- **Commitlint & Lint-staged** – Enforces commit message conventions and optimized linting.  

### Deployment & CI/CD 🚀  
- **Netlify** – Hosting the frontend for live access.  
- **GitHub Actions** – CI/CD automation for testing and deployment.  
- **Elastic Container Service (ECS) & Elastic Container Registry (ECR)** – Backend container orchestration.

---

## 🚀 Future Enhancements

- 📖 Implement book recommendations based on user preferences.
- 🔔 Add notification system for overdue books and new arrivals.
- 🛒 Introduce a cart system for bulk rentals.
- 🌍 Enable multi-language support.
