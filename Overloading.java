class Overloading
{
	int id;
	String name;
	int age;
	Overloading(int i,String n,int a)
      {
        id =i;
	 name =n;
	 age= a;
	}
      void display()
      {
         System.out.println(id+" "+name+" "+age);
      }
      public static void main(String args[])
      {
         Overloading s1 = new Overloading(16,"Ram",42);
         Overloading s2 = new Overloading(17,"Raten",27);
         s1.display();
         s2.display();
       }
}