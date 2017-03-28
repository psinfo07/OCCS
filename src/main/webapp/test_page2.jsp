<jsp:include page="header_login.jsp"/>
<jsp:include page="css_part.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<div id="test" class="container" style="width:40%;border-style:ridge">  		
  			<h3>Test</h3>
  			

  			<form  action="test_action" method="post">
    			<div class="form-group">
    				<input type="hidden" name="iPageNo" value="<c:out value="${iPageNo}" />">
					<input type="hidden" name="lPageNo" value="<c:out value="${lPageNo}" />">
					<input type="hidden" name="size" value="<c:out value="${size}" />">
					<%
					int i=0;
					if(null!=request.getAttribute("iPageNo")){
						i=Integer.parseInt(request.getAttribute("iPageNo").toString());
					}
					
					
					%>
					<c:forEach items="${questions}" var="data">
					<%i++; %>
      				<label for="opa1" id="qid"><%=i %>.<c:out value="${data.question}" /></label><label for="q1"></label>
      				<div class="radio">
						<label for="opa1">(a).</label><label><input type="radio" name="q<%=i %>" value="A"><c:out value="${data.option1}" /></label>
					</div>
					<div class="radio">
						<label for="opb1">(b).</label><label><input type="radio" name="q<%=i %>" value="B" ><c:out value="${data.option2}" /></label>
					</div>
					<div class="radio">
						<label for="opc1">(c).</label><label><input type="radio" name="q<%=i %>"  value="C" ><c:out value="${data.option3}" /></label>
					</div>
					<div class="radio">
						<label for="opd1">(d).</label><label><input type="radio" name="q<%=i %>"  value="D"><c:out value="${data.option4}" /></label>
					</div>
					<input type="hidden" name="sectorCode" value="<c:out value="${data.sectorCode}" />">
					</c:forEach>
    			</div>
    			<!-- <button type="submit" class="btn btn-default">Next</button> -->
    			<button id="testSubmit" type="submit" class="btn btn-default" >Next</button>
  			</form>		
  	</div>  	
<jsp:include page="footer_login.jsp"/>