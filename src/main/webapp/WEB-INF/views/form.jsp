<%--
  Created by IntelliJ IDEA.
  User: endo
  Date: 8/11/2017
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}
<form action="formhandler" method="post">
    Name: <input type="text" name="name"><br>
    Email: <input type="text" name="email"><br>
    Social Security Number: <input type="text" name="ssnum"> <br>
    <p>Please choose the appropriate response</p>
    <input type="radio" name="gender" value="male" checked> Male<br>
    <input type="radio" name="gender" value="female"> Female<br>
    <input type="radio" name="gender" value="other"> Other<br>

    <p>Are you a United States citizen?</p>
    <input type="radio" name="citizen" value="yes" checked> Yes<br>
    <input type="radio" name="citizen" value="no">No<br><br>


    To select your favorite color click on the colored tab:
    <input type="color" name="favcolor" value="#ff0000">

    <br>
    <br>


    <input type="submit" name="submit" value="Submit"><br>


</form>
</body>
</html>
