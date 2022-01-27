package self_learning_27;

public class circular_linked_list {
	static class Node 
	{ 
		int data; 
    		Node next; 
            	Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
}
Node head; 
circular_linked_list()   
{ 
head = null; 
} 
	void sortedInsert(Node new_node) 
	{ 
    		Node current = head; 
if (current == null) 
    		{ 
        			new_node.next = new_node; 
        			head = new_node; 
		} 
else if (current.data >= new_node.data) 
    		{ 
while (current.next != head) 
            			current = current.next; 
		 	current.next = new_node; 
        			new_node.next = head; 
        			head = new_node; 
    		} 
    		else
    		{
while (current.next != head && current.next.data < new_node.data) 
            			current = current.next; 
			new_node.next = current.next; 
        			current.next = new_node; 
    		} 
}
void printList() 
	{ 
    		if (head != null) 
   		{ 
        			Node temp = head; 
        			do
       			{ 
            			System.out.print(temp.data + " "); 
            			temp = temp.next; 
        			}  while (temp != head); 
    		} 
	}
public static void main(String[] args) 
	{ 
	circular_linked_list list = new circular_linked_list(); 
    		int arr[] = new int[] {0, 24, 2, 1, 51, 100}; 
    		Node temp = null; 
    		for (int i = 0; i < 6; i++) 
    		{ 
       			temp = new Node(arr[i]); 
        			list.sortedInsert(temp); 
    		} 
list.printList(); 
	}


}
