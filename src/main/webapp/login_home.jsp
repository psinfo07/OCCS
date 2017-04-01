<jsp:include page="header_login.jsp"/>
<jsp:include page="css_part.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty user}">
    <c:redirect url="index.jsp"/>
    
</c:if>


<section id="content">

	<div class="container myScrolling">
		<div class="row">
			<div class="col-lg-12">
				<div class="text-center">
					<!-- <h2>We use <span class="highlight">modern</span> infrastructure & technology</h2> -->					
					<!-- <p>Lorem ipsum dolor sit amet, ne duis posse mei, ut cum vero nominati. Sed graece aeterno consectetuer te. Cu duo tota deleniti, vis ea fuisset nostrum. Meliore inciderint qui ne. Suas cotidieque vel ut  ei eros perpetua qui. Ponderum lobortis reformidans</p> -->
				</div>
			</div>		
		</div>
		</div>		
		<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
					<div class="col-sm-3 col-md-3 col-lg-3">
						<div class="box">
							<div class="aligncenter">								
								<div class="icon">
									<a href="#" class="btn btn-defaylt" role="button" onclick="document.getElementById('personalDetails').style.display='block';document.getElementById('qualInfo').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='none'"><i class="fa fa-desktop fa-5x" style="color:gray"></i></a>
								</div>
								<h4 style=" color:gray"><b>PERSONAL INFO</b></h4>
							</div>
						</div>
					</div>
					<div class="col-sm-3 col-md-3 col-lg-3">
						<div class="box">
							<div class="aligncenter">								
								<div class="icon">
									<a href="#" class="btn btn-defaylt" role="button" onclick="document.getElementById('qualInfo').style.display='block';document.getElementById('personalDetails').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none'"><i class="fa fa-file-code-o fa-5x" style="color:gray"></i></a>
								</div>
								<h4 style="color:gray"><b>QUALIFICATION DETAILS</b></h4>
							</div>
						</div>
					</div>
					<div class="col-sm-3 col-md-3 col-lg-3">
						<div class="box">
							<div class="aligncenter">								
								<div class="icon">
								<form action="test_action" method="post">
									<!-- <a href="#" class="btn btn-defaylt" role="button" id="questionId" onclick="document.getElementById('test').style.display='block';document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('result').style.display='none';"><i class="fa fa-paper-plane-o fa-5x" style="color:gray"></i></a> -->
								   
									<!-- <input type="submit" value="Test" class="btn btn-defaylt fa fa-paper-plane-o fa-5x"> --> 
									<button type="submit" class="btn btn-defaylt" style="background-color: white"><i class="fa fa-paper-plane-o fa-5x" style="color:gray"></i></button>
								</form>
								</div>
								<h4 style=" color:gray"><b>TEST</b></h4>
							</div>
						</div>
					</div>
					<div class="col-sm-3 col-md-3 col-lg-3">
						<div class="box">
							<div class="aligncenter">								
								<div class="icon">
								<form action="result_action" method="post">
									<!-- <a href="#" class="btn btn-defaylt" role="button" onclick="document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='block'"><i class="fa fa-cubes fa-5x" style="color:gray"></i></a> -->
								
									<!-- <input type="submit" value="Result" class="btn btn-defaylt fa fa-cubes fa-5x"> -->
									<button type="submit" class="btn btn-defaylt" style="background-color: white"><i class="fa fa-cubes fa-5x" style="color:gray"></i></button>
								</form>
									
									
								</div>
								<h4 style="color:gray"><b>Result</b></h4>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		
		<!-- divider -->
		<!-- <div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		</div> -->
		
<!-- <Personal Info Form> -->		


	
	<jsp:include page="personal_details.jsp" />
		
<!-- <Qualification Info Form> -->
	<jsp:include page="qualification_details.jsp"/>	
		
  	<!-- <Test/Exam Form> -->
  		<jsp:include page="test_page.jsp"/>
		<%-- <jsp:include page="test_page.jsp" /> --%>
  			
<!-- <Result Form> -->					
	<jsp:include page="result.jsp"/>
  	
</section>

<jsp:include page="footer_login.jsp"/>

<script>
$("#qform1").submit(function(){
		$.post('sqdform1', $("#qform1").serialize(),
				function( data ) {
						if(data=="SUCCESS"){
							document.getElementById('gQualInfo').style.display='block';document.getElementById('qualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none';
						}else{
							//$("#failuremsg").text("Invalid UserName/Password !!!");
						}
							
		});
	return false;
	
});

$("#qform2").submit(function(){
$.post('sqdform2', $("#qform2").serialize(),
		function( data ) {
				if(data=="SUCCESS"){
					document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='block';document.getElementById('certQualInfo').style.display='none'
				}else{
					//$("#failuremsg").text("Invalid UserName/Password !!!");
				}
					
});
return false;

});
$("#qform3").submit(function(){
$.post('sqdform3', $("#qform3").serialize(),
		function( data ) {
				if(data=="SUCCESS"){
					document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='block'
				}else{
					//$("#failuremsg").text("Invalid UserName/Password !!!");
				}
					
});
return false;

});
$("#qform4").submit(function(){
$.post('sqdform4', $("#qform4").serialize(),
		function( data ) {
				if(data=="SUCCESS"){
					document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none';
				}else{
					//$("#failuremsg").text("Invalid UserName/Password !!!");
				}
					
});
return false;

}); 

/* $("#result_id").click(function(){
	$.post('result_action',
			function( data="SUCCESS" ){debugger;
			document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='block';	
			alert(data);
			
		});
		return false;
	});
  */
	
</script>

<c:if test="${!empty scoreFoi1}">
   <script>
   document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='block';
   </script>
    
</c:if>
