# Student Management

### Description
The Student DataBase project is a robust and efficient system built using Java and JDBC to manage student information. It connects to a MySQL database to store and retrieve data, providing a seamless experience for users.

### Technologies Used
- **MySQL**: Used for database management.
- **Java**: The main programming language used to build the system.
- **JDBC**: Java Database Connectivity (JDBC) is used to connect the Java code with the MySQL database.
  

### Installation

##### Java Installation
1. Visit the official [Java download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Download the appropriate Java Development Kit (JDK) for your operating system.
3. Run the installer and follow the instructions to install Java.

##### JDBC Driver Installation
1. Download the JDBC driver for MySQL from the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/).
2. Extract the downloaded file if it's a zip file.


### Usage
To use this project, follow these steps:

**Clone the repository**: Use the following command in your terminal to clone the repository to your local system:

```bash
git clone <repository-url>
cd <project-directory>
```
**Open the project**: Open IntelliJ IDEA, click on `File -> Open...`, then navigate to the project directory and click `OK`.

##### Adding JDBC Driver to IntelliJ IDEA
1. Open your project in IntelliJ IDEA.
2. Go to `File -> Project Structure -> Libraries`.
3. Click on the `+` button and select `Java`.
4. Navigate to the location where you extracted the JDBC driver and select the jar file.
5. Click `OK` to add the library, and `OK` again to close the Project Structure dialog.

#### replace your info
**path: src/com/connection/ConnectDB.java**
```java
// load the driver
Class.forName("com.mysql.cj.jdbc.Driver");

// creating connection
String userName = "<new-username>"; // replace <new-username> with your new username
String password = "<new-password>"; // replace <new-password> with your new password
String url = "jdbc:mysql://localhost:3306/STUDENT";

con = DriverManager.getConnection(url, userName, password);
```
**Build the project**: Once the project is open, click on `Build -> Build Project`.

**Run the project**: After the project has been built, click on `Run -> Run 'Main'` to run the project. The 'Main' should be the name of your main class that contains the `public static void main(String[] args)` method.
