<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous"></script>
    <title>Join us!</title>

</head>
<body>
<div>
    <span>  가입 완료 창 </span>
</div>
<div>
    <form:form method="post" enctype="multipart/form-data" modelAttribute="person">
        <table>
            <thead>
            <th scope="col" style="width: 30%;"></th>
            <th scope="col" style="width: 30%;"></th>
            </thead>
            <tbody>
            <tr>
                <td>
                    <form:label path="name">이름</form:label>
                </td>
                <td>
                    <c:out value="${person.name}" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="age">나이</form:label>
                </td>
                <td>
                    <c:out value="${person.age}" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="gender">성별</form:label>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${person.gender eq 'Male'}">
                            <p>남자</p>
                        </c:when>
                        <c:otherwise>
                            <p>여자</p>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="hobby">취미</form:label>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${person.hobby eq 'music-listening'}">
                            <p>남자</p>
                        </c:when>
                        <c:when test="${person.hobby eq 'youtube'}" >
                            <p>유튜브 감상</p>
                        </c:when>
                        <c:otherwise>
                            <p>운동</p>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>


            </tbody>
        </table>
    </form:form>
</div>
</body>
</html>