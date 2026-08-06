class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class MaxLL{
	public static void main(String[]args){
		Node head=new Node(70);
		Node second=new Node(54);
		Node third=new Node(89);
		Node fourth=new Node(20);
		head.next=second;
		second.next=third;
		third.next=fourth;
		int max=0;
		Node temp=head;
		while(temp!=null){
			int store=temp.data;
			if(store>max){
				max=store;
			}
			temp=temp.next;
		}
		System.out.println(max);
	}
}

		