<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
	<form action="<%=basePath%>helloworld/dologin" method="post"  enctype="multipart/form-data">
		用户名:<input type="text" name="username" /><br>
		密码:<input type="text" name="password" /><br>
		<!-- 测试图片:<input type="file" name="img" /> -->
		
		<input type="submit" value="登录" />
	</form>
</body>
</html>