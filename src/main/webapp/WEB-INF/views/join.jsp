<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application with JSP</title>
</head>
<body>
<div>
    <span> 가입하기 </span>
</div>
<div>
    <form:form method="post" modelAttribute="person">
        <table>
            <thead>
            <th scope="col" style="width: 30%;"></th>
            <th scope="col" style="width: 30%;"></th>
            </thead>
            <tbody>
            <tr>
                <td>
                    <form:label path="Name">이름</form:label>
                </td>
                <td>
                    <form:input path="person.name" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="age">나이</form:label>
                </td>
                <td>
                    <form:input path="person.age" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="gender">성별</form:label>
                </td>
                <td>
                    남자 <form:radiobutton path="person.gender" value="Male"/>
                    여자 <form:radiobutton path="person,gender" value="FeMale" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="hobby">취미</form:label>
                </td>
                <td>
                    뮤직리스닝 <form:checkbox path="person.hobby" value="music-listening"/>
                    유튜브 <form:checkbox path="person.hobby" value="youtube" />
                    운동 <form:checkbox path="person.hobby" value="exercise" />
                </td>
            </tr>

            </tbody>
        </table>
    </form:form>
</div>
</body>
</html>