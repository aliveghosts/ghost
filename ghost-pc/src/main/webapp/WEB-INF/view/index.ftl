<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello ghost!!!</title>
</head>
<#macro greet>  
<font size="+2">Hello Joe!</font>  
</#macro>  
<body>
	<h1>hello freemarker!!!</h1>
	<@greet/>
	${num} 
	${dataTime?datetime}
	${name}
</body>
</html>