<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div id="result" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Result</h3>
  			<form id="result_id">   			
    			
    			<div class="table-responsive">          
  					<table class="table">
    					<thead>
      						<tr>        
        						<th>General Field</th>
        						<th>Marks</th>   
      						</tr>
    					</thead>
    					<tbody>
      						<tr>        
					        	<td>Aptitude Score :</td>
        						<td><c:out value="${aptitude}" /></td>        
      						</tr>
      					</tbody>
  					</table>
      			</div>	        
    			<div class="table-responsive">          
  					<table class="table">
    					<thead>
      						<tr>        
        						<th>Interested Field</th>
        						<th>Marks</th>   
      						</tr>
    					</thead>
    					<tbody>
      						<tr>        
					        	<td><c:out value="${lSub1}:" /></td>
        						<td><c:out value="${scoreFoi1}" /></td>        
      						</tr>
      						<tr>        
					        	<td><c:out value="${lSub2}:" /></td>
        						<td><c:out value="${scoreFoi2}" /></td>        
      						</tr>
      						<tr>        
					        	<td><c:out value="${lSub3}:" /></td>
        						<td><c:out value="${scoreFoi3}" /></td>        
      						</tr>
      						<tr>        
					        	<td><c:out value="${lSub4}:" /></td>
        						<td><c:out value="${scoreFoi4}" /></td>        
      						</tr>
      						<tr>        
					        	<td>Field with maximum marks :</td>
        						<td><b></b><c:out value="${maxMarks}" /></b></td>        
      						</tr>      					
    					</tbody>
  					</table>
  				</div>    			    	
    			<div class="form-group">
      				<label for="email">Here By According to your test result we will prefer you to go for :<c:out value="${maxSubject}" /> </label>
      				<label>Some top colleges for you are :</label>
      				<label><c:out value="${collegeNames}" /></label>      				
    			</div>
    			<!-- <input type="submit" class="btn btn-default"  value="OK" /> -->
    			<button id="resultSub" type="button" class="btn btn-default" onclick=document.getElementById('result').style.display='none'>Ok</button>
  			</form>		
  	</div>
  	