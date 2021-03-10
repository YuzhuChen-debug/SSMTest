<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="jquery/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function () {

        $("#btn").click(function () {
            searchStudent();
        })
        searchStudent();
    })
    function searchStudent() {
        $.ajax({
            url:"student/search.do",
            dataType:"json",
            type:"get",
            success:function (data) {
                //alert(data);
                var html = "";
                //处理返回的数据
                $.each(data,function (i,n) {
                    html += '<tr>';
                    html += '    <td>'+n.name+'</td>';
                    html += '    <td>'+n.age+'</td>';
                    html += '</tr>';
                })
                $("#tBody").html(html);
            }
        })
    }
</script>

<body>
        <div id="divBody" align="center">
                <table>
                    <thead>
                        <tr>
                            <td>姓名</td>
                            <td>年龄</td>
                        </tr>
                    </thead>
                    <tbody id="tBody">
                        <%--<tr>
                            <td>姓名</td>
                            <td>年龄</td>
                        </tr>--%>
                    </tbody>
                </table>

            <input type="button" id="btn">
        </div>
</body>
</html>
