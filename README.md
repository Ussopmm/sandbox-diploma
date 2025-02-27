# sandbox-diploma
For diploma project

BEKA BRATHA FOR U TUTOR HOW TO LAUNCH THE PROJECT:

  1.go here -> [src/main/java/io/ussopm/sandbox_diploma/dao/UserDAO.java]
  2. find this code: 
     ** private Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/TestDB";
        String user = "postgres";
        String password = "Eldos2812";
        return DriverManager.getConnection(url, user, password);
    }**
  3. intead of url, write your own postgresql (before, you should install and launch postgresql with database and table at once)
  4. replace authentication data with your's
  5. now you can run the project and try to carry out sql attacks using postman or sqlmap or other kinda shit mynigga
