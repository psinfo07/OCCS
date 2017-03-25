<!-- <Research/MPHIL/ etc Equivalent details form> -->

	<div id="qualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form action="#"   id="qform1">
  				<div class="form-group">
      				<label for="resPrograme">Program Code(PHD&nbsp;/MPHIL&nbsp;/Equivalent):</label>
      				<input type="text" class="form-control" name="resProgramme" maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="research">Institute Name:</label>
      				<input type="text" class="form-control" name="resInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="resDuration">Duration:</label>
      				<input type="text" class="form-control" name="resDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="resYear">Passing Year:</label>
      				<input type="text" class="form-control" name="resYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="resMarks">Marks Obtained:</label>	
      				<input type="text" class="form-control" name="resmarks" maxlength="15" placeholder="Marks Obtained">
    			</div>	
    			<div class="radio-inline">
      				<label><input type="radio" name="resCgpa" value="cgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="resCgpa" value="percentage">Percentage</label>
    			</div><br><br>
    			
    			
    			<div class="form-group">
      				<label for="pgProgram">Program Code(Postgraduate):</label>
      				<input type="text" class="form-control" name="pgProgram" maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="pgInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="pgInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="pgDuration">Duration:</label>
      				<input type="text" class="form-control" name="pgDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="pgYear">Passing Year:</label>
      				<input type="text" class="form-control" name="pgYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="pgMarks">Marks Obtained:</label>
      				<input type="text" class="form-control" name="pgMarks" maxlength="15" placeholder="Marks Obtained">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="pgCgpa" value="cgpa">CGPA</label>
    			</div>
 
    			<div class="radio-inline">
      				<label><input type="radio" name="pgCgpa" value="Percentage">Percentage</label>
    			</div><br><br> 			
    			<button id="resSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('gQualInfo').style.display='block';document.getElementById('qualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none'">Next</button>
   
  			</form>		
  	</div>
  	
  	
  	<!-- <Graduate/XIIth details form> -->

	<div id="gQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form action="#"   id="qform2">
  				<div class="form-group">
      				<label for="gPrograme">Programme Code(Graduation):</label>
      				<input type="text" class="form-control" name="gProgramme" maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="gInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="gInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="gDuration">Duration:</label>
      				<input type="text" class="form-control" name="gDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="gYear">Passing Year:</label>
      				<input type="text" class="form-control" name="gYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="gMarks">Marks Obtained:</label>
      				<input type="text" class="form-control" name="gMarks" maxlength="15" placeholder="Marks Obtained">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="gCgpa" value="cgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="gCgpa" value="Percentage">Percentage</label>
    			</div><br><br>
    			
    			<div class="form-group">
      				<label for="interProgramme">Program Code(XIIth/Other:):</label>
      				<input type="text" class="form-control" name="interProgramme" maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="interInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="interInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="interDivision">Duration:</label>
      				<input type="text" class="form-control" name="interDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="interYear">Passing Year:</label>
      				<input type="text" class="form-control" name="interYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="interMarks">Marks Obtained:</label>
      				<input type="text" class="form-control" name="interMarks" maxlength="15" placeholder="Marks Obtainedr">
    			</div>
    			<<div class="radio-inline">
      				<label><input type="radio" name="interCgpa" value="cgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="interCgpa" value="Percentage">Percentage</label>
    			</div><br><br>		
    			<button id="gSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='block';document.getElementById('certQualInfo').style.display='none'">Next</button>
    			</form>	
  	</div>
		

<!-- <Xth/Other details form> -->

	<div id="tenQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form action="#"   id="qform3">
  				
    			
    			<div class="form-group">
      				<label for="otherProgramme">Program Code(Diploma/Other):</label>
      				<input type="text" class="form-control" name="otherProgramme" maxlength="15" placeholder="Programme Code">
    			</div>
    			<div class="form-group">
      				<label for="otherInstitute">Institute Name:</label>
      				<input type="text" class="form-control" name="otherInstitute" maxlength="50" placeholder="Institute Name">
    			</div>
    			<div class="form-group">
      				<label for="otherDuration">Duration:</label>
      				<input type="text" class="form-control" name="otherDuration" maxlength="15" placeholder="Duration">
    			</div>
    			<div class="form-group">
      				<label for="otherYear">Passing Year:</label>
      				<input type="text" class="form-control" name="otherYear" maxlength="15" placeholder="Passing Year">
    			</div>
    			<div class="form-group">
      				<label for="otherMarks">Marks Obtained:</label>
      				<input type="text" class="form-control" name="otherMarks" maxlength="15" placeholder="Marks Obtained">
    			</div>
    			
    			<div class="radio-inline">
      				<label><input type="radio" name="otherCgpa" value="cgpa">CGPA</label>
    			</div>
    			<div class="radio-inline">
      				<label><input type="radio" name="otherCgpa" value="Percentage">Percentage</label>
    			</div><br><br>
    			
    			<div class="form-group">
      				<label for="tenPrograme">Xth Standard:</label>
      				<input type="text" class="form-control" name="tenProgramme" maxlength="15" placeholder="Programme Code">
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
    			<button id="tenSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='block'">Next</button>
  			</form>		
  	</div>

<!-- ghgh -->
<div id="certQualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Certification Details</h3>
  			<form action="#"   id="qform4">
  				<div class="form-group">
      				<label for="firstCertificate">First Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject1" maxlength="20" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration1" class="form-control" maxlength="15" placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="SecondCertification">Second Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject2" maxlength="20" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration2" class="form-control" maxlength="15" placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="third">Third Certification:</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject3" maxlength="20" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration3" class="form-control" maxlength="15" placeholder="Duration"></div>  
    				</div>
    			</div>
    			<div class="form-group">
      				<label for="fourth">Fourth Certification</label>
    	 			<div class="row">
  						<div class="col-sm-6"><input type="text" class="form-control" name="subject4" maxlength="20" placeholder="Subject"></div>
  						<div class="col-sm-6"><input type="text" name="duration4" class="form-control" maxlength="15" placeholder="Subject"></div>  
    				</div>
    			</div>
    			<h3>Field of Interest Details :</h3>
    			
    			<!-- <div class="form-group">
      				<label for="firstInterest">First Certification:</label>
    	 			<div class="row">
  						
  						<div class="col-sm-6"><input type="text" name="duration1" class="form-control"placeholder="Duration"></div>  
    				</div>
    			</div> -->
    			<div class="form-group">
						<label for="foi">Select Field of Interest 1 :</label>
							<select name="foi1" class="form-control">
							<option value="INVAL">None </option>
							<option value="sub01">Arts</option>
							<option value="sub02">Commerce</option>
							<option value="sub03">Computer Application</option>
							<option value="sub04">Design</option>
							<option value="sub05">Education and Training</option>
							<option value="sub06">Engineering</option>
							<option value="sub07">Forest</option>
							<option value="sub08">Hotel Management</option>
							<option value="sub09">Journalism</option>
							<option value="sub10">Law</option>
							<option value="sub11">Medical</option>
							<option value="sub12">Management</option>
							<option value="sub13">Farmacy</option>
							<option value="sub14">Science</option>
							<option value="sub15">Robotics</option>
							<option value="sub16">AI</option>
							<option value="sub17">Navy</option>
							<option value="sub18">Civil Services</option>
							<option value="sub19">Acting</option>
							<option value="sub20">Fashion Designing</option>
							</select>
						</div>
				<div class="form-group">
						<label for="foi">Select Field of Interest 2 :</label>
							<select name="foi2" class="form-control">
							<option value="INVAL">None</option>
							<option value="sub01">Arts</option>
							<option value="sub02">Commerce</option>
							<option value="sub03">Computer Application</option>
							<option value="sub04">Design</option>
							<option value="sub05">Education and Training</option>
							<option value="sub06">Engineering</option>
							<option value="sub07">Forest</option>
							<option value="sub08">Hotel Management</option>
							<option value="sub09">Journalism</option>
							<option value="sub10">Law</option>
							<option value="sub11">Medical</option>
							<option value="sub12">Management</option>
							<option value="sub13">Farmacy</option>
							<option value="sub14">Science</option>
							<option value="sub15">Robotics</option>
							<option value="sub16">AI</option>
							<option value="sub17">Navy</option>
							<option value="sub18">Civil Services</option>
							<option value="sub19">Acting</option>
							<option value="sub20">Fashion Designing</option>
							</select>
						</div>
    			<div class="form-group">
						<label for="foi">Select Field of Interest 3 :</label>
							<select name="foi3" class="form-control">
							<option value="INVAL">None</option>
							<option value="sub01">Arts</option>
							<option value="sub02">Commerce</option>
							<option value="sub03">Computer Application</option>
							<option value="sub04">Design</option>
							<option value="sub05">Education and Training</option>
							<option value="sub06">Engineering</option>
							<option value="sub07">Forest</option>
							<option value="sub08">Hotel Management</option>
							<option value="sub09">Journalism</option>
							<option value="sub10">Law</option>
							<option value="sub11">Medical</option>
							<option value="sub12">Management</option>
							<option value="sub13">Farmacy</option>
							<option value="sub14">Science</option>
							<option value="sub15">Robotics</option>
							<option value="sub16">AI</option>
							<option value="sub17">Navy</option>
							<option value="sub18">Civil Services</option>
							<option value="sub19">Acting</option>
							<option value="sub20">Fashion Designing</option>
							</select>
						</div>
				<div class="form-group">
						<label for="foi">Select Field of Interest 4 :</label>
							<select name="foi4" class="form-control">
							<option value="INVAL">None</option>
							<option value="sub01">Arts</option>
							<option value="sub02">Commerce</option>
							<option value="sub03">Computer Application</option>
							<option value="sub04">Design</option>
							<option value="sub05">Education and Training</option>
							<option value="sub06">Engineering</option>
							<option value="sub07">Forest</option>
							<option value="sub08">Hotel Management</option>
							<option value="sub09">Journalism</option>
							<option value="sub10">Law</option>
							<option value="sub11">Medical</option>
							<option value="sub12">Management</option>
							<option value="sub13">Farmacy</option>
							<option value="sub14">Science</option>
							<option value="sub15">Robotics</option>
							<option value="sub16">AI</option>
							<option value="sub17">Navy</option>
							<option value="sub18">Civil Services</option>
							<option value="sub19">Acting</option>
							<option value="sub20">Fashion Designing</option>
							</select>
						</div>
    			<button id="certSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none'">Submit</button>
  			</form>		
  	</div>
	
