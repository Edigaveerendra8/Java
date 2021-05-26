
class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static
	{
		System.out.println("in static");
	}
	
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
	
	
}
public class Static
{

	public static void main(String[] args) 
	{
		Emp navin= new Emp();
		navin.eid=8;
		navin.salary = 4000;
		Emp.ceo="Mahesh";
		
		Emp rahul =new Emp();
		rahul.eid = 9;
		rahul.salary =5000;
		Emp.ceo="Nikitha";
		
		navin.show();
		rahul.show();
				
		

	}

}
