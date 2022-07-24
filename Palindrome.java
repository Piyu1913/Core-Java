class Palindrome
{
   public static void main(String args[])
   { 
     int num =242;
     int rem,temp,sum=0;
     temp=num;
     while(num>0)
     {
       rem=num%10;
       sum=(sum*10)+rem;
       num=num/10;
     }
       if(temp==sum)
        System.out.println("Palindrome number");
       else
        System.out.println("Not Palindrome");
   }
}

    