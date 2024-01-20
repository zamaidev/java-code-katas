package GeeksForGeeks;

import java.util.Scanner;

class Node
{
	int data;
	Node next;

	Node(int x)
	{
		data = x;
		next = null;
	}
}

class GFG
{
	public static void makeLoop(Node head, Node tail, int x){
		if (x == 0) return;

		Node curr = head;
		for(int i=1; i<x; i++)
			curr = curr.next;

		tail.next = curr;
	}

	public static void main (String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();

			while(t--> 0)
			{
				int n = sc.nextInt();

				int num = sc.nextInt();
				Node head = new Node(num);
				Node tail = head;

				for(int i=0; i<n-1; i++)
				{
					num = sc.nextInt();
					tail.next = new Node(num);
					tail = tail.next;
				}

				int pos = sc.nextInt();
				makeLoop(head, tail, pos);

				if( LinkedListLoop.detectLoop(head) )
					System.out.println("True");
				else
					System.out.println("False");
			}
		}
	}
}

public class LinkedListLoop {
	public static boolean detectLoop(Node head){
		Node fast = head, slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
}
