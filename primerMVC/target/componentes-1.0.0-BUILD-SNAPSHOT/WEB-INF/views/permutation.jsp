<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    Hello world!
</h1>

<p>  The time on the server is ${serverTime}. </p>
<p> Your name is ${ nombre.name }</p>
<p>Your lucky number is ${nombre.numero}</p>
<p>Your discriminant is ${nombre.discriminante}</p>
</body>
</html>
