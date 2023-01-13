<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="adduser" modelAttribute="user">   
    Enter  Name : <input type="text" name="name"/> </br>
    Enter  Email Address: <input type="email" name="e_mail"></br>
    Enter  age: <input type="text" name="age"></br>
    Enter password: <input type="password" name="password">
    <input type="submit" value="Submit">
</form>
</body>
</html>
