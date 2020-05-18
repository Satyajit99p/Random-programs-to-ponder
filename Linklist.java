import java.util.Scanner;


class Node
{
	int data;
	Node next; 
}
public class Linklist {
	
	Node head=null;
	public void add(int x)
	{
		Scanner sc=new Scanner(System.in);
		Node p=new Node();
			p.data=x;
			p.next=null;
			
		if(head == null)
		{
		head=p;
		}
		else
		{	
			Node q=head;
			while(q.next != null)
			{
				q=q.next;
			}
			q.next=p;
		}
	}
	
	public void insert(int a)
	{
		Scanner sc=new Scanner(System.in);
		Node p=new Node();
		p.data=a;
		p.next=null;
		System.out.println("enter the position");
		int x=sc.nextInt();
		Node q=head;
		int c=1;
		while(c<(x-1))
		{
			c++;
			q=q.next;
		}
		p.next=q.next;
		q.next=p;
		
	}
	
	public void reverse()
	{
		Node prev=null;
		Node next=null;
		Node current=head;
		while(current != null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
	}
	public void show()
	{
		Node s=head;
		while(s != null)
		{
		System.out.println(s.data);
		s=s.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		Linklist list=new Linklist();
		for(int i=0;i<5;i++)
		{
			int a=sc.nextInt();
			list.add(a);	
		}
		
		
		list.reverse();
		list.show();
		list.insert(10);
		list.show();
	}
}
