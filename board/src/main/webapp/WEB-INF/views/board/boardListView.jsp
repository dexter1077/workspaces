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
<style>
    .moveDetail:hover{
        cursor: pointer;
        font-weight: 700;
    }
</style>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    <div class="container">
        게시글수 : <c:out value="${BoardListCount}"/>
        <table id="boardList" class="table table-bordered">
            <tr>
                <th>게시판번호</th>
                <th>제목</th>
                <th>등록자</th>
                <th>조회수</th>
                <th>등록일</th>
            </tr>
        <c:forEach var="boardList" items="${boardList}">
            <tr>
                <td><c:out value="${boardList.sn}"/></td>
                <td><label class="moveDetail" onclick="detailViewLoad('${boardList.sn}');"><c:out value="${boardList.title}"/></label></td>
                <td><c:out value="${boardList.rgstId}"/></td>
                <td><c:out value="${boardList.rdcnt}"/></td>
                <td><c:out value="${boardList.rgstDt}"/></td>
            </tr>
        </c:forEach>
        </table>
    <button type="button" class="btn btn-success">게시글 등록</button>
    </div>
    
    <script>
        function detailViewLoad(sn){
            location.href="selectBoardDetailView.do?sn=" + sn ;
        }

    </script>
    
    
</body>
</html>