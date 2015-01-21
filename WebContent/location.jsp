<html>
	<head>
		<title>Voyage Website Template | Criuses :: w3layouts</title>
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
		<script src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/CheckValidation.js"> </script> 
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
		<!---calender-style---->
		<link rel="stylesheet" href="css/jquery-ui.css" />
		<!---//calender-style---->
		<!---images-hover-effects--->
		<link rel="stylesheet" href="css/zalki_hover_img.css" type="text/css" media="screen">
		<script src="js/jquery.zalki_hover_img.min-0.2.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(window).load(function(){
				$('.main_box').ZalkiHoverImg(
				);
				});
		</script>
		<!---//images-hover-effects--->
	</head>
	<body>
		<!----start-wrap---->
			<!----start-top-header----->
			<div class="top-header" id="header">
				<div class="wrap">
				<div class="top-header-left">
					<ul>
						<li><a href="#"><span> </span> Agent Login</a></li>
						<li><a href="#"><span> </span> Agent Login</a></li>
						<li><p><span> </span>Not a Member ? </p>&nbsp;<a class="reg" href="#"> Register</a></li>
						<li><p class="contact-info">Call Us Now :815-123-4567</p></li>
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
							<li><a href="index.html">Home</a></li>
							<li><a href="destinations.html">Destinations</a>
								<ul>
								<li><a href="#">Dropdown item</a></li>
								<li><a href="#">Dropdown item</a></li>
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
							<li class="active"><a href="criuses.html">Criuses</a></li>
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
		<!---start-Criuses---->
		<div class="criuses">
			<div class="criuses-head">
				<div class="wrap">
					<h3>criuses</h3>
				</div>
				<!---End-destinatiuons---->
				<div class="find-place dfind-place">
					<div class="wrap">
						<div class="p-h">
							<span>FIND YOUR</span>
							<label>HOLYDAYS</label>
						</div>
						<!---strat-date-piker---->
						  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
						  <script>
						  $(function() {
						    $( "#datepicker" ).datepicker();
						  });
						  </script>
						<!---/End-date-piker---->
						<div class="p-ww">
							<form>
								<span> Where</span>
								<input class="dest" type="text" value="Distination" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Distination';}">
								<span> When</span>
								<input class="date" id="datepicker" type="text" value="Select date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Select date';}">
								<input type="submit" value="Search" />
							</form>
						</div>
						<div class="clear"> </div>
					</div>
				</div>
			</div>
				<!----//End-find-place---->
				<!---start-criuse-grids----->
				<div class="criuse-main">
					<div class="wrap">
						<div class="criuse-head1">
							<h3>CHEAPEST Criuse</h3>
						</div>
						<div class="criuse-grids">
							<div class="criuse-grid">
								<div class="criuse-grid-head">
									<div class="criuse-img">
										<div class="criuse-pic">
											<img src="images//${myatt.image}" title="criuse-name" />
										
										</div>
										<div class="criuse-pic-info">
												<div class="criuse-pic-info-top">
													<div class="criuse-pic-info-top-weather">
														<p>33<label>o</label><i>c</i><span> </span>${param.value}</p>
													</div>
													<div class="criuse-pic-info-top-place-name">
														<h2><label>${myatt.location}</label></h2>
													</div>
												</div>
												<div class="criuse-pic-info-price">
													<p><span>Starting Form</span> <h4>${myatt.price}</h4></p>
												</div>
										</div>
									</div>
									<div class="criuse-info">
										<div class="criuse-info-left">
											<ul>
												<li><a class="c-hotel" href="#"><span> </span>6 Nights VIp/Luurious hotel </a></li>
												<li><a class="c-air" href="#"><span> </span> Return Air Ticket</a></li>
												<li><a class="c-fast" href="#"><span> </span> Complimentry beark fast</a></li>
												<li><a class="c-car" href="#"><span> </span> Car for All transfers</a></li>
												<div class="clear"> </div>
											</ul>
										</div>
										<div class="criuse-info-right">
											<ul>
												<li><a class="c-face" href="#"><span> </span> </a></li>
												<li><a class="c-twit" href="#"><span> </span> </a></li>
												<li><a class="c-tub" href="#"><span> </span> </a></li>
												<li><a class="c-pin" href="#"><span> </span> </a></li>
											</ul>
										</div>
										<div class="clear"> </div>
									</div>
								</div>
								<div class="criuse-grid-info">
									<h1><a href="#">${myatt.location}</a></h1>
									<p>${myatt.description}</p>
									
										<!----//select hereeeeeeee---->
										<form name="buttonform" action="login.html">
									<input type="submit" class="btn" value="Select">
									</form>
								</div>
							</div>
							
							</div>
							
							
							<div class="find-place dfind-place">
					<div class="wrap">
						<div class="p-h">
							<span>FIND YOUR</span>
							<label>HOLYDAYS</label>
						</div>
						<!---strat-date-piker---->
						  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
						  <script>
						  $(function() {
						    $( "#datepicker" ).datepicker();
						  });
						  </script>
						<!---/End-date-piker---->
						<div class="p-ww">
				<form name="PackageRegisterForm" action="PackageRegisterServlet" method="post">
							<div>
							<input type="radio" name="way" value="oneway">One way
<input type="radio" name="way" value="twoway">Two way
</div>
								<span> Where</span>
								<select name="destination" style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 29%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	><option value="goa">goa</option>
	<option value="masuri">masuri</option>
	</select>
								<span> When</span>
								<select style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 29%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	name="date"><option value="7/6/2014">7/6/2014</option>
	<option value="16/9/2014">16/9/2014</option>
	</select>
	<div>
	<span> Type::-   </span>
	<select style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 20%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	name="type" onChange="getchange()"><option value="holiday">holiday</option>
	<option value="Honeymoon">Honeymoon</option>
	<option value="advanture">advanture</option>
	<option value="Beach">Beach</option>
	<option value="citybreaks">citybreaks</option>
	<option value="safari">safari</option>
	</select>
	</div>
	<div>
	
	<span>Adult(12+yrs)  </span>
	<input type="text" name="adults" style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 10%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	/>
	<span>Children(2-12yrs) </span>
	<input type="text" name="children" style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 10%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	/>
<span> Infant(0-2yrs) </span>
	<input type="text" style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 10%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	name="infant"/>
	</div>
	<div>
	<span>Flight class </span>
	<select style="font-family: 'Open Sans', sans-serif;
	padding: 0.5em 1em;
	border: 1px solid #2C3E50;
	outline: none;
	width: 29%;
	color: #5D6E80;
	font-weight: 400;
	font-size: 1em;
	border-radius: 0.15em;
	-webkit-border-radius: 0.15em;
	-moz-border-radius: 0.15em;
	-o-border-radius: 0.15em;"
	name="Fclass"><option value="Business">Business</option>
	<option value="economy">economy</option>
	<option value="Passanger">Passanger</option>
	<option value="Premium economy">Premium economy</option>
	<option value="First class">First class</option>
	</select>
	</div>
	
	
	
	
	<input type="submit" value="Search" />
							</form>
						</div>
						<div class="clear"> </div>
					</div>
				</div>
			</div>
							
						<div class="criuse-grid-load">
							<a href="#">Loading More</a>
						</div>
					</div>
				</div>
				<!---//End-criuse-grids----->
			</div>
		</div>
		<!---start-Criuses---->
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

