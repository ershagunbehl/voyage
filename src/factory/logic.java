package factory;

public class logic 
{
	String destination , fclass;
	int budget;
public int getPackagesBudget(String destination,String fclass)

{
	if(destination.equals("Goa")&& fclass.equals("Economy"))
	{
		budget=10000;
		
	}
	if(destination.equals("Goa")&& fclass.equals("Premium Economy"))
	{
		budget=15000;
		
	}
	if(destination.equals("Goa")&& fclass.equals("Luxury"))
	{
		budget=20000;
		
	}
	return budget;
	
}
}
