// Java program to reverse Doubly Linked List.
class LinkedList{
static Node head;
static class Node{
int data;
Node next, prev;
Node (int d){
data=d;
next=prev=null;
}
}
Node head, tail=null;
/* Function to reverse the DLL.*/
void reverse(){
Node temp=null;
Node current=head;
/*Swap next and previous for all nodes of doubly linked list.*/
while(current!=null){
temp=current.prev;
current.prev=current.next;
current.next=temp;
current=current.prev;
}
// Swap the head and tail pointers.
temp=head;
head=tail;
tail=temp;
}
// Adding function addNode() to add nodes in the list.
public void addNode(int data){
Node newNode = new Node(data);
// Check if the list is empty.
if(head==null){
// Both head and tail will point to the newNode.
head=tail=newNode;
// head's prev will point to NULL.
head.prev=null;
// tail's next will also point to NULL.
tail.next=null;
}else{
// newNode will be added after the tail such that the tail's next will point to the newNode.
tail.next=newNode;
newNode.prev=tail;
// newNode will become the new tail.
tail=newNode;
// As it is last node, tail's next will point to null.
tail.next=null;
}
}
// display() will print out elements of the list.
public  void display(){
// Node current will point to head.
Node current=head;
if(head==null){
System.out.println("List is Empty.");
return;
}
while(current!=null){
// Prints each node by incrementing the pointer.
System.out.println(current.data+" ");
current=current.next;
}
}
public static void main(String[] args){
LinkedList dll = new LinkedList();
// Adding nodes to the list.
dll.addNode(1);
dll.addNode(2);
dll.addNode(3);
dll.addNode(4);
dll.addNode(5);
System.out.println("Original list is: ");
dll.display();
// Reverse the DLL.
dll.reverse();
// Display the reversed DLL.
System.out.println("Reversed list is: ");
dll.display();
}
}
// Original list is: 
// 1 2 3 4 5
// Reversed list is:
// 5 4 3 2 1
