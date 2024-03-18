import java.util.Scanner;
class 3d
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][][]=new int[3][3][3]; //3-D array declaration and intialization
for(int i=0;i<3;i++) // reading data into 3-D array
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
System.out.println("Enter element at index:"+i+j+k);
a[i][j][k]=s.nextInt();
}
}
}
for(int i=0;i<3;i++) //printing data of 3-D array
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
System.out.print(a[i][j][k]+"\t");
}
}
}
}
}
