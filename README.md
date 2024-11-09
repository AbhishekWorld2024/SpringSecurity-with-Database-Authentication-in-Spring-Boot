# SpringSecurityWithDatabaseandWEB

**Project Overview**<br>
This project demonstrates the implementation of a Spring Boot application with Spring Security configured for database-backed authentication. The application is designed to authenticate users based on credentials stored in a MySQL database, with secure access to specific web pages using JSP.<br><br>

**Key Features**<br>
**Database Authentication:** User credentials are stored and verified in a MySQL database.<br>
**Custom User Details Service**: A custom UserDetailsService implementation (MYuserDetailsService) retrieves user details for authentication.<br>
**JSP Page Rendering:** After a successful login, the application redirects to a secured "Home" JSP page.<br>
**Security Configuration:** Configured to allow access to a specific page (/Home) for all users, while other endpoints require authentication.<br><br>
**Project Structure**<br>
**1. Controller**<br>
Homecontroller: Defines two endpoints:<br>
/: Displays "User Details from the Database" as a text response.<br>
/Home: Directs users to the JSP "Home" page, rendered after successful login.<br><br>
**2. Configuration Class**<br>
configclass: Configures Spring Security to enforce database authentication.<br>
Allows unauthenticated access to /Home while protecting other endpoints.<br>
Enables form-based login and HTTP Basic authentication.<br>
Uses DaoAuthenticationProvider with NoOpPasswordEncoder for encoding (for development purposes only).<br><br>
**3. Repository**<br>
Detailsrepository: Extends JpaRepository to interact with the Userdetails entity and fetch user data by username.<br><br>
**4. Service Class**<br>
MYuserDetailsService: Implements UserDetailsService to load user details from the database for authentication.<br>
Contains error handling to throw UsernameNotFoundException if a user is not found.<br>
**5. User Details Entity**<br>
Userdetails: Entity class mapped to the database table holding user data (ID, username, and password fields).<br><br>
**6. Configuration Properties**<br>
Configured in application.properties:<br>
Sets up database connection details (spring.datasource.*).<br>
Configures JSP rendering paths (spring.mvc.view.prefix and spring.mvc.view.suffix).<br>
Configures server port and other Hibernate settings.<br><br>
**7. How It Works**<br>
When the application starts, it displays a login page.<br>
After entering valid credentials, the user is authenticated against database-stored values.<br>
Upon successful login, the application redirects the user to the "Home" JSP page.<br>
Incorrect credentials or non-existing users will result in an authentication failure.<br><br>
**Technologies Used**<br>
Java: Core language for development<br>
Spring Boot: Framework for application structure and dependency management<br>
Spring Security: Manages authentication and authorization<br>
MySQL: Database for storing user credentials<br>
JSP: Used for rendering secured pages<br>
Maven: Build automation and dependency management<br><br>
**Prerequisites**<br>
Java 17 (or compatible version)<br>
MySQL database with a crudrepo schema<br>
Spring Tool Suite (optional but recommended for Spring Boot development)<br><br>
**Setup and Run**<br>
Clone the repository.<br>
Update application.properties with your MySQL database credentials if needed.<br>
Start the application.<br>
Access the login page at http://localhost:8108.<br>
After successful login, you will be redirected to /Home.<br><br>
Security Considerations<br>
For production, it is essential to replace NoOpPasswordEncoder with a secure password encoder like BCryptPasswordEncoder.<br>

