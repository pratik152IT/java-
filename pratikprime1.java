class pratikprime1
{
	public static  void generator(int[] array, int length) 
	{
		long num = System.currentTimeMillis(); 
		
		for (int i = 0; i < length; i++) 
		{
			num += 1234567; 
			
			if (num % 9999999 < 1000000) {
				num += System.nanoTime();
			}
			
			array[i] = (int) Math.abs(num % 9999999); 
		}
	}
	 
	 public static boolean checkprime(int num)
		{
			for(int i=2;i*i < num;i++)
			{
				if(num %i == 0)
				{
					return false;
				}
			}
			return true;
		}
    public static int primecount( int [] array, int length)
    {
        int count =0;

        for(int i=0;i<length;i++)
        {
            if(checkprime(array[i]))
            {
                count++;
            }
        }
		return count;
		}
		  public static boolean checknonprime(int num) {
			for (int i = 2; i * i < num; i++) {
				if (num % i == 0) {
					return true; 
				}
			}
			return false; 
		}

			public static int nonprimecount(int[] array, int length) {
				int noncount = 0;
				for (int i = 0; i < length; i++) {
					if (checknonprime(array[i])) {
						noncount++;
					}
				}
				return noncount;
			}

		public static void main(String args[])
		{
		 int a[]=new int[1000000];
		generator(a,a.length);
		 int i=0;
		 int j=0;
		 while( i<5)
	     {
			 // without reversing conditions
	    
	     System.out.println("Approach 1");
	     long t1=System.currentTimeMillis();
	     int p=primecount( a, a.length);
		 int p2=1000000-p;
		 System.out.println("Prime Numbers"+p);
		 System.out.println("Non Prime Numbers"+p2);
		 long t2=System.currentTimeMillis();
		 long  endt=t2-t1;
		 System.out.println("total time"+endt);
		 System.out.println("____________________________________________________________________");
		i++;
		 }
		 System.out.println("************************************************************");
		  while(j<5)
	     {
			 //reversing conditions
		
		 System.out.println("Approach 2");
	     long t3=System.currentTimeMillis();
	     int q=nonprimecount( a, a.length);
		 int q2=1000000-q;
		 System.out.println("Prime Numbers"+q2);
		 System.out.println("Non Prime Numbers"+q);
		 long t4=System.currentTimeMillis();
		 long  endt2=t4-t3;
		 System.out.println("total time"+endt2);
		 System.out.println("____________________________________________________________________");
      	 j++;
		 }
		 }
  
 }
