
<!DOCTYPE HTML>
<html>
	<head>
		<title>Voyage Website Template | Home :: w3layouts</title>
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		     <link rel="stylesheet" type="text/css" href="css/style4.css" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
		<script src="js/jquery.min.js"></script>
		<!---script---->
		<link rel="stylesheet" href="css/jquery.bxslider.css" type="text/css" />
		<script src="js/jquery.bxslider.js"></script>
			<script type="text/javascript">
				$(document).ready(function(){
					$('.bxslider').bxSlider({
						 auto: true,
 						 autoControls: true,
						 minSlides: 4,
						 maxSlides: 4,
						 slideWidth:450,
						 slideMargin: 10
					});
				});
			</script>
		<!---//script---->
		<!---smoth-scrlling---->
			<script type="text/javascript">
				$(document).ready(function(){
									$('a[href^="#"]').on('click',function (e) {
									    e.preventDefault();
									    var target = this.hash,
									    $target = $(target);
									    $('html, body').stop().animate({
									        'scrollTop': $target.offset().top
									    }, 1000, 'swing', function () {
									        window.location.hash = target;
									    });
									});
								});
				</script>
		<!---//smoth-scrlling---->
		<!----start-top-nav-script---->
		<script type="text/javascript" src="js/flexy-menu.js"></script>
		<script type="text/javascript">$(document).ready(function(){$(".flexy-menu").flexymenu({speed: 400,type: "horizontal",align: "right"});});</script>
		<!----//End-top-nav-script---->
		<!---webfonts---->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
		<!---webfonts---->
		<!--start slider -->
	    <link rel="stylesheet" href="css/fwslider.css" media="all">
		<script src="js/jquery-ui.min.js"></script>
		<script src="js/css3-mediaqueries.js"></script>
		<script src="js/fwslider.js"></script>
		<!--end slider -->
		<!---calender-style---->
		<link rel="stylesheet" href="css/jquery-ui.css" />
		<!---//calender-style---->
		
	</head>
	<body>
		<!----start-wrap---->
			<!----start-top-header----->
			<div class="top-header" id="header">
				<div class="wrap">
				<div class="top-header-left">
					<ul>
						<li><a href="#"><span> </span> Member Login</a></li>
						<li><a href="login.html"><span> </span> Agent Login</a></li>
						<li><p><span> </span>Not a Member ? </p>&nbsp;<a class="reg" href="register.html"> Register</a></li>
						<li><p class="contact-info">Call Us Now :805-484-6263</p></li>
						<div class="clear"> </div>
					</ul>
				</div>
				<div class="top-header-right">
					<ul>
						<li><a class="face" href="#"><span> </span></a></li>
						<li><a class="twit" href="#"><span> </span></a></li>
						<li><a class="thum" href="#"><span> </span></a></li>
						<li><a class="pin" href="#"><span> </span></a></li>
						<div class="clear"> </div>
					</ul>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
			<!----//End-top-header----->
			<!---start-header---->
			<div class="header">
				<div class="wrap">
				<!--- start-logo---->
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" title="voyage" /></a>
				</div>
				<!--- //End-logo---->
				<!--- start-top-nav---->
				<div class="top-nav">
						<ul class="flexy-menu thick orange">
							<li class="active"><a href="index.html">Home</a></li>
							<li><a href="destinations.html">Profile </a>
								<ul>
								<li><a href="#">My Profile</a></li>
								<li><a href="EditInfoServlet?fn=Nikita">Edit Profile</a></li>
								<li><a href="#">Dropdown item</a>
									<ul>
										<li><a href="#">Dropdown item</a></li>
										<li><a href="#">Dropdown item</a>
											<ul>
												<li><a href="#">Dropdown item</a></li>
												<li><a href="#">Dropdown item</a></li>
												<li><a href="#">Dropdown item</a></li>
												<li><a href="#">Dropdown item</a></li>
											</ul>
										</li>
										<li><a href="#">Dropdown item</a></li>
										<li><a href="#">Dropdown item</a></li>
									</ul>
								</li>
								<li><a href="#">Dropdown item</a></li>
								<li><a href="#">Dropdown item</a></li>
							</ul>
							</li>
							<li><a href="criuses.html">Criuses</a></li>
							<li><a href="destinations.html">Specials</a></li>
							<li><a href="destinations.html">Holidays</a></li>
							<li><a href="blog.html">Blog</a></li>
						</ul>
						<div class="search-box">
							<div id="sb-search" class="sb-search">
								<form>
									<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
									<input class="sb-search-submit" type="submit" value="">
									<span class="sb-icon-search"> </span>
								</form>
							</div>
						</div>
						<!----search-scripts---->
						<script src="js/modernizr.custom.js"></script>
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
						<!----//search-scripts---->
				</div>
				<!--- //End-top-nav---->
				<div class="clear"> </div>
			</div>
			<!---//End-header---->
		</div>
		
		
		
		
		
		   <div class="criuse-info">
										<div class="criuse-info-left">
											<ul>
												<li><a class="c-hotel" href="#"><span> </span>My way </a></li>
												<input type="text" value="${param.way }" name="">
												<li><a class="c-air" href="#"><span> </span> Where</a></li>
												<input type="text" value="${param.destination }" name="">
												<li><a class="c-fast" href="#"><span> </span>When</a></li>
												<input type="text" value="${param.date }" name="">
												<li><a class="c-car" href="#"><span> </span> Type</a></li>
												<input type="text" value="${param.type }" name="">
												<li><a class="c-car" href="#"><span> </span> Adult</a></li>
												<input type="text" value="${param.adults}" name="">
												<li><a class="c-car" href="#"><span> </span> Children</a></li>
												<input type="text" value="${param.children }" name="">
												<li><a class="c-car" href="#"><span> </span> Infant</a></li>
												<input type="text" value="${param.infant }" name="">
												<li><a class="c-car" href="#"><span> </span> Flight Class</a></li>
												<input type="text" value="${param.Fclass }" name="">
												<li> <span><input type="button"  value="Modify" onclick=""> </span></li>
												
												<div class="clear"> </div>
											</ul>
										</div>
										
										<div class="clear"> </div>
									</div>
		
		
		
		
		
		

    
		
		
		
		
		
		
				
		
		
		
		
		
		
				</div>
				
		
		
		
		
		
		
		
		<div class="header">
				<div class="wrap">
			
		
		   <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                         
                                <p class="signin button"> <div class="col span_1_of_2">
      			
      			
      			 <h3>Avalaible packages</h3>
      				
      			
      			<div class="destination-places-grids">
						<div class="destination-places-grid" onclick="location.href='#';">
							<div class="dest-place-pic main_box user_style4" data-hipop="two-horizontal">
								<img src="images/d7.jpg" title="place-name" />
								<a href="#" class="popup"> </a>
								<a href="#" class="popup2"> </a>
							</div>
							
								<ul class="dest-place-opt-cast">
									<li><a class="d-place" href="#">Venice</a></li>
									<li><a class="d-price" href="#">Starting Form 250$</a></li>
									<div class="clear"> </div>
								</ul>
							</div>
							
						</div>
						
						
				
							
							
							
						</div>	
						
						
						
						
							
				
							
							
							
							
							
								<div class="destination-places-grids">
						<div class="destination-places-grid" onclick="location.href='#';">
							<div class="dest-place-pic main_box user_style4" data-hipop="two-horizontal">
								<img src="images/d7.jpg" title="place-name" />
								<a href="#" class="popup"> </a>
								<a href="#" class="popup2"> </a>
							</div>
							
								<ul class="dest-place-opt-cast">
									<li><a class="d-place" href="#">${myatt.price1 }</a></li>
									<li><a class="d-price" href="#">Starting Form 250$</a></li>
									<div class="clear"> </div>
								</ul>
							</div>
						</div>
						
						
				
							
							
								<div class="destination-places-grids">
						<div class="destination-places-grid" onclick="location.href='#';">
							<div class="dest-place-pic main_box user_style4" data-hipop="two-horizontal">
								<img src="images/d7.jpg" title="place-name" />
								<a href="#" class="popup"> </a>
								<a href="#" class="popup2"> </a>
							</div>
							
								<ul class="dest-place-opt-cast">
									<li><a class="d-place" href="#">Venice</a></li>
									<li><a class="d-price" href="#">Starting Form 250$</a></li>
									<div class="clear"> </div>
								</ul>
								
								
							</div>
							
							
							
								<div class="destination-places-grids">
						<div class="destination-places-grid" onclick="location.href='#';">
							<div class="dest-place-pic main_box user_style4" data-hipop="two-horizontal">
								<img src="images/d7.jpg" title="place-name" />
								<a href="#" class="popup"> </a>
								<a href="#" class="popup2"> </a>
							</div>
							
								<ul class="dest-place-opt-cast">
									<li><a class="d-place" href="#">Venice</a></li>
									<li><a class="d-price" href="#">Starting Form 250$</a></li>
									<div class="clear"> </div>
								</ul>
								
								
							</div>
							
							
						</div>
						
						
				
							
							
						
						
				
						</p>
					
								<p class="signin button"> 
									<input type="button" value="Register" /> 
								</p>
							
								<div id="formarea"> </div>
                             
                            </div>
		
				<div class="clear"> </div>
			</div>
			<!---//End-header---->
		
		
		
		</div>
		
		
		
		
		
		
		
		
		
		
		
				</div>
		
		<!----start-footer---->
		<div class="footer">
			<div class="wrap">
			<div class="footer-grids">
				<div class="footer-grid Newsletter">
					<h3>News letter </h3>
					<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore.</p>
					<form>
						<input type="text" placeholder="Subscribes.." /> <input type="submit" value="GO" />
					</form>
				</div>
				<div class="footer-grid Newsletter">
					<h3>Latest News </h3>
					<div class="news">
						<div class="news-pic">
							<img src="images/f01.jpg" title="news-pic1" /> 
						</div>
						<div class="news-info">
							<a href="#">Postformat Gallery: Multiple images</a>
							<span>December 12, 2012 - 9:11 pm</span>
						</div>
						<div class="clear"> </div>
					</div>
					<div class="news">
						<div class="news-pic">
							<img src="images/f01.jpg" title="news-pic1" /> 
						</div>
						<div class="news-info">
							<a href="#">Postformat Gallery: Multiple images</a>
							<span>December 12, 2012 - 9:11 pm</span>
						</div>
						<div class="clear"> </div>
					</div>
				</div>
				<div class="footer-grid tags">
					<h3>Tags</h3>
					<ul>
						<li><a href="#">Agent login</a></li>
						<li><a href="#">Customer Login</a></li>
						<li><a href="#">Not a Member?</a></li>
						<li><a href="#">Contact</a></li>
						<li><a href="#">New Horizons</a></li>
						<li><a href="#">Lanscape</a></li>
						<li><a href="#">Tags</a></li>
						<li><a href="#">Nice</a></li>
						<li><a href="#">Some</a></li>
						<li><a href="#">Portrait</a></li>
						<div class="clear"> </div>
					</ul>
				</div>
				<div class="footer-grid address">
					<h3>Address </h3>
					<div class="address-info">
						<span>DieSachbearbeiter Schonhauser </span>
						<span>Allee 167c,10435 Berlin Germany</span>
						<span><i>E-mail:</i><a href="mailto:moin@blindtextgenerator.de">moin@blindtextgenerator.de</a></span>
					</div>
					<div class="footer-social-icons">
						<ul>
							<li><a class="face1 simptip-position-bottom simptip-movable" data-tooltip="facebook" href="#"><span> </span></a></li>
							<li><a class="twit1 simptip-position-bottom simptip-movable" data-tooltip="twitter" href="#"><span> </span></a></li>
							<li><a class="tub1 simptip-position-bottom simptip-movable" data-tooltip="tumblr" href="#"><span> </span></a></li>
							<li><a class="pin1 simptip-position-bottom simptip-movable" data-tooltip="pinterest" href="#"><span> </span></a></li>
							<div class="clear"> </div>
						</ul>
					</div>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
		</div>
		<!----//End-footer---->
		<!---start-subfooter---->
		<div class="subfooter">
			<div class="wrap">
				<ul>
					<li><a href="index.html">Home</a><span>::</span></li>
					<li><a href="destinations.html">Destinations</a><span>::</span></li>
					<li><a href="criuses.html">Criuses</a><span>::</span></li>
					<li><a href="destinations.html">Specils</a><span>::</span></li>
					<li><a href="destinations.html">Holidays</a><span>::</span></li>
					<li><a href="blog.html">Blog</a><span>::</span></li>
					<li><a href="contact.html">Contact Us</a></li>
					<div class="clear"> </div>
				</ul>
				<p class="copy-right">Template by <a href="http://w3layouts.com/">W3layouts</a></p>
				<a class="to-top" href="#header"><span> </span> </a>
			</div>
		</div>
		<!---//End-subfooter---->
		<!----//End-wrap---->
	</body>
</html>

