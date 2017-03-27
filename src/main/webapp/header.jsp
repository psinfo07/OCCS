	<header>
			<div class="top">
				<div class="container">
					<div class="row">
						<div class="col-md-4">
							<ul class="topleft-info">
								<li><i class="fa fa-phone"></i> +91 8893304330</li>
							</ul>							
						</div>																
						<div class="col-md-5">
						<div id="sb-search" class="sb-search">
							<form>
								<input class="sb-search-input" placeholder="Enter your search term..." type="text" value="" name="search" id="search">
								<input class="sb-search-submit" type="submit" value="">
								<span class="sb-icon-search" title="Click to start searching"></span>								
							</form>							
						</div>
						</div>										
						
						<div class="col-md-3">
							<ul class="topleft-info">
								<li><a href="#" data-toggle="modal" data-target="#signUp" style="color:green"><span class="glyphicon glyphicon-user" style="color:green"></span> Sign Up</a></li>
								<li><a href="#" data-toggle="modal" data-target="#myModal" style="color:green"><span class="glyphicon glyphicon-log-in" style="color:green"></span> Login</a></li>
							</ul>							
						</div>																
						
					</div>
				</div>
			</div>	
			
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="img/logo.png" alt="" width="199" height="52" /></a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li class="dropdown active">
							<a href="index.jsp" class="dropdown-toggle "  data-delay="0" data-close-others="false">Home </i></a>
						</li>
                       <!--  <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Features <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="typography.html">Typography</a></li>
                                <li><a href="components.html">Components</a></li>
								<li><a href="pricing-box.html">Pricing box</a></li>
								<li class="dropdown-submenu">
									<a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown">Pages</a>
									<ul class="dropdown-menu">
										<li><a href="fullwidth.html">Full width</a></li>
										<li><a href="right-sidebar.html">Right sidebar</a></li>
										<li><a href="left-sidebar.html">Left sidebar</a></li>
										<li><a href="comingsoon.html">Coming soon</a></li>
										<li><a href="search-result.html">Search result</a></li>
										<li><a href="404.html">404</a></li>
										<li><a href="register.html">Register</a></li>
										<li><a href="login.html">Login</a></li>
									</ul>	
								</li>
                            </ul>
                        </li> -->
                       <!--  <li><a href="portfolio.html">PROFILE</a></li> -->
                        <li class="dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">INSTITUTES <i class="fa fa-angle-down"></i></a>
							<ul class="dropdown-menu">
                                <li><a href="https://www.careerguide.com/institutes/engineering-colleges-of-india"  target="_blank">ENGINEERING COLLEGES</a></li>
                                <li><a href="https://www.careerguide.com/institutes/b-schools-of-india"  target="_blank">BUSSINESS COLLEGES</a></li>
								<li><a href="https://www.careerguide.com/institutes/medical-colleges-of-india"  target="_blank">MEDICAL COLLEGES</a></li>
								<li><a href="https://www.careerguide.com/institutes/law-colleges-of-india"  target="_blank">LAW COLLEGES</a></li>
                            </ul>
						</li>
                        <li><a href="contact.jsp">Contact</a></li>
                        <li><a href="about.jsp">About</a></li>
                    </ul>
                </div>
            </div>
        </div>
        
        
        <!-- <SignUp PopUp> -->
	
	<div class="modal fade" id="signUp" role="dialog">
		<div class="modal-dialog">    
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" style="color:green">
						<span class="glyphicon glyphicon-user" style="color:green"></span> Sign Up
					</h4>
				</div>
				<div class="modal-body" style="color:green">          		  
					<form action="create_user" autocomplete="off" method="post"  id="regForm">
						<div class="form-group">
							<label for="name">Name:</label>
							<input type="text" class="form-control" name="name" id="name" maxlength="30" placeholder="Enter Name" required="required">
						</div>
						<div class="form-group">
							<label for="email">Email:</label>
							<input type="email" class="form-control" name="email" id="email" maxlength="30" placeholder="Enter email" required="required">
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label>
							<input type="password" class="form-control" name="password" id="pwd" maxlength="15" placeholder="Enter password" required="required">
						</div>
						<div class="form-group">
							<label for="cpwd">Confirm Password:</label>
							<input type="password" class="form-control" name="cpassword" id="cpwd" maxlength="15" placeholder="Confirm password"required="required">
						</div>
						<div class="form-group">
						<label for="edubox">Select Highest Education:</label>
							<select name="hqualification" class="form-control">
							<option value="INVAL">-- Highest Qualification -- </option>
							<option value="catid01"> Working Professional </option>
							<option value="catid02"> Post Graduate </option>
							<option value="catid03"> Graduate/Diploma </option>
							<option value="catid04"> XIIth Grade </option>
							<option value="catid05"> Xth Grade </option>
							<option value="catid06"> Other </option>
							</select>
							<!-- <input type="text" class="form-control" id="hEducation" placeholder="Enter Higher Education"> -->
						</div>
						<!--div class="checkbox">
							<label><input type="checkbox"> Remember me</label>
						</div-->
						<input type="submit" class="btn btn-default" value="Register" /> 
					</form>	  
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>
	
	<!-- <Login PopUp> -->
	
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">    
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" style="color:green">
						<span class="glyphicon glyphicon-log-in" style="color:green"></span> Login
						<span id="failuremsg" style="color:red"></span>
					</h4>
				</div>
				<div class="modal-body" style="color:green">          		  
					<form action="#"  autocomplete="off"  method="post" id="loginForm">  
						<div class="form-group">
							<label for="email">Email:</label>
							<input type="email" class="form-control" name="email" id="email" placeholder="Enter email">
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label>
							<input type="password" class="form-control"  name="password" id="pwd" placeholder="Enter password">
						</div>
						<div class="checkbox">
							<label><input type="checkbox">Remember me</label>
						</div>
						<input type="submit" class="btn btn-default" value="Submit" />
					</form>	 
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>
	
	
<script>
$("#loginForm").submit(function(){debugger;
		$.post('user_login', $("#loginForm").serialize(),
				function( data ) {
						if(data=="SUCCESS"){
							window.location.href="login_home.jsp";
						}else{
							$("#failuremsg").text("Invalid UserName/Password !!!");
						}
							
		});
	return false;
	
});
</script>

</header>
	