function checkregisterValidation()
{

	var a = document.registerform.fn.value;
	var b = document.registerform.ln.value;
	var c = document.registerform.email.value;
	var d = document.registerform.pd.value;
	var e = document.registerform.cpd.value;

	if(a==="")
	{
		alert("FIRST NAME REQUIRED");
	}
	
	else if(b==="")
	{
		alert("LAST NAME REQUIRED");
	}
	else if(c==="")
	{
	alert("EMAIL REQUIRED");
	}
	else if(d==="")
	{
	alert("PASSWORD REQUIRED");
	}
	else if(e==="")
	{
	alert("CONFIRM PASSWORD REQUIRED");
	}
	else
	 {
	document.registerform.submit();
	 }
}

	function checkloginValidation()
	{
		alert("DO U WANT TO LOGIN??");
		var f = document.loginform.fn.value;
		var g = document.loginform.pd.value;
		if(f==="")
		{
			alert("EMAIL REQUIRED");
		}
		if(g==="")
		{
			alert("PASSWORD REQUIRED");
		}
		else
		 {
		document.loginform.submit();
		 }
	}
	
	
	
	
	
	
	/** modificTIOn **/
	
	
	function getModify()
	{
		alert("hi");
		var a= document.modifyform.fn.value;
		var b= document.modifyform.ln.value;
		var c= document.modifyform.email.value;
		var d= document.modifyform.npd.value;
			if(window.XMLHttpRequest)
			{
			
			obj=new XMLHttpRequest();
			}
		else if(window.ActiveXObject)
		{
			obj= new ActiveXObject("Microsoft.XMLHTTP");
		}

		obj.open("post","ModifyServlet?fn="+a+"&ln="+b+"&email="+c+"&npd="+d,true);
		obj.onreadystatechange=handleRequest;
		obj.send();
		}
		function handleRequest()
		{

		if(obj.readyState==4)
		{
		document.getElementById("formarea").innerHTML="Modification succesful.....!!!s";
		}
	  }
	
		
	