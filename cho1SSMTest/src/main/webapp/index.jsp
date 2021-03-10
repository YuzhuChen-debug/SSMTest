<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <form action="student/add.do" method="post">
            姓名<input type="text" name="name"/><br>
            年龄<input type="text" name="age"/><br>
            <input type="submit" value="提交"/>
        </form>

        <a href="Student.jsp">查询学生列表</a>
</body>
</html>
