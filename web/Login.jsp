<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
  <head>
       <link id="theme" rel="stylesheet"  href="css/style.css"  />
      
    <title>Login Form</title>    
    
    
 </head>
  <body> 
      <div class="login-page">
  <div class="form">
  	<center>
	<h1><b>User Login</b></h1>
</center>
      <form  name="loginform" action="LoginServlet" method="post">
    
    
      <input type="text" name="username" placeholder="Username" required="Username">
      <input type="password" name="password" placeholder="Password" required="Password">
    
       <button type="submit">Login</button>
     <p class="message">Create Account<a href="Registration.jsp">Login</a></p>
    </form>
  </div>
</div>
<script type="text/javascript">
	$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});
</script>
  </body>
</html>
