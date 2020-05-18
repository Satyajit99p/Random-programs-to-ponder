import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int [5];
System.out.println("enter the numbers");
for (int z=0;z<5;z++)
{
	arr[z]=sc.nextInt();
}
int x=arr.length;
for (int i=1;i<5;i++)
{
	int k=arr[i];
	int m=i;
	while(m>0 && k < arr[m-1])
	{
		arr[m]=arr[m-1];
		m--;
	}
	arr[m]=k;
}
for (int y=0;y<5;y++)
{
	System.out.println(arr[y]);
}
	}

}
