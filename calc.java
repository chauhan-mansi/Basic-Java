import java.util.Scanner;
class calc
{
public static void main(String[]args)
{
int a,b,y,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b");
System.out.println ("Choose a function 1.Addition 2.Substraction 3.Multiplication 4.Division");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
switch(c)
{
case 1:
y=a+b;
System.out.println("Addition is "+y);
break;
case 2:
y=a-b;
System.out.println("Substraction is "+y);
break;
case 3:
y=a*b;
System.out.println("Multiplication is "+y);
break;
case 4:
y=a/b;
System.out.println("Division is "+y);
break;
default:
System.out.println("Enter valid choice");
break;
}}}