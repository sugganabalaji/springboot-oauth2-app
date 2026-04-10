# Spring Boot OAuth2 Login Project

## 📌 Overview
This project demonstrates how to integrate **OAuth2 login** with **Google** and **GitHub** into a **Spring Boot MVC REST API** application.
It provides secure authentication using external identity providers, eliminating the need for local password storage.
---

## 🚀 Tech Stack
- **Spring Boot** – Application framework
- **Spring Security OAuth2 Client** – OAuth2 login integration
- **Spring MVC** – REST API endpoints
---
## ⚙️ Features
- Login with **Google** and **GitHub** via OAuth2
- Secure REST endpoints protected by authentication
- Centralized exception handling
---
## 📂 Project Structure
```
    src/
    └── main/
    ├── java/
    │   └── com.app
    │       ├── config/        # Configuration classes
    │       ├── model/         # JPA Entities (JobPost)
    │       ├── controller/    # REST Controllers
    │       └── SpringOAuthApplication.java # Entry point
    └── resources/
    └── application.yaml
```
## 🛠️ Setup Instructions

**1. Clone the repository**
```markdown
    git clone https://github.com/sugganabalaji/spring-oauth2-app.git
    cd spring-oauth2-app
```
**2. Register OAuth2 Apps**

**Google Developer Console Setup:**
  - Go to Google Cloud Console (`console.cloud.google.com` in Bing).
  - Create a **new project** (or select an existing one).
  - Navigate to **APIs & Services → Credentials.**
  - Click **Create Credentials → OAuth client ID.**
  - Configure **OAuth consent screen:**
    - Application name (e.g., `Spring OAuth Demo`)
    - Authorized domains (e.g., `localhost`)
    - Add scopes like `email` and `profile`
  - Set **Application type** to **Web application.**
  - Add **Authorized redirect URIs**:
  ```
    http://localhost:8080/login/oauth2/code/google
  ```
  - Save and copy the `Client ID` and `Client Secret`.
---

**GitHub Developer Setup:**
- Go to [GitHub Developer Settings.](https://github.com/settings/developers)
- Register a `new OAuth app`.
- Set **Homepage URL**: `http://localhost:8080`
- Set **Authorization callback URL**:
```
    http://localhost:8080/login/oauth2/code/github
```
- Copy the `Client ID` and `Client Secret`.
---

**3. Add OAuth2 Client Config**
   In `application.properties`:
```markdown
    spring.security.oauth2.client.registration.google.client-id=your_google_client_id
    spring.security.oauth2.client.registration.google.client-secret=your_google_client_secret
    spring.security.oauth2.client.registration.google.scope=email,profile
    
    spring.security.oauth2.client.registration.github.client-id=your_github_client_id
    spring.security.oauth2.client.registration.github.client-secret=your_github_client_secret
    spring.security.oauth2.client.registration.github.scope=user:email
```
**4. Run the Application**
   - Build and run the application using your preferred method (e.g., `mvn spring-boot:run` or `gradle bootRun`).
     - Access the application at `http://localhost:8080`.
     
**🧪 Testing**
- Start the app and visit:
  - `http://localhost:8080/oauth2/authorization/google`
  - `http://localhost:8080/oauth2/authorization/github`
- After login, you’ll be redirected with a valid session.
- Use `/` to fetch logged‑in user details.

**✅ Future Enhancements**
- Add JWT support for stateless APIs
- Role‑based authorization
- Integration with React frontend
- Swagger/OpenAPI documentation


  





