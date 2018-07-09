import java.util.*;

interface Stack
{
	int size=5;
	public void push(int element);
	public void pop(int element);
	public void display();
}

class StackOperation implements Stack
{
	int top=-1, element;
	int array[]=new int[size];
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		StackOperation so = new StackOperation();
		//so.array = new int[size];
		int choice;
		
		do
		{
			System.out.println("*********MENU**********\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice");
		choice = sc.nextInt();

			switch(choice)
			{
				case 1: System.out.println("Enter the element to be inserted : ");
					so.element = sc.nextInt();
					so.push(so.element);
					System.out.println("Element inserted successfully!");
					break;
				
				case 2:System.out.println("Enter the element to be deleted : ");
					so.element = sc.nextInt();
					so.pop(so.element);
					System.out.println("Element deleted successfully!");
					break;

				case 3:so.display();
					break;	
				
				case 4: break;
				
				default: System.out.println("invalid choice");
		
			}
		}while(choice!=4);
	}
	
	public void push(int element)
	{
		if(top!=size)
		{
			array[++top]=element;
			top++;
		}
		else
			System.out.println("Stack Overflow!");
	}
	
	public void pop(int element)
	{
		int i,j;

		if(top<0)
			System.out.println("Stack Underflow!");
		else
		{
			for(i=0;i<=top;i++)
			{
				if(array[i]==element)
					break;
			}
			for(j=i;j<top;j++)
			{
				array[j]=array[j+1];
			}
		}
	}

	public void display()
	{
		for(int i : array)
			System.out.println(i+" ");
	}
}
