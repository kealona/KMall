<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>修改信息</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>修改信息</small>
        </h1>
      </div>
    </div>
  </div>
  <form action="${pageContext.request.contextPath}/user/del" method="post">
    <input type="hidden" name="bookID" value="${book.getBookID()}"/>
    UserId：<input type="text" name="userId"/>
    <input type="submit" value="提交"/>
  </form>
</div>