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
<table>
<tr>
	<td colspan="10">
		<form action="list">
			关键字搜索:<input type="text" name="name" value="${map.name }">
			资金范围:<input type="text" name="price" value="${map.price }">
			年检日期:<input type="date" name="btime">
			成立日期:<input type="date" name="etime">
			<input type="submit" value="提交">
		</form>
	</td>
</tr>
  <tr>
    <td>编号</td>
    <td>描述</td>
    <td>名称</td>
    <td>公司产品</td>
    <td>地址</td>
    <td>注册资金(万元)</td>
    <td>成立时间</td>
    <td>年检日期</td>
    <td>年检状态</td>
    <td>备注</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${plist.list }" var="p">
  <tr>
    <td>${p.id}</td>
    <td>${p.ms}</td>
    <td>${p.name}</td>
    <td>${p.cp}</td>
    <td>${p.adds}</td>
    <td>${p.price}</td>
    
    <td>
    <fmt:formatDate value="${p.btime}" pattern="yyyy-MM-dd"/>
  </td>
    <td><fmt:formatDate value="${p.etime}" pattern="yyyy-MM-dd"/></td>
    <td>${p.zt}</td>
    <td>${p.bz}</td>
    <td><a href="show?id=${p.id}">[年检]</a></td>
  </tr> 
  </c:forEach>
     <tr>
	 <td colspan="10">
	       当前${plist.pageNum}/${plist.pages}页，总${plist.total}记录，
	   <a href="list.do?pageNum=1">首页</a>
	   <a href="list.do?pageNum=${plist.hasPreviousPage?plist.prePage:1}">上一页</a><span><<<1 2 3>>></span>
	   <a href="list.do?pageNum=${plist.hasNextPage?plist.nextPage:plist.lastPage}">下一页</a>
	   <a href="list.do?pageNum=${plist.lastPage}">末页</a>
	</td>
</tr> 
</table>

</body>
</html>