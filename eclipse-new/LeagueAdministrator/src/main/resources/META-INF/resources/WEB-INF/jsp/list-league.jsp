<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Your Leagues are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Leagues}" var="league">
					<tr>
						<td>${league.desc}</td>
						<td><fmt:formatDate value="${league.targetDate}" pattern="dd/MM/yyyy"/></td>
						<td>${league.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-league?id=${league.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-league?id=${league.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-league">Add a league</a>
		</div>
	</div>
<%@ include file="common/footer.jspf" %>