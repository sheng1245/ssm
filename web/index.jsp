<%--
  Created by IntelliJ IDEA.
  User: 张土生
  Date: 2020/4/26
  Time: 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>进入书籍</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h3{
        width:150px;
        height: 38px;
        margin:30% auto;
        text-align: center;
        line-height: 35px;
        background-color: deepskyblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
    <h3><a href="${pageContext.request.contextPath}/book/allBook">进入书籍界面</a></h3>
  </body>
</html>
