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
				
		<!-- <center><p><font size="5"><b>News</b></font></p></center>
			<center><p><font size="2"><b>News not updated yet...</b></font></p></center>
			<center><p><font size="2"><b>Please Wait & Connect With us</b></font></p></center> -->
			
			
			
  <section id="content">
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
			    <h2>Contact us <small>get in touch with us by filling form below (or you can call us)</small></h2>
			    <hr class="colorgraph">
			    <div id="sendmessage">Your message has been sent. Thank you!</div>
                <div id="errormessage"></div>
                <form action="contact_user" method="post" role="form" class="contactForm">
                    
                   
                 <center><p><font size="5"><b>...Thank You...</b></font></p></center> 
                  <center><p><font size="5"><b>We will contact you soon</b></font></p></center>  
                   
                    
                  
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
		<!-- end divider -->
	
		<!-- Portfolio Projects -->
		<%-- <div class="container marginbot50">
		<div class="row">
			<div class="col-lg-12">
				<h4 class="heading">Recent Works</h4>

				<div id="filters-container" class="cbp-l-filters-button">
					<div data-filter="*" class="cbp-filter-item-active cbp-filter-item">All<div class="cbp-filter-counter"></div></div>
					<div data-filter=".identity" class="cbp-filter-item">Identity<div class="cbp-filter-counter"></div></div>
					<div data-filter=".web-design" class="cbp-filter-item">Web Design<div class="cbp-filter-counter"></div></div>
					<div data-filter=".graphic" class="cbp-filter-item">Graphic<div class="cbp-filter-counter"></div></div>
					<div data-filter=".logo" class="cbp-filter-item">Logo<div class="cbp-filter-counter"></div></div>
				</div>
				

				<div id="grid-container" class="cbp-l-grid-projects">
					<ul>
						<li class="cbp-item graphic">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/1.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
											<a href="img/works/1big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="Dashboard<br>by Paul Flavius Nechita">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">Dashboard</div>
							<div class="cbp-l-grid-projects-desc">Web Design / Graphic</div>
						</li>
						<li class="cbp-item web-design logo">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/2.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
											<a href="img/works/2big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="World Clock Widget<br>by Paul Flavius Nechita">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">World Clock Widget</div>
							<div class="cbp-l-grid-projects-desc">Logo / Web Design</div>
						</li>
						<li class="cbp-item graphic logo">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/3.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
										
											<a href="http://vimeo.com/14912890" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="To-Do Dashboard<br>by Tiberiu Neamu">view video</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">To-Do Dashboard</div>
							<div class="cbp-l-grid-projects-desc">Graphic / Logo</div>
						</li>
						<li class="cbp-item web-design graphic">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/4.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
										
											<a href="img/works/4big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="Events and  More<br>by Tiberiu Neamu">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">Events and More</div>
							<div class="cbp-l-grid-projects-desc">Web Design / Graphic</div>
						</li>
						<li class="cbp-item identity web-design">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/5.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
											
											<a href="img/works/5big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="WhereTO App<br>by Tiberiu Neamu">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">WhereTO App</div>
							<div class="cbp-l-grid-projects-desc">Web Design / Identity</div>
						</li>
						<li class="cbp-item identity web-design">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/6.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
											
											<a href="img/works/6big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="Ski * Buddy<br>by Tiberiu Neamu">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">Ski * Buddy</div>
							<div class="cbp-l-grid-projects-desc">Identity / Web Design</div>
						</li>
						<li class="cbp-item graphic logo">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/7.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
										
											<a href="img/works/7big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="Seemple* Music for iPad<br>by Tiberiu Neamu">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">Seemple* Music for iPad</div>
							<div class="cbp-l-grid-projects-desc">Graphic / Logo</div>
						</li>
						<li class="cbp-item graphic logo">
							<div class="cbp-caption">
								<div class="cbp-caption-defaultWrap">
									<img src="img/works/8.jpg" alt="" />
								</div>
								<div class="cbp-caption-activeWrap">
									<div class="cbp-l-caption-alignCenter">
										<div class="cbp-l-caption-body">
										
											<a href="img/works/8big.jpg" class="cbp-lightbox cbp-l-caption-buttonRight" data-title="Seemple* Music for iPad<br>by Tiberiu Neamu">view larger</a>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-l-grid-projects-title">Seemple* Music for iPad</div>
							<div class="cbp-l-grid-projects-desc">Graphic / Logo</div>
						</li>
					</ul>
				</div>
				
				<div class="cbp-l-loadMore-button">
					<a href="ajax/loadMore.html" class="cbp-l-loadMore-button-link">LOAD MORE</a>
				</div>

			</div> --%>
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