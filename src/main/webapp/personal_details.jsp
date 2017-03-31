<div id="personalDetails" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Personal Info</h3>
  			<form action="update_user_details"  method="post">
    			<div class="form-group">
      				<label for="name">Name:</label>
      				<input type="text" class="form-control" name="name" value="${user.personalDetail.name}" placeholder="Enter Name">
    			</div>
    			<div class="form-group">
      				<label for="fName">Father's Name:</label>
      				<input type="text" class="form-control" name="fName" value="${user.personalDetail.fatherName}" placeholder="Father's Name">
    			</div>
    			<div class="form-group">
      				<label for="mName">Mother's Name:</label>
      				<input type="text" class="form-control" name="mName" value="${user.personalDetail.motherName}" placeholder="Mother's Name">
    			</div>
    			<div class="form-group">
      				<label for="mobile">Mobile:</label>
      				<input type="text" class="form-control" name="mobile" value="${user.personalDetail.mobileNo}" placeholder="Mobile No.">
    			</div>    			

				<div class="form-group">
 					<label for="House No.">Address Line 1:</label>
 					<input type="text" class="form-control" name="add1" value="${user.permanentAddress.addressLine1}" placeholder="Address Line1">
 				</div> 			
 				
 				<div class="form-group">
      				<label for="street">Address Line2</label>
      				<input type="text" class="form-control" name="add2" value="${user.permanentAddress.addressLine2}" placeholder="Address Line2">
    			</div>    			
 				<div class="form-group">
 					<label for="city">City:</label>
 					<input type="text" class="form-control" name="city" value="${user.permanentAddress.city}" placeholder="Enter City">
 				</div> 			
 				
 				<div class="form-group">
      				<label for="district">District:</label>
      				<input type="text" class="form-control" name="district" value="${user.permanentAddress.dist}" placeholder="Enter District">
    			</div>
    			<div class="form-group">
      				<label for="state">State:</label>
      				<input type="text" class="form-control" name="state" value="${user.permanentAddress.state}" placeholder="Enter State">
    			</div>
    			<div class="form-group">
      				<label for="pin">PIN:</label>
      				<input type="text" class="form-control" name="pin" value="${user.permanentAddress.pin}" placeholder="Enter PIN">
    			</div>    			
 				
    			<button type="submit" class="btn btn-default">Submit</button>				
  			</form>		
  	</div>