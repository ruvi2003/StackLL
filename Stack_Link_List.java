package StackLL;

		class Node {
		    int data;  // The value stored in the node
		    Node next; 

		   
		    Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		
		class Stack {
		    private Node top; 
		   
		    Stack() {
		        this.top = null;
		    }

		    
		    public void push(int data) {
		        Node newNode = new Node(data); 
		        newNode.next = top;            
		        top = newNode;                 
		        System.out.println("Pushed " + data + " onto the stack.");
		    }

		  
		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack underflow. Unable to pop."); 
		            return -1;
		        }
		        int poppedData = top.data; 
		        top = top.next;            
		        System.out.println("Popped " + poppedData + " from stack.");
		        return poppedData;         
		    }

		
		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty. Unable to peek.");
		            return -1; 
		        }
		        return top.data; 		    }

		    public boolean isEmpty() {
		        return top == null; 
		    }

		    
		    public void display() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty.");
		            return;
		        }
		        Node current = top; 
		        System.out.print("Stack elements: ");
		        while (current != null) {
		            System.out.print(current.data + " "); 
		            current = current.next; 
		        }
		        System.out.println();
		    }
		}

		
		public class Stack_Link_List {
		    public static void main(String[] args) {
		        Stack stack = new Stack(); 

		        // Perform stack operations
		        stack.push(50);
		        stack.push(60); 
		        stack.push(70); 

		        stack.display(); 

		        System.out.println("Top element: " + stack.peek()); 

		        stack.pop(); 
		        stack.pop(); 

		        stack.display(); 

		        System.out.println("Top element: " + stack.peek()); 
		    }
		
}

