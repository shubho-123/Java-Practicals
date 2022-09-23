package abstraction;

import java.util.Scanner;

abstract class Shape{
 int width;
 abstract void area();
}
//--------------------------------------------
class Square extends Shape{
	
 public Square(int x)
{
 super.width=x;
}
public void area()
{
 int result=width*width;
 System.out.println(result);
}
}

//----------------------------------------------------
class Circle extends Shape{
 public Circle(int y)
{
 super.width=y;
}
public void area()
{
 //final double Math.PI=3.14; 
 double result=(double)(Math.PI*width*width);
 System.out.println(result);
}
}


public class Shapes {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
     Square a=new Square(x);
     Circle b=new Circle(y);
    
     a.area();
     b.area();
     sc.close();
 }
}