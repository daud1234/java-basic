package basics;

interface in1 
{ 
 final int a = 10; 

 void display(); 
} 

public class iv_interface implements in1 
{  
 public void display() 
 { 
     System.out.println("hi"); 
 } 

 public static void main (String[] args) 
 { 
     iv_interface t = new iv_interface(); 
     t.display(); 
     System.out.println(a); 
 } 
} 