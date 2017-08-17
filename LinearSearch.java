import java.util.*;
public class LinearSearch
{
public static void main(String[] args)
{
int i, n,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of element");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the no of values");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the Value to be Searched ");
s=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==s)
{
System.out.println(s+"is found in the index"+(i+1));
break;
}
}
if(s==n)
{
System.out.println("Entered value is not present");
}
}
}