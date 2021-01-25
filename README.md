Expense Reimbursements
Overview
A Web Application built using Java Servelets, Apache Tomcat, and Bootstrap 4 which allows for the handling of expense reimbursements.

Technologies
Apache Tomcat 8.5.60
Bootstrap 4
Jackson Databind
Jackson Core
Hibernate 4.3.11.Final
Java Servlet API 3.1.0
JUnit
Log4j API 2.13.0
PostgreSQL 42.2.18
Mockito 1.8.4

Features:
Employee can register and login to submit and view past reimbursement requests.
Reimbursement requests can be submitted by type: lodging, travel, food or other.
Manager can login to view all current and past reimbursment requests
Manager can approve, deny and filter reimbursement requests

Future Features:
Employees should be able to upload a document or image if their receipt.
Employees should be able to receive email notifications when the status of their request is changed.
Employees should be sent an email with a temporary password to login with when they register.

Getting Started / Usage:
In order to see this project in action, you will need a few things:

Be sure to have Apache Tomcat 8.5.60 installed.
Be sure to have the Java 8 runtime environment installed.
If both of the pre-requisites above are met, go ahead and clone this repo by using the below command:

    git clone https://github.com/bjm630/MyRepo.git
    
Once cloned, copy the .war file located within the /target directory and paste it into your tomcat webapps folder.

Once the .war has been exploded, by default you will be able to view the application at http://localhost:8080/project1 in your local browser.
