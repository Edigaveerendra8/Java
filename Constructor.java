class Num
{
	int num1;
	int num2;
	int result;
	
	public Num()
	{
		num1=5;
		num2=5;
		System.out.println("in constructor");
		
	}
	public Num(int number1,int number2)
	{
		num1=number1;//current object if num1=num1 use this.num1=num1
		num2=number2;
	}
	
}
public class Constructor 
{

	public static void main(String[] args)
	{
		Num obj = new Num(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);


	}

}
