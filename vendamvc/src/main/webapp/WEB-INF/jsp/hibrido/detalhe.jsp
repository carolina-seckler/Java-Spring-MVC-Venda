<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hibrido detalhe</title>
</head>
<body>
	
	<form action="/hibrido" method="post">
		C�digo: <input type="text" name="codigo">
		Nome: <input type="text" name="nome">
		Descri��o: <input type="text" name="descricao">
		Pre�o: <input type="text" name="preco">
		Pre�o de fabrica��o: <input type="text" name="precoMaterial">
		<label><input type="checkbox" id="cartonagemETecido" name="cartonagemETecido" value="true"> Cartonagem e tecido?</label>
		<label><input type="checkbox" id="cartonagemEMatelasse" name="cartonagemEMatelasse" value="true"> Cartonagem e matelass�?</label>
		<label><input type="checkbox" id="tecnicasSeparadas" name="tecnicasSeparadas" value="true"> T�cnicas separadas?</label>

		<input type="submit" value="Cadastrar">
	</form>
	
	<br><a href="/login">voltar</a>
</body>
</html>