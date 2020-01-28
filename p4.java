import java.util.*;
class p4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
if(args.length<0)
{
System.out.println("An integer number as argument is expected ");
}
else
{
int a=Integer.parseInt(args[0]);
if(a<0)
System.out.println(+a+ " is a Negative number");
else if(a>0)
System.out.println(+a+ " is a Positive number");
else 
System.out.println(+a+ " is neither negative nor positive");
}
}
}