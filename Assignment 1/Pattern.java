

class Pattern
{
public static void main(String[] args)
 {
	
	int n=10;	
	for(int i=0;i<n;i++)
	{
			
		for(int j=0;j<n;j++)
		{
			if(i==0|| j==(n-1)/2 || i==9)
              System.out.print("*");
			else
				System.out.print(" ");
                              
		}
            

       	
		for(int j=0;j<n;j++)
		{
			if(j==0 || i==j || j==9)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

            for(int j=0;j<n;j++)
		{
			if(j==0 || i==0 || i==(n-1)/2 || i==9)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

            for(int j=0;j<n;j++)
		{
			if(j==0|| i==9 || j==9)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

            for(int j=0;j<n;j++)
		{
			if(i==0|| j==0 || i==(n-1)/2 || j==9 && i<5 || i-j==(n-1)/2 )
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

	
			
		for(int j=0;j<n;j++)
		{
			if(j==0 || i==0 || i==9 || j==9)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

            for(int j=0;j<n;j++)
		{
			if(j==0 || i==j || j==9)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}
              
	      System.out.println(" ");
	      }

	}

}