import java.util.Scanner;
public class operator
{
public static void main(String args[])
{
int result=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter First No");
int first=s.nextInt();
System.out.println("Enter Second No");
int Second=s.nextInt();
for(int i=1;i<=Second;i++)
{
result=result+first;
}
System.out.println("Multiplication is===>"+result);
}
}