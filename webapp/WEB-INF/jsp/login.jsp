<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/script/jquery-1.9.1.min.js"/>
	<script type="text/javascript">
		function check(obj) {
			alert("hello");
			if(obj.j_username.value == "") {
				alert("请输入帐号！");
				return false;
			}
			if(obj.j_password.value == "") {
				alert("请输入密码！");
				return false;
			}
			return true;
		}
	</script>

  </head>
  
  <body>
   <!-- <form action="j_spring_security_check" method="post">
   	Account：<Input name="j_username"/><br/>
   	Password：<input name="j_password" type="password"/><br/>
   	<input value="submit" type="submit"/>
   </form> -->
   
   <form action="${pageContext.request.contextPath}/j_spring_security_check" method="post" onsubmit="return check(this);"  style="width:260px;text-align:center;">
  <fieldset>
    <legend>登陆</legend>
    用户： <input type="text" name="j_username" style="width:150px;" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}"/><br />
    密码： <input type="password" name="j_password" style="width:150px;" /><br />
    <input type="submit" value="登陆"/>
    <input type="reset" value="重置"/>
  </fieldset>
</form>
  </body>
</html>
