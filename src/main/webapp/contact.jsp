<!DOCTYPE html>
<html lang="en">
	<jsp:include page="css_part.jsp" />
<body>

<div id="wrapper">
	<!-- start header -->
	<jsp:include page="header.jsp" />
	<!-- end header -->
	<section id="featured" class="bg">
	</section>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
	
  <section id="content">
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
			    <h2>Contact us <small>get in touch with us by filling form below (or you can call us)</small></h2>
			    <hr class="colorgraph">
			    <div id="sendmessage">Your message has been sent. Thank you!</div>
                <div id="errormessage"></div>
                <form action="contact_user" method="post" role="form" class="contactForm">
                    <div class="form-group">
                        <input type="text" name="name" class="form-control" id="name" maxlength="30" placeholder="Your Name" required="required" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                        <div class="validation"></div>
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="email" id="email" maxlength="30" placeholder="Your Email" required="required" data-rule="email" data-msg="Please enter a valid email" />
                        <div class="validation"></div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="subject" id="subject" maxlength="200" placeholder="Subject" required="required" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                        <div class="validation"></div>
                    </div>
                    <div class="form-group">
                        <textarea class="form-control" name="message" maxlength="500" rows="5" required="required" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                        <div class="validation"></div>
                    </div>
                    
                    <div
                     class="text-center"><button type="submit" class="btn btn-theme btn-block btn-md">Send Message</button>
                    </div>
                </form>
                <hr class="colorgraph">

			</div>
		</div>
	</div>
	</section>
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
		<!-- end divider -->
		
		<!-- clients -->
		<div class="container">
				<div class="row">
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="http://www.aicte-india.org/"  target="_blank">
									<img alt="logo" src="img/clients/1.png" class="img-responsive" />
									</a>
								</div>											
													
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="http://www.i4c.co.in/"  target="_blank">
									<img alt="logo" src="img/clients/2.png" class="img-responsive" />
									</a>
								</div>											
													
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="https://www.persistent.com/"  target="_blank">
									<img alt="logo" src="img/clients/3.png" class="img-responsive" />
									</a>
								</div>											
													
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="http://www.nic.in/"  target="_blank">
									<img alt="logo" src="img/clients/4.png" class="img-responsive" />
									</a>
								</div>									
								
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="https://www.mygov.in/"  target="_blank">
									<img alt="logo" src="img/clients/5.png" class="img-responsive" />
									</a>
								</div>									
								<div class="col-xs-6 col-md-2 aligncenter client">
									<a href="http://mhrd.gov.in/"  target="_blank">
									<img alt="logo" src="img/clients/6.png" class="img-responsive" />
									</a>
								</div>	

				</div>
		</div>
				<jsp:include page="footer.jsp" />
				<div class="modal-footer"></div>
</body>
</html>