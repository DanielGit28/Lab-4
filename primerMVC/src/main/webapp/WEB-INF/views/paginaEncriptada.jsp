
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<P>  Su nombre es: ${encriptado.nombre}. </P>
<p> Su frase es: ${encriptado.frase}</p>
<p> Su frase encriptada es: ${encriptado.encriptacion}</p>
<button type="button" value="volver" onclick="window.location.href='encriptacion'">Volver</button>
</body>
</html>
