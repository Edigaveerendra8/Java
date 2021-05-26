class Cal
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i : n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class varags
{
	public static void main(String[] args)
	{
		Cal obj =new Cal();
		System.out.println(obj.add(4,7,8,9,7));
	}

}
