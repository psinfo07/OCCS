<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="result" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Result</h3>
  			<form action="#" method="post" id="result_id">
    			<div class="form-group">
      				<label for="email">Personality : </label><label><c:out value="${scoreFoi1}" /></label>      				
    			</div>
    			<div class="form-group">
      				<label for="email">Aptitude : </label><label><c:out value="${scoreFoi2}" /></label>      				
    			</div>
    			<div class="form-group">
      				<label for="email">Reasning : </label><label><c:out value="${scoreFoi3}" /></label>      				
    			</div>
    			<div class="form-group">
      				<label for="email">Computer : </label><label><c:out value="${scoreFoi4}" /></label> 				
    			</div>
    			<input type="submit" class="btn btn-default"  value="OK" />
  			</form>		
  	</div>
  	