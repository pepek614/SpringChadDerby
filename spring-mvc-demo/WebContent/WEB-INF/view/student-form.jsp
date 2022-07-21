<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

	<title>Student Registration Form</title>

</head>


<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName"/>
	
	<br><br>
	
	Last name: <form:input path="lastName"/>
	
	<br><br>
	
	Country:
	
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	
	</form:select>
	
	<br><br>
	
	Favorite Language:
	
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
	Python <form:radiobutton path="favoriteLanguage" value="Python"/>	
	<br><br>
	
	Operating Systems:
	
	Linux <form:checkbox path="operationSystem" value="Linux"/>
	Mac OS <form:checkbox path="operationSystem" value="Mac Os"/>
	MS Windows <form:checkbox path="operationSystem" value="MS Windows"/>
	
	<br><br>
	
	<input type ="submit" value="Submit" />
	
	</form:form>



</body>



</html>








