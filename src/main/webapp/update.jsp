<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="update" method="post">
	<p>编号:<input type="text" name="id" value="${car.id }"></p>
	<p>描述:<input type="text" name="ms" value="${car.ms }"></p>
	<p>名称:<input type="text" name="NAME" value="${car.name }"></p>
	<p>公司产品:<input type="text" name="cp" value="${car.cp }"></p>
	<p>地址:<input type="text" name="adds" value="${car.adds }"></p>
	<p>注册资金(万元):<input type="text" name="price" value="${car.price }"></p>
	<p>成立时间:<input type="text" name="btime" value="${car.btime }">
	</p>
	<p>年检日期:<input type="text" name="etime" value="${car.etime }"></p>
	<p>年检状态:<select><option>请选择</option>
		<option>通过</option>
		<option>未通过</option>
	</select></p>
	<p>备注:<input type="text" name="bz" value="${car.bz }"></p>
	<input type="submit" value="提交" onclick="aa()">
	                                           
</form>
<script type="text/javascript">
function aa(){
	alert("审核通过")
}
</script>
</body>
</html>