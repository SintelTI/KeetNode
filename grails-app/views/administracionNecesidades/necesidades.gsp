<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Administración de necesidades</title>
</head>
<body>
  <div class="body">
  	<div  width="80%">
  
  
  
  <g:if test="${flash.errors}">
  		<div id="errors" class="errors">${flash.errors}</div>
  </g:if>
	
	<g:if test="${flash.message}">
  		<div class="errors">${flash.message}</div>
  	</g:if>
  	
  	<g:form>
  		<center><h1>Agregar nueva necesidad</h1></center>
  		<label>Sistema de origen</label> 		
  		
  		<g:select name="sistemaOrigen" 
  			from="${liStasistemas}" 
  			value="${sistema?.nombre}" 
  			noSelection="['null':'--Seleccione un Sistema de origen--']"/>
  		 	
  		<label>Sistema de destino</label>	
  		<g:select name="sistemaDestino" 
  			from="${liStasistemas}" 
  			value="${sistema?.nombre}" 
  			noSelection="['null':'--Seleccione un Sistema destino--']"/>
  			
  		<br>
  		<label>T&iacute;tulo</label>
  		<br>
  		<g:textField name="titulo" value="${necesidad?.titutlo}"></g:textField>
  		
  		<br>
  		<label>Descripci&oacute;n</label>
  		<br>
  		<g:textArea name="descripcion" value="${necesidad?.descripcion}" style="width:600px; height:150px;"></g:textArea>
  		
  		<g:actionSubmit value="registrarNecesidad" action="registrarNecesidad"/>
  		
  		</g:form>
  		
  		</div>
  </div>
</body>
</html>