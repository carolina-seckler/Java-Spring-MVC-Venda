<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cartonagem detalhe</title>
</head>
<body>
	
	<form action="/cartonagem" method="post">
		C�digo: <input type="text" name="codigo">
		Nome: <input type="text" name="nome">
		Descri��o: <input type="text" name="descricao">
		Pre�o: <input type="text" name="preco">
		Pre�o de fabrica��o: <input type="text" name="precoMaterial">
		<label><input type="checkbox" id="tecido" name="tecido" value="true"> Tecido?</label>
		<label><input type="checkbox" id="tecidoImpermeabilizado" name="tecidoImpermeabilizado" value="true"> Tecido impermeabilizado?</label>
		<label><input type="checkbox" id="sintetico" name="sintetico" value="true"> Sint�tico?</label>

		<input type="submit" value="Cadastrar">
	</form>
	
	<br><a href="/login">voltar</a>
</body>
</html>