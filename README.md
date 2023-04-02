# asset-tracking-application
Asset tracking application is a JavaServer Pages based application using MVC architecture. asset-tracking-application is used for tracking IT requests requests, emailing, looking for availability to schedule to provide the request, and etc. 

# Architecture design
- The architecture design is Model-View-Controller approach. This approach isolates the application logic from the user interface layer and supports separation of concerns.
- The Controller receives all the application requests. The the Model prepares data needed by the View using the business logic.
- The data that is prepared by the Controller to generate a final presentable response is sent to the View.
-The MVC abstraction can be graphically represented as follows.

![image](https://user-images.githubusercontent.com/30157534/229379472-9716c063-3088-49a3-ab33-511a7230d40b.png)

# Use Case
- Clients submits a form for the IT asset request.
- IT Helpdesk check the request and install equipment, if the job is not completed then the request is escalated to a higher support level.
- The escalated request is sent to the system/network engineer to install equipment.
- System Admins manage users

System Admin manage users.​
# Interface look & feel
### Login Page
![image](https://user-images.githubusercontent.com/30157534/229378917-41dd9e88-517a-4f3a-89c2-eca7bce0e787.png)

### IT Asset Request Form
![image](https://user-images.githubusercontent.com/30157534/229379043-cf88d54f-9cfe-4727-8115-0461406ff619.png)
