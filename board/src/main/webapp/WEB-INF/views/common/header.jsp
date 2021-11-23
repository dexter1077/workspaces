<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1. BootStrap4 CDN -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    #headBox{
        width: 1000px;
        height: 150px;
        margin: auto;
        border: 2px solid red;
    }
    .loginBox{
        margin-top: 30px;
        margin-left: 800px;
    }

    #inputId, #inputPwd{
        width: 200px;
        height: 30px;
    }

    .container{
        width: 1000px;
        height: 1000px;
        border: 1px solid green;
    }
</style>
<body>
    <div id="headBox" align="right">
        <form action="login.me" method="post">
            <div>
                <div class="mb-3">
                    <input type="text" class="form-control" id="inputId" placeholder="ID">
                </div>
                <div class="mb-3">
                    <input type="password" class="form-control" id="inputPwd" placeholder="PWD">
                </div>
                <button type="submit" class="btn btn-primary">로그인</button>
            </div>
        </form>
    </div>
</body>
</html>