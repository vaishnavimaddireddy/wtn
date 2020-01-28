import java.util.*;
class p5
{
public static void main(String args[])
{
if(args.length==0)
System.out.println("An integer number as argument is expected");
else
{
int a=Integer.parseInt(args[0]);
int flag=0;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
flag=1;
break;
}
if(a==0||a==1)
System.out.println(+a+" is neither prime nor composite");
else if(flag==0)
System.out.println(+a+" is prime number");
else 
System.out.println(+a+" is composite number");
}
}
}
