<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    Pagina de encriptacion!
</h1>

<form action="/componentes_war_exploded/encriptar" method="POST">
    <input type="text" name="fname" placeholder="Ingrese un nombre" />
    <input type="text" name="ffrase" placeholder="Ingrese un texto para encriptar" />
    <button type="submit" class="btn btn-info col-2">Enviar</button>
</form>


<br>
<button type="button" value="home" onclick="window.location.href='/componentes_war_exploded'">Volver al inicio</button>

</body>

</html>
