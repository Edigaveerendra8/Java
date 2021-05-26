class Printer
{
	public void show(Number i)//Number is abstract it take interger and double
	{
		System.out.println(i);
	}
}
public class abstractexa
{

	public static void main(String[] args) 
	{
		Printer obj = new Printer();
		obj.show(5.4);
				


	}

}
