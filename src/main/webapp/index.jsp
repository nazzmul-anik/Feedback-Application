<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="comp/links.jsp"%>
</head>
<body>
    <%@include file="header.jsp"%>

    <div class="content_container container d-flex flex-column justify-content-center align-items-center">
        <a href="<%=application.getContextPath()%>/feedback.jsp" class="btn btn-light">Give Us Feedback</a>
    </div>



<%--    <a href="hello-servlet">Hello Servlet</a>--%>
    <%@include file="comp/script.jsp"%>
</body>
</html>