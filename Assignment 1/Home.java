class Home
{
public static void main(String[] args)
 {
	
	int n=14;	
	for(int i=0;i<n;i++)
	

	{
			
		for(int j=0;j<n;j++)
		{
			if(j==0 || i==0 || i==13 || j==13 || i==1 && j<=5 || i==1 && j>=7 || i==2 && j<=4 || i==2 && j>=8 || i==3 && j<=3 || i==3 && j>=9 ||
                      i==4 && j<=2 || i==4 && j>=10 || i==5 && j<=1 || i==5 && j>=11 || i==6 && j>=12)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}

            


   System.out.println();
 }
	
	
 }
 }