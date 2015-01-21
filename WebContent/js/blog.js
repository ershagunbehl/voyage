function getBlogForm()
{alert("hi");


if(window.XMLHttpRequest)
	obj=new XMLHttpRequest();
else if(window.ActiveXObject)
	obj=new ActiveXObject("Microsoft.XMLHTTP");




obj.open("post","blogServlet",true);
obj.onreadystatechange=handleRequest;
obj.send();
}
function handleRequest()
{
if(obj.readyState==4)
	document.getElementById("formarea").innerHTML=obj.responseText;
}
