// int,float,double
//Integer

public class Wrapper
{

	public static void main(String[] args)
	{
		int i=5;
		Integer ii=new Integer(i);//Boxing or Wrapping
		
		//int j = ii.intValue(); //Unboxing or Unwrapping
		
		Integer value=i;//AutoBoxing
		
		// int k = value;//Autounboxing
		
		String str="123";
		
		int n= Integer.parseInt(str);
		System.out.println(n);
		
		System.out.println(i);
		



	}

}
