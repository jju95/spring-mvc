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
<script type="text/javascript">
    function previewImg(input){
        if(input.files && input.files[0]){
            var reader = new FileReader();
            reader.onload = function (e){
                $("#preview").attr("src",e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }else{
            $("#preview").attr("src","");
        }
    }
</script>
<body>
<div>
    <span> 가입하기 </span>
</div>
<div>
    <div >
        <img id="preview" style="height: 30%; width: 15%;"/>
    </div>
    <form:form method="post" modelAttribute="person" enctype="multipart/form-data" action="/join">
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
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="age">나이</form:label>
                </td>
                <td>
                    <form:input path="age" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="gender">성별</form:label>
                </td>
                <td>
                    남자 <form:radiobutton path="gender" value="Male"/>
                    여자 <form:radiobutton path="gender" value="FeMale" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="hobby">취미</form:label>
                </td>
                <td>
                    뮤직리스닝 <form:checkbox path="hobby" value="music-listening"/>
                    유튜브 <form:checkbox path="hobby" value="youtube" />
                    운동 <form:checkbox path="hobby" value="exercise" />
                </td>
            </tr>
            <tr>
                <td>
                    대표 썸네일
                </td>
                <td>
                    <form:input path="file" type="file" onchange="previewImg(this);" />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="가입하기">
                </td>
            </tr>
            </tbody>
        </table>
    </form:form>
</div>
</body>
</html>