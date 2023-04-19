import java.util.Scanner;
class bmi
{
public static void main(String[]args)
{
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter weight in pounds");
System.out.println("Enter height in inches");
a=sc.nextDouble();
b=sc.nextDouble();
a=a*0.45359237;
b=b*0.000645;
c=a/b;
System.out.println("BMI is "+c);
}}


