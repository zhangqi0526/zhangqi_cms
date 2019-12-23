<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<form class="form-inline">
		<div class="form-group mx-sm-3 mb-2">
		    <input type="text" name="title" value="${comment.title }" class="form-control" placeholder="请输入昵称">
		  </div>
		<input type="hidden" name="pageNum" value="${pageInfo.pageNum }">
		<button type="button" class="btn btn-primary mb-2" onclick="query()">查询</button>
	</form> 
  	<table class="table">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">文章标题</th>
			<th scope="col">评论内容</th>
			<th scope="col">评论时间</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${pageInfo.list }" var="item">
			<tr>
				<th scope="row">${item.id }</th>
				<td>${item.title }</td>
				<td>${item.content }</td>
				<td>${item.created }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
 <jsp:include page="../common/page.jsp"></jsp:include>
<script>
	function gotoPage(pageNo){
		$("[name=pageNum]").val(pageNo);
		query();
	}
	function query(){
		var params = $("form").serialize();
		reload(params);
	}
</script>
