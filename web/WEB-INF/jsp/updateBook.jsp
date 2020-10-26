<%--
  Created by IntelliJ IDEA.
  User: 张土生
  Date: 2020/4/26
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row-clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${Qbooks.bookID}"/>
        书籍名称：<input type="text" name="bookName" value="${Qbooks.bookName}" class="form-control">
        书籍数量：<input type="text" name="bookCounts" value="${Qbooks.bookCounts}" class="form-control">
        书籍详情：<input type="text" name="detail" value="${Qbooks.detail}" class="form-control">
        <input type="submit" value="修改">
    </form>

</div>

</body>
</html>
