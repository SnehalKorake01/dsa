class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class SearchK{
	public static void main(String[]args){
		Node head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		head.next=second;
		second.next=third;
		third.next=fourth;
		int k=20;
		boolean isFound=false;
		Node temp=head;
		while(temp!=null){
			if(temp.data==k){
				isFound=true;
				break;
			}
			temp=temp.next;
		}
		if(isFound){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
		
	