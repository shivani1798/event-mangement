

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
             <link id="theme" rel="stylesheet"  href="css/style.css"  />
    </head>
       
<body>  
 
    <div class="Registration-page">
  <div class="form">
    <center>
  <h1> User Registration </h1>
</center>
     <form  name="Registrationform" action="RegistrationServlet" method="post">
      <input type="text" name ="username" placeholder="Enter Username" required="Email" />
      <input type="password" name ="password"placeholder="Password" required="Password" />
      
      <button type="submit" Register</button>
     
    </form>
  </div>
    </body>
</html>
