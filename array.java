
public class array
{

	public static void main(String[] args) 
	{
		
		
		int d[][]= {           //jagged array
			     {1,2,3,4},
			     {2,4,8},
				 {5,6,7,8,9}
				
				    
		            };
		
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
		       System.out.print(" " +d[i][j]);
		       
		    }
			System.out.println();
	     }
		
		
		for(int k[]:d)//enhanced loop
		{
			for(int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
		
	}

}
