<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Blog Form</title> 
<link rel="stylesheet" href="css/blogFormStyle.css" />
<link href='http://fonts.googleapis.com/css?family=Engagement' rel='stylesheet' type='text/css'>
<!--[if IE]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/jquery.uniform.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" charset="utf-8">
      $(function(){
        $("input:checkbox, input:radio, input:file, select").uniform();
      });
    </script>
</head>
<body>
<article>
<h1>Submit Blog Form </h1>
<form action="BlogRegisterServlet" method="get">
	<ul>
        <li>
        	<label for="name">Your Name:</label>
            <input type="text" size="40" name="name" />
        </li>
        <li>
        	<label for="email">Your Email:</label>
            <input type="email" size="40" name="email" />
        </li>
        
        <li>
        	<label for="email">Date:</label>
            <input type="date" size="40" name="date" />
        </li>
        
        
        
        <li>
            <label for="car">What's my remarks:</label>
            <select name="remarks">
                <option value="Superb Experience">Superb Experience</option>
                <option value="It was Ok">It was Ok</option>
                <option value="Nothing Better">Nothing Better</option>
                <option value="Poor">Poor</option>
                <option value="Other">Other&hellip;</option>
            </select>
        </li>
       <li>
            <label>Upload ur pik:</label>
            <input type="file" name="profileimage"/>
        </li>
            <li>
            <label>Upload ur tour picture:</label>
            <input type="file" name="backimage" />
        </li>
   
        <li>
        	<label for="message">Message:</label>
            <textarea cols="50" rows="5" name="message"></textarea>
		</li>
	</ul>
    <p>
        <button type="submit" class="action">Call to action</button>
  <h1>
<a href="ViewBlogServlet">Check Your Blog</a>
</h1>


<form action="ViewBlogServlet" method="get">
<input type="text" value="Enter your name" name="name">
<input type="button">
</form>

</h5>
    	
   
</form>
</article>
