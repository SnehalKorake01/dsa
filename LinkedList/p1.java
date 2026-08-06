class Node{
	int data;
	Node next;
	Node (int data){
		this.data=data;
	}
}
 class CountLL{
	public static void main(String[]args){
		Node head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		head.next=second;
		second.next=third;
		third.next=fourth;
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		System.out.println(count);
	}
}
			
