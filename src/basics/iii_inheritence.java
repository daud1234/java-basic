package basics;
class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

public class iii_inheritence extends A
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     iii_inheritence obj = new iii_inheritence();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}
