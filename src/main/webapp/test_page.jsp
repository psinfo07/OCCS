	<div id="test" class="container" style="display:none;width:40%;border-style:ridge">  		
  			<h3>Test</h3>
  			<form onload="myFunction()">
    			<div class="form-group">
      				<label for="opa1" id="qid">1.</label><label for="q1"></label>
      				<div class="radio">
						<label for="opa1">(a).</label><label><input type="radio" name="q1" value="a">Answer1</label>
					</div>
					<div class="radio">
						<label for="opb1">(b).</label><label><input type="radio" name="q1">Answer2</label>
					</div>
					<div class="radio">
						<label for="opc1">(c).</label><label><input type="radio" name="q1">Answer3</label>
					</div>
					<div class="radio">
						<label for="opd1">(d).</label><label><input type="radio" name="q1">Answer4</label>
					</div>
    			</div>
    			<!-- <button type="submit" class="btn btn-default">Next</button> -->
    			<button id="testSubmit" type="submit" class="btn btn-default" onclick="document.getElementById('qualInfo').style.display='none';document.getElementById('gQualInfo').style.display='none';document.getElementById('tenQualInfo').style.display='none';document.getElementById('certQualInfo').style.display='none';document.getElementById('test').style.display='none'">Next</button>
  			</form>		
  	</div>  	