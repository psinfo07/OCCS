<jsp:include page="header_login.jsp"/>
<jsp:include page="css_part.jsp"/>

<section id="content">

	<div class="container">
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
									<a href="#" class="btn btn-defaylt" role="button" onclick="document.getElementById('test').style.display='block';document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('result').style.display='none'"><i class="fa fa-paper-plane-o fa-5x" style="color:gray"></i></a>
								</div>
								<h4 style=" color:gray"><b>TEST</b></h4>
							</div>
						</div>
					</div>
					<div class="col-sm-3 col-md-3 col-lg-3">
						<div class="box">
							<div class="aligncenter">								
								<div class="icon">
									<a href="#" class="btn btn-defaylt" role="button" onclick="document.getElementById('personalDetails').style.display='none';document.getElementById('qualInfo').style.display='none';document.getElementById('test').style.display='none';document.getElementById('result').style.display='block'"><i class="fa fa-cubes fa-5x" style="color:gray"></i></a>
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
		<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		</div>
		
<!-- <Personal Info Form> -->			
	<div id="personalDetails" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Personal Info</h3>
  			<form>
    			<div class="form-group">
      				<label for="name">Name:</label>
      				<input type="text" class="form-control" name="name" placeholder="Enter Name">
    			</div>
    			<div class="form-group">
      				<label for="fName">Father's Name:</label>
      				<input type="text" class="form-control" name="fName" placeholder="Father's Name">
    			</div>
    			<div class="form-group">
      				<label for="mName">Mother's Name:</label>
      				<input type="text" class="form-control" name="mName" placeholder="Mother's Name">
    			</div>
    			<div class="form-group">
      				<label for="mobile">Mobile:</label>
      				<input type="text" class="form-control" name="mobile" placeholder="Mobile No.">
    			</div>    			

				<div class="form-group">
 					<label for="House No.">Address:</label>
 					<input type="text" class="form-control" placeholder="Enter House No">
 				</div> 			
 				
 				<div class="form-group">
      				<label for="street">Street:</label>
      				<input type="text" class="form-control" name="street" placeholder="Enter Street">
    			</div>    			
 				<div class="form-group">
 					<label for="city">City:</label>
 					<input type="text" class="form-control" placeholder="Enter City">
 				</div> 			
 				
 				<div class="form-group">
      				<label for="district">District:</label>
      				<input type="text" class="form-control" name="district" placeholder="Enter District">
    			</div>
    			<div class="form-group">
      				<label for="state">State:</label>
      				<input type="text" class="form-control" name="state" placeholder="Enter State">
    			</div>
    			<div class="form-group">
      				<label for="pin">PIN:</label>
      				<input type="text" class="form-control" name="pin" placeholder="Enter PIN">
    			</div>    			
 				
    			<button type="submit" class="btn btn-default">Submit</button>				
  			</form>		
  	</div>
		
<!-- <Qualification Info Form> -->

<!-- <Research/MPHIL/Equivalent details form> -->

	<div id="qualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form>
  				<div class="form-group">
      				<label for="resPrograme">Programme Code(PHD/MPHIL/Equivalent):</label>
      				<input type="text" class="form-control" name="resProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="research">Institute Name:</label>
      				<input type="text" class="form-control" name="resInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="resDivision">Division:</label>
      				<input type="text" class="form-control" name="resDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="resYear">Passing Year:</label>
      				<input type="text" class="form-control" name="resYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="resCgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="resPercentage">Percentage</label>
    			</div><br><br>
    			
    			<div class="form-group">
      				<label for="pgProgramme">Programme Code(Postgraduate):</label>
      				<input type="text" class="form-control" name="pgProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="pgInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="pgInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="pgDivision">Division:</label>
      				<input type="text" class="form-control" name="pgDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="pgYear">Passing Year:</label>
      				<input type="text" class="form-control" name="pgYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="pgCgpa">CGPA</label>
    			</div>
    			<form>
    			<div class="radio-inline">
      				<label><input type="radio" name="pgPercentage">Percentage</label>
    			</div><br><br> 			
    			<button id="resSubmit" type="button" class="btn btn-default" onclick="document.getElementById('gQualInfo').style.display='block';document.getElementById('qualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none'">Next</button>
    			</form>
  			</form>		
  	</div>
  	
  	
  	<!-- <Graduate/XIIth details form> -->

	<div id="gQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form>
  				<div class="form-group">
      				<label for="gPrograme">Programme Code(Graduation):</label>
      				<input type="text" class="form-control" name="gProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="gInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="gInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="gDivision">Division:</label>
      				<input type="text" class="form-control" name="gDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="gYear">Passing Year:</label>
      				<input type="text" class="form-control" name="gYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="gCgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="gPercentage">Percentage</label>
    			</div><br><br>
    			
    			<div class="form-group">
      				<label for="interProgramme">Programme Code(Postgraduate):</label>
      				<input type="text" class="form-control" name="interProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="interInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="interInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="interDivision">Division:</label>
      				<input type="text" class="form-control" name="interDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="interYear">Passing Year:</label>
      				<input type="text" class="form-control" name="interYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="interCgpa">CGPA</label>
    			</div>
    			<form>
    			<div class="radio-inline">
      				<label><input type="radio" name="interPercentage">Percentage</label>
    			</div><br><br> 			
    			<button id="gSubmit" type="button" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='block';document.getElementById('certQualInfo').style.display='none'">Next</button>
    			</form>
  			</form>		
  	</div>
		

<!-- <Xth/Other details form> -->

	<div id="tenQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form>
  				<div class="form-group">
      				<label for="tenPrograme">Xth/Other:</label>
      				<input type="text" class="form-control" name="tenProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="tenInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="tenInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="tenDivision">Division:</label>
      				<input type="text" class="form-control" name="tenDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="tenYear">Passing Year:</label>
      				<input type="text" class="form-control" name="tenYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="tenCgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="tenPercentage">Percentage</label>
    			</div><br><br>
    			
    			<div class="form-group">
      				<label for="otherProgramme">Programme Code(Postgraduate):</label>
      				<input type="text" class="form-control" name="otherProgramme" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="otherInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="otherInstitute" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="otherDivision">Division:</label>
      				<input type="text" class="form-control" name="otherDivision" placeholder="Division">
    			</div>
    			<div class="form-group">
      				<label for="otherYear">Passing Year:</label>
      				<input type="text" class="form-control" name="otherYear" placeholder="Passing Year">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="otherCgpa">CGPA</label>
    			</div>
    			<form>
    			<div class="radio-inline">
      				<label><input type="radio" name="otherPercentage">Percentage</label>
    			</div><br><br> 			
    			<button id="tenSubmit" type="button" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='block'">Next</button>
    			</form>
  			</form>		
  	</div>
		
	<!-- <Certification details form> -->

	<div id="certQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Certification Details</h3>
  			<form>
  				<div class="form-group">
      				<label for="firstCertificate">First Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject1" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration1" class="form-control"placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="SecondCertification">Second Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject1" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration2" class="form-control" placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="third">Third Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject3" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration3" class="form-control" placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="fourth">Fourth Certification</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject4" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration4" class="form-control" placeholder="Subject"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="fourth">Fourth Certification</label>
    	 			
    			</div>
    			<button id="certSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none'">Submit</button>
  			</form>		
  	</div>
	
		
	<!-- <Test/Exam Form> -->

	<div id="test" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Test</h3>
  			<form>
    			<div class="form-group">
      				<label for="email">Email:</label>
      				<input type="email" class="form-control" id="email" placeholder="Enter email">
    			</div>
    			<div class="form-group">
      				<label for="pwd">Password:</label>
      				<input type="password" class="form-control" id="pwd" placeholder="Enter password">
    			</div>
    			<div class="checkbox">
      				<label><input type="checkbox"> Remember me</label>
    			</div>
    			<button type="submit" class="btn btn-default">Submit</button>
  			</form>		
  	</div>
		
<!-- <Result Form> -->					
	<div id="result" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Result</h3>
  			<form>
    			<div class="form-group">
      				<label for="email">Email:</label>
      				<input type="email" class="form-control" id="email" placeholder="Enter email">
    			</div>
    			<div class="form-group">
      				<label for="pwd">Password:</label>
      				<input type="password" class="form-control" id="pwd" placeholder="Enter password">
    			</div>
    			<div class="checkbox">
      				<label><input type="checkbox"> Remember me</label>
    			</div>
    			<button type="submit" class="btn btn-default">Submit</button>
  			</form>		
  	</div>
  	
</section>

<jsp:include page="footer.jsp"/>