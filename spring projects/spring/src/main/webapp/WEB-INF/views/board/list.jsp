<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<h1>게시글 리스트</h1>
	${list }
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<h1>게시글 타입 리스트</h1>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>타입</th>
				<th>게시글명</th>
				<th>읽기 권한</th>
				<th>쓰기 권한</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="bt" varStatus="vs">
				<tr>
					
						<td class="form-group">${bo.bo_num}</td>
						<td class="form-group">
							<a href="<c:url value='/board/detail'></c:url>">${bo.bo_title}</a>
						</td>
						<td>${bo.bo_me_id} </td>
						<td>${bo.bo_up}/${bo.bo_down}
						<td>${bo.bo_register_date_strß}</td>
						<td>${bo.bo_views}</td>
						
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
</div>
<script>
$('.btn-del').click(function(){
	let res = confirm('게시글 타입을 삭제하면 해당 게시글 타입에 있는 모든 게시글들이 삭됩니다.\n삭제하시겠습니까?');
	if(!res)
		return false;
	//클릭된 삭제 버튼의 조상 중에 form태그를 찾아서 action부분을 수정
	let url = '<c:url value="/admin/board/type/delete"></c:url>';
	$(this).parents('tr').find('form').attr('action', url);
});
</script>

	
	<c:if test="${user!=null }">
		<a href="<c:url value="/board/insert"></c:url>">
		<button class="btn btn-outline-primary btn-ins">글쓰기</button>
		</a>
	</c:if>
</div>
