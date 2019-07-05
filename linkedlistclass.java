package lll;

class Node{
	    int data;
	    Node next; }
	    

class LLTest{ 
    public static void main(String[] args)
    { LinkedList l= new LinkedList();
    l.insert(5);
    l.insert(10);
    l.insert(15);
    l.insert(34);
    l.insertm(1,7);
  //  l.print();
    
    }
 class LinkedList{
    Node head; 
    	
 void insert(int d){
    Node temp=new Node();
    temp.data=d;
    if(head==null)
    	head=temp;
    else{
        Node curr=head;
    	while(curr.next!=null)
    		curr=curr.next;
    		curr.next=temp;
    	}
 }
void insertm(int pos, int key) {
	Node temp= new Node();
    temp.data=key;
    if(pos!=0) 
    { Node curr= head;
      for(int i=0; i< pos;++i)
	     curr = curr.next;
      temp.next=curr.next;
      curr.next=temp; }
    else
    {  temp.next = head;
        head=temp; }
    }
void delete(int key)
{
	int pos= search(key);
	
	if(pos>0) {
		Node curr=head;
	   for(int i=0;i<pos-1;++i)
		  curr= curr.next;
	   Node temp = curr.next;
	   curr.next = temp.next;
	   temp.next=null; }
	else
		head = head.next;
}

int search(int key) {
	int pos=0;
	Node curr=head;
	while(curr!=null)
	{ if(curr.data==key)
		return pos;  
	else
	{ curr=curr.next;
	  ++pos;
	}
  }
return -1;
}
/*void insertf(int key[]) {
	Node temp=new Node();
	temp.data=key;
	temp.next=head;
	head=temp;
}
void deletef() {
	
}*/
