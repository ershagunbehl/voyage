package factory;

public class beanclass
{
		int id,price;
		String location,type,image,description;
	public beanclass(String location,String type,String image,String description, int price)
	{
		
		this.location= location;
		this.type= type;
		this.image= image;
		this.description= description;
		this.price =price;
	}
	
	public int getId()

	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location= location;
		
	}
	public String getType()
	{
		return type;
	}
	public void setBranch(String type)
	{
		this.type= type;
		
	}
	public String getImage()
	{
		return image;
	}
	public void setImage(String image)
	{
		this.image= image;
		
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description= description;
		
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price= price;
		
	}
	
	String firstname,lastname,email,password;
public beanclass(String lastname, String email, String password) 
{
	this.firstname= firstname;
	this.lastname=lastname;
	this.email=email;
	this.password=password;
}

	public String getFirstname()

	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname=firstname;
	}
	public String getLastname()

	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname=lastname;
	}public String getEmail()

	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}public String getPassword()

	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	int adult,children,infant;
	String way,date,fclass,destination,type1;
public beanclass(String way, String destination, String date, String type1,
		int adult, int children, int infant, String fclass) 
{
	
	this.way=way;
	this.destination=destination;
	this.date=date;
	this.type1= type1;
	this.adult=adult;
	this.children=children;
	this.infant=infant;
	this.fclass=fclass;

}
public String getWay() 
{
	return way;
}
public void setWay(String way)
{
	this.way = way;
}
public String getDestination() 
{
	return destination;
}
public void setDestination(String destination)
{
	this.destination = destination;
}

public String getDate()
{
	return date;
}
public void setDate(String date)
{
	this.date = date;
}


public String getType1()
{
	return type1;
}
public void setType1(String type1)
{
	this.type1 = type1;
}
public int getAdult() 
{
	return adult;
}
public void setAdult(int adult)
{
	this.adult = adult;
}
public int getChildren() 
{
	return children;
}
public void setChildren(int children)
{
	this.children = children;
}
public int getInfant() 
{
	return infant;
}
public void setInfant(int infant)
{
	this.infant = infant;
}
public String getFclass()
{
	return fclass;

}
public void setFclass(String fclass)
{
	this.fclass = fclass;
}



String htype,name1,name2,name3,name4,name5,name6,name7,name8,name9,img1,img2,img3,img4,img5,img6,img7,img8,img9;

public beanclass(String htype, String name1, String name2,
		String name3, String name4, String name5, String name6,
		String name7, String name8, String name9, String img1,
		String img2, String img3, String img4, String img5,
		String img6, String img7, String img8,String img9) 

{
	this.htype=htype;
	this.name1=name1;
	this.name2=name2;
	this.name3=name3;
	this.name4=name4;
	this.name5=name5;
	this.name6=name6;
	this.name7=name7;
	this.name8=name8;
	this.name9=name9;
	this.img1=img1;
	this.img2=img2;
	this.img3=img3;
	this.img4=img4;
	this.img5=img5;
	this.img6=img6;
	this.img7=img7;
	this.img8=img8;
	this.img9=img9;
	
}


public String getHtype()
{
	return htype;
}
public void setHtype(String htype)
{
	this.htype= htype;

}
public String getName1()
{
	return name1;
}
public void setName1(String name1)
{
	this.name1= name1;
}
public String getName2()
{
	return name2;
}
public void setName2(String name2)
{
	this.name2= name2;
}
public String getName3()
{
	return name3;
}
public void setName3(String name3)
{
	this.name3= name3;
}
public String getName4()
{
	return name4;
}
public void setName4(String name4)
{
	this.name4= name4;
}
public String getName5()
{
	return name5;
}
public void setName5(String name5)
{
	this.name5= name5;
}
public String getName6()
{
	return name6;
}
public void setName6(String name6)
{
	this.name6= name6;
}
public String getName7()
{
	return name7;
}
public void setName7(String name7)
{
	this.name7= name7;
}
public String getName8()
{
	return name8;
}
public void setName8(String name8)
{
	this.name8= name8;
}
public String getName9()
{
	return name9;
}
public void setName9(String name9)
{
	this.name9= name9;
}
public String getImg1()
{
	return img1;
}
public void setImg1(String img1)
{
	this.img1= img1;
}

public String getImg2()
{
	return img2;
}
public void setImg2(String img2)
{
	this.img2= img2;
}
public String getImg3()
{
	return img3;
}
public void setImg3(String img3)
{
	this.img3= img3;
}
public String getImg4()
{
	return img4;
}
public void setImg4(String img4)
{
	this.img4= img4;
}
public String getImg5()
{
	return img5;
}
public void setImg5(String img5)
{
	this.img5= img5;
}
public String getImg6()
{
	return img6;
}
public void setImg6(String img6)
{
	this.img6= img6;
}
public String getImg7()
{
	return img7;
}
public void setImg7(String img7)
{
	this.img7= img7;
}
public String getImg8()
{
	return img8;
}
public void setImg8(String img8)
{
	this.img8= img8;
}
public String getImg9()
{
	return img9;
}
public void setImg9(String img9)
{
	this.img9= img9;
}

int budget;
String price1, price2,price3,price4,img11,img12,img13,img14,destination1;
public beanclass(int budget, String price1, String price2, String price3,
		String price4, String img11, String img12, String img13,
		String img14)
{
	// TODO Auto-generated constructor stub
	this.destination1=destination1;
	this.budget=budget;
	this.price1=price1;
	this.price2=price2;
	this.price3=price3;
	this.price4= price4;
	this.img11=img11;
	this.img12=img12;
	this.img13=img13;
	this.img14=img14;
	
}
public int getBudget() {
	return budget;
}public String getDestination1() {
	return destination1;
}public String getImg11() {
	return img11;
}public String getImg12() {
	return img12;
}public String getImg13() {
	return img13;
}public String getImg14() {
	return img14;
}public String getPrice1() {
	return price1;
}public String getPrice2() {
	return price2;
}public String getPrice3() {
	return price3;
}public String getPrice4() {
	return price4;
}public void setBudget(int budget) {
	this.budget = budget;
}public void setDestination1(String destination1) {
	this.destination1 = destination1;
} public void setImg11(String img11) {
	this.img11 = img11;
} public void setImg12(String img12) {
	this.img12 = img12;
}public void setImg14(String img14) {
	this.img14 = img14;
} public void setImg13(String img13) {
	this.img13 = img13;
}public void setPrice1(String price1) {
	this.price1 = price1;
} public void setPrice2(String price2) {
	this.price2 = price2;
}public void setPrice3(String price3) {
	this.price3 = price3;
}public void setPrice4(String price4) {
	this.price4 = price4;
}public void setType(String type) {
	this.type = type;
}
}
