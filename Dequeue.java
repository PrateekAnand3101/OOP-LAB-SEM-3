// import java.util.*;
// class DequeImpl
// {
// 	int front,rear,MAX=100;
// 	int q[]=new int[MAX];
// 	Scanner sc=new Scanner(System.in);
// 	DequeImpl()
// 	{
// 		front=rear=-1;
// 	}
// 	void add_rear()
// {
//                   int n1;
//                   System.out.println("\nEnter value to insert : ");
//                   n1=sc.nextInt();
//                   if(rear==MAX)
//                   {
//                                    System.out.println(" Queue is Overflow\n");
//                                    return;
//                   }
//                   else
//                   {
//                                    rear++;
//                                    q[rear]=n1;
//                                    if(rear==0)
//                                                  rear=1;
//                                     if(front==0)
//                                                  front=1;
//                   }
// }
// void add_front()
// {
//                   int n;
//                   System.out.println("\n Enter value to insert:-");
//                   n=sc.nextInt();
//                   if(rear==front)
//                   {
// 					System.out.println(" Cannot add value at front end\n");
//                                    return;
//                   }
//                   else
//                     {
//                                 front--;
//                                 q[front]=n;
//                     }

//                   }
// void delete_front()
// {
//                   int n;
//                   if(front==0)
//                   {
//                                    System.out.println(" Queue is Underflow\n");
//                                    return;
//                   }
//                   else
//                   {
//                                    n=q[front];
//                                    System.out.println("Deleted element is\n"+n);
//                                    if(front==rear)
//                                    {
//                                                      front=0;
//                                                      rear=0;
//                                    }
//                                    else
//                                    {
//                                                      front++;
//                                    }
//                   }
// }
// void delete_rear()
// {
//                   int n;
//                   if(rear==0)
//                   {
// 					System.out.println(" Cannot delete value at rear end\n");
//                                    return;
//                   }
//                   else
//                   {
//                                    n=q[rear];
//                                    if(front==rear)
//                                    {
//                                                      front=0;
//                                                      rear=0;
//                                    }
//                                    else
//                                    {
//                                                      rear--;
//                                                      System.out.println(" Deleted element is\n"+n);
//                                    }
//                   }
// }
// void display()
// {
//                   int i;
//                   if(front==0)
//                   {
//                                    System.out.println(" Queue is Underflow\n");
//                                    return;
//                   }
//                   else
//                   {
// 					System.out.println("\n Output");
//                                    for(i=front;i<=rear;i++)
//                                    {
// 									System.out.println(q[i]);
//                                    }
//                   }
// }



// }


// class Dequeue
// {
// 	public static void main(String args[])
// 	{
// 		int ch;
// Scanner sc=new Scanner(System.in);
// DequeImpl i1= new DequeImpl();
// System.out.println("---- DeQueue Menu ----");
// System.out.println("\n 1. Insert at Rear");
// System.out.println("\n 2. Insert at Front");
// System.out.println("\n 3. Delete at Rear");
// System.out.println("\n 4. Delete at Front");
// System.out.println("\n 5. Display");
// System.out.println("\n 6. Exit\n");
// do{
// 	System.out.println(" Enter your choice:-");
// ch=sc.nextInt();

// switch(ch)
// {
// case 1:i1.add_rear();
//        break;

// case 2:i1.add_front();
//        break;
// case 3:i1.delete_rear();
//        break;
// case 4:i1.delete_front();
//        break;
// case 5:i1.display();
//        break;
// default:System.out.println(" Wrong Choice\n");
// 		break;
// }
// }while(ch<6);

// 	}

// }
import java.util.*;
class DequeImpl
{
	int MAX=100;
	int deque[]= new int[MAX];
	int left,right;
	Scanner sc= new Scanner(System.in);
	DequeImpl()
	{
		left= right=-1;
	}
	//-------INSERT AT RIGHT-------
	void insert_right()
	{
	 int val;
	 System.out.println("\nEnter the value to be added ");
	 val=sc.nextInt();
	 if( (left==0 && right==MAX-1) || (left==right+1) )
	 {
		System.out.println("\nOVERFLOW");
	 }
	 if(left==-1)        //if queue is initially empty
	 {
	  left=0;
	  right=0;
	 }
	 else
	 {
	  if(right==MAX-1)
	   right=0;
	  else
	   right=right+1;
	 }
	 deque[right]=val;
	}
	//-------INSERT AT LEFT-------
	void insert_left()
	{
	 int val;
	 System.out.println("\nEnter the value to be added ");
	 val=sc.nextInt();
	 if( (left==0 && right==MAX-1) || (left==right+1) )
	 {
		System.out.println("\nOVERFLOW");
	 }
	 if(left==-1)        //if queue is initially empty
	 {
	  left=0;
	  right=0;
	 }
	 else
	 {
	  if(left==0)
	   left=MAX-1;
	  else
	   left=left-1;
	 }
	 deque[left]=val;
	}
	//-------DELETE FROM RIGHT-------
	void delete_right()
	{
	 if(left==-1)
	 {
	  System.out.println("\nUNDERFLOW");
	  return;
	 }
	 System.out.println("\nThe deleted element is\n"+deque[right]);
	 if(left==right)          //Queue has only one element
	 {
	  left=-1;
	  right=-1;
	 }
	 else
	 {
	  if(right==0)
	   right=MAX-1;
	  else
	   right=right-1;
	 }
	}
	//-------DELETE FROM LEFT-------
	void delete_left()
	{
	 if(left==-1)
	 {
	  System.out.println("\nUNDERFLOW");
	  return;
	 }
	 System.out.println("\nThe deleted element is\n"+deque[left]);
	 if(left==right)          //Queue has only one element
	 {
	  left=-1;
	  right=-1;
	 }
	 else
	 {
	  if(left==MAX-1)
	   left=0;
	  else
	   left=left+1;
	 }
	}
	//-------DISPLAY-------
	void display()
	{
	 int front=left, rear=right;
	 if(front==-1)
	 {
	  System.out.println("\nQueue is Empty\n");
	  return;
	 }
	 System.out.println("\nThe elements in the queue are: ");
	 if(front<=rear)
	 {
	  while(front<=rear)
	  {
		System.out.println("\t"+deque[front]);
	   front++;
	  }
	 }
	 else
	 {
	  while(front<=MAX-1)
	  {
		System.out.println("\t"+deque[front]);
	   front++;
	  }
	  front=0;
	  while(front<=rear)
	  {
		System.out.println("\t"+deque[front]);
	   front++;
	  }
	 }
	 System.out.println("\n");
	}

}





class Dequeue
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		DequeImpl i1= new DequeImpl();
		do
 		{
			
  			System.out.println("\n1.Insert at right ");
  			System.out.println("\n2.Insert at left ");
  			System.out.println("\n3.Delete from right ");
  			System.out.println("\n4.Delete from left ");
  			System.out.println("\n5.Display ");
  			System.out.println("\n6.Exit");
  			System.out.println("\n\nEnter your choice ");
  			ch=sc.nextInt();
  			switch(ch)
  			{
  			 case 1:
  			  i1.insert_right();
  			  break;
  			 case 2:
  			  i1.insert_left();
  			  break;
  			 case 3:
  			  i1.delete_right();
  			  break;
  			 case 4:
  			  i1.delete_left();
  			  break;
  			 case 5:
  			  i1.display();
  			  break;
  			}
 		}while(ch<6);
	}	
}






















