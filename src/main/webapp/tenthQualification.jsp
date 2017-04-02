<%-- <jsp:include page="header_login.jsp"/>
<jsp:include page="css_part.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty user}">
    <c:redirect url="index.jsp"/>
    
</c:if>
 --%>
		
		<%-- <!-- <Qualification Info Form> -->
	<jsp:include page="qualification_details.jsp"/> --%>
	<!-- <Xth/Other details form> -->

	<div id="qualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form action="tenth_servlet" id="tenthform" method="post">
  				    			    			
    			<div class="form-group">
      				<label for="tenPrograme">Xth Standard:</label>
      				<input type="text" class="form-control" name="tenProgramme"  maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="tenInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="tenInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="tenDuration">Duration:</label>
      				<input type="text" class="form-control" name="tenDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="tenYear">Passing Year:</label>
      				<input type="text" class="form-control" name="tenYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="tenMarks">Marks Obtained:</label>
      				<input type="text" class="form-control" name="tenMarks"  maxlength="15" placeholder="Marks Obtained">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="tenCgpa" value="cgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="tenCgpa" value="Percentage">Percentage</label>
    			</div><br><br>
    			<!-- <button id="tenSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='block'">Next</button> -->
    			<button id="tenSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='block'">Next</button>
  			</form>		
  	</div>
		
		
</section>
