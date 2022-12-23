// import java.util.Scanner;

// public class Factorial {
//     public static void main(String args[])
//     {
//         int n,i,fact=1;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number:");
//         n= sc.nextInt();
//         sc.close();
//         for(i=1;i<=n;i++)
//         {
//             fact=fact*i;
//         }
//         System.out.println("The factorial is:"+fact);
//     }
// }

// class Factorial
//  {       public static void main(String args[]) 
//          {         Integer iOb = 100;
//             Double dOb = 98.6;
//             dOb = dOb + iOb;
//             System.out.println("dOb after expression: " + dOb);

        
           
//     }}

import java.util.*;

class inputDequeue
{
	int MAX=100;
    int deque[]=new int[MAX];
    int tail;
    int head;
    int value;
    Scanner sc=new Scanner(System.in);
    inputDequeue(){
		head=tail=-1;
	}
    
void compile()
{
	int ch2;
        Scanner sc=new Scanner(System.in);
		do{
		System.out.println("\n\nDEQUE IMPLEMENTATION");
        System.out.println("\n 1.Insert at right");
		System.out.println("\n 2.Insert at left");
        System.out.println("\n 3.Delete from left");
        System.out.println("\n 4.Delete from right");
        System.out.println("\n 5.Display");
        System.out.println("\n 6.Quit");
        System.out.println("\n Enter your option : ");
        ch2=sc.nextInt();
		switch (ch2)  
		{   
			case 1:    insertAtTail();    
					break;   
			case 2:    insertAtHead();    
					break;   
			case 3:    deleteAtHead();    
					break;   
			case 4:    deleteAtTail();    
					break;  
			case 5:    display();    
					break;  
		} 
		}while(ch2!=6);
}
void insertAtTail()
{
        

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value to be added:\n");
    value=sc.nextInt();
    
    
    if ( (head == 0 && tail == MAX-1 ) || (head == tail+1) )
	{  
		System.out.println("\n OVERFLOW");
	    return; 
	}
	if (head == -1) 	// Queue is Empty Inititally
	{  
		head = 0;  
		tail = 0;
    } 
	else 
	{
  		if (tail == MAX-1) 	//right is at last position of queue    
			tail = 0;
	  	else   
	  		tail = tail+1; 
	} 
	
    deque[tail] = value ; 
}
void insertAtHead() 
{ 
	 
    Scanner sc=new Scanner(System.in);
	 System.out.println("\n Enter the value to be added:"); 
	 value=sc.nextInt(); 
     
    
	if( (head ==0 && tail == MAX-1) || (head == tail+1) )
	{  
        System.out.println("\n OVERFLOW");  
		return; 
	}
	if (head == -1)			//If queue is initially empty
	{  
		head = 0;  
		tail = 0; 
	} 
	else 
	{  
		if(head == 0)
		    head = MAX-1 ;  
		else   
		    head = MAX-1 ; 
	} 
	deque[head] = value; 
}
void deleteAtHead() 
{ 
	if ( head == -1 ) 
	{  
		System.out.println("\n UNDERFLOW");  
		return ; 
	}
	System.out.println("\n The deleted element is : "+deque[head]);
	if (head == tail) 										 
	{  
		head = -1 ;  
		tail = -1 ; 
	} 
	else 
	{  
		if ( head == 49 )   
		    head = 0;  
		else   
		    head = head+1; 
	} 
} 	
void deleteAtTail() 
{ 
	if ( head == -1 ) 
	{  
		System.out.println("\n UNDERFLOW");
		return ; 
	} 
	System.out.println("\n The element deleted is : "+deque[tail]); 
	if (head == tail) 											
	{  	
		head = -1 ;  
		tail = -1 ; 
	} 
	else 
	{  
		if (head == 0)   
			tail = MAX-1;  
		else   
			tail = tail - 1 ; 
	} 
} 
void display() 
{ 
	int front = head;
	int rear = tail;
	if ( front == -1 ) 
	{  
        System.out.println("\n QUEUE IS EMPTY");  
		 return; 
	} 
	
	System.out.println("\n The elements of the queue are : ");
	if (front <= rear ) 
	{  
		while (front <= rear)  
		{   
			System.out.println(deque[front]+" ");   
			front++;  
		} 
	} 
	else 
	{  
		
	     while (front <= MAX-1)  
	     {   
		          System.out.println(deque[front]+" ");   
			front++;  
	    }  
		front = 0; 
	    while (front <= rear)  
	    {   
	    	System.out.println(deque[front]+" ");   
	    	front++;  
	    } 
	} 
	System.out.println();
        // if (front<rear){
                // for (int j=front+1; j<=rear; j++)
                // System.out.println(deque[j]+" ");
        //     }
        //     else if(front==rear){
                // System.out.println("Empty\n");
                // return;
        //     }
        //     else{
                // for (int j=front; j<MAX; j++)
                // System.out.println(deque[j]+" ");
                // for (int j=0; j<rear; j++)
                // System.out.println(deque[j]+" ");
// }
    
}

    
}

class Factorial
{
    public static void main(String args[])
    {
        int opt;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("\n ----MAIN MENU----");
		System.out.print("\n 1.Deque implementation");
                System.out.print("\n Enter your option : ");
                opt=sc.nextInt();
                        
                switch(opt)
                {
                                case 1:inputDequeue i1=new inputDequeue();
                                           i1.compile();
                                           break;
                                default: System.out.print("Invalid choice");
                                           break;
                                      
                }    
        }
}    
