
<!DOCTYPE HTML>
<html>
	<head>
		<title>Voyage Website Template | Criuses :: w3layouts</title>
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<script type="text/javascript" src="js/CheckValidation.js"> </script>       
         <link rel="stylesheet" type="text/css" href="css/style3.css" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
		<script src="js/jquery.min.js"></script>
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
		
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            
                            <form name="modifyform" action="ModifyServlet" method="post" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">First Name</label>
                                    <input id="usernamesignup" name="fn" required type="text" placeholder="Firstname" value="${param.fn}" />
                                </p>
                                
                                   <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Last Name</label>
                                    <input id="usernamesignup" name="ln" required type="text" placeholder="Lastname" value="${myatt.lastname}" />
                                </p>
                             
                                
                                
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="email" required type="email" placeholder="mysupermail@mail.com" value="${myatt.email}"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">old password </label>
                                    <input id="passwordsignup" name="pd" required type="password" placeholder="eg. X8df!90EO" value="${myatt.password}"/>
                                </p>
                                 <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">enter new password </label>
                                    <input id="passwordsignup" name="npd" required type="password" placeholder="eg. X8df!90EO"/>
                                </p>


                                <p class="signin button"> 
									<input type="submit" value="modify" /> 
								</p>
								<div id="formarea"> </div>
                                <p class="change_link">  
									Already a member ?
									<a href="login.html" class="to_register"> Go and log in </a>
								</p>
                            </form>

                            </div>

                        
                    </div>
                </div>  
    
    
    
    
	        
        
	</body>
</html>

