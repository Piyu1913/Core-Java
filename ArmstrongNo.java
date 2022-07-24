class ArmstrongNo
{
				
	public void calc()
	{
	   for(int ip=0;ip<100000;ip++)
	   {
		int a=ip;
		int b=ip;
		int count=0,rem,sum=0;
		while(a>0)	
		{	
			count++;
			a=a/10;
		}
		while(b>0)		
		{		
			rem=	b%10;
			sum=	sum+powerCalc(rem,count);
			b=b/10;	
		
		}
		if(sum==ip)	
		{	
	
			System.out.println("Strmstrong no"+ip);
		}	
		
	    }
	}
	public int powerCalc(int rem,int count)			
	{	
		int m=1;		
		for(int i=0;i<count;i++)		
		{		
			m=m*rem;	
		}		
		return m;		
	}			
}
class MainArmstrongNo
{
	public static void main(String[] args)
	{
		ArmstrongNo an=new ArmstrongNo();
		an.calc();

	}


}
