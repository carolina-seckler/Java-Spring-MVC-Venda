<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tecido detalhe</title>
</head>
<body>
	
	<form action="/tecido" method="post">
		C�digo: <input type="text" name="codigo">
		Nome: <input type="text" name="nome">
		Descri��o: <input type="text" name="descricao">
		Pre�o: <input type="text" name="preco">
		Pre�o de fabrica��o: <input type="text" name="precoMaterial">
		<label><input type="checkbox" id="quiltingLivre" name="quiltingLivre" value="true"> Quilting livre?</label>
		<label><input type="checkbox" id="quiltingReto" name="quiltingReto" value="true"> Quilting reto?</label>
		<label><input type="checkbox" id="utilitarios" name="utilitarios" value="true"> Utilit�rios?</label>

		<input type="submit" value="Cadastrar">
	</form>
	
	<br><a href="/login">voltar</a>
</body>
</html>