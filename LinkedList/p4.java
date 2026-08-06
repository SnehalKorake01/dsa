class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class MinLL{
	public static void main(String[]args){
		Node head=new Node(70);
		Node second=new Node(54);
		Node third=new Node(89);
		Node fourth=new Node(20);
		head.next=second;
		second.next=third;
		third.next=fourth;
		int min=Integer.MAX_VALUE;
		Node temp=head;
		while(temp!=null){
			int store=temp.data;
			if(store<min){
				min=store;
			}
			temp=temp.next;
		}
		System.out.println(min);
	}
}
		