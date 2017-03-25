<!-- <Research/MPHIL/Equivalent details form> -->

	<div id="qualInfo" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Qualification Details</h3>
  			<form>
  				<div class="form-group">
      				<label for="resPrograme">Programme Code(PHD&nbsp;/MPHIL&nbsp;/Equivalent):</label>
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
	