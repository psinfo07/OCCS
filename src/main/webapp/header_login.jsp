	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	
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
						</div>										
						
						<div class="col-md-3">
							<ul class="topleft-info">
								<li><b><c:out value="${user.personalDetail.name}" /></b><span class="glyphicon glyphicon-user" style="color:green"></span></li>
								<li><a href="logout.form" style="color:green"><span class="glyphicon glyphicon-log-in" style="color:green"></span> LogOut</a></li>
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
                    <a class="navbar-brand" href="index.jsp"><img src="img/logo1.png" alt="" width="199" height="60" /></a>
                </div>
                <div class="navbar-collapse collapse ">
                	 <ul class="nav navbar-nav">
							<!-- <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Home</a><i class="fa fa-angle-down"></i> </a> -->
          					<!-- <ul class="home-menu">
                                <li><a href="template.jsp">Home</a></li>
                             </ul>   --> 
								
                            				
						<!-- nothing -->
                       
									
										<li><a href="logout.jsp">Login</a></li>							
                        <li><a href="contact.html">Contact</a></li>
                    </ul>    
                </div>
               
            </div>
        </div>
	</header>
	