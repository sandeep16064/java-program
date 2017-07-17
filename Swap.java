//Swap two no. in java program without tempt variable...

import java.io.*;
class Swap
{
public static void main(String args[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a number:::");
int a=Integer.parseInt(in.readLine());
System.out.println("Enter b number:::");
int b=Integer.parseInt(in.readLine());

System.out.println("before");
System.out.println("a= "+a);

System.out.println("b= "+b);
b=a+b;   //only follow these three line logic
a=b-a;
b=b-a;

System.out.println("after");
System.out.println("a= "+a);

System.out.println("b= "+b);
}
}
