package Day16_Tree_BST;

import java.util.*;

public class BST<T extends Comparable<T>> {

	Scanner sc = new Scanner(System.in);

	Node<T> root;

	public BST() {
		root = null;
	}

	boolean isEmpty() {
		return root == null;
	}

	void insertData(T data) {
		root = insert(root, data);
	}

	private Node<T> insert(Node<T> root, T data) {

		if (root == null) {
			return new Node<>(data);
		}

		if (data.compareTo(root.getData()) < 0) {
			root.setLeft(insert(root.getLeft(), data));
		} else if (data.compareTo(root.getData()) > 0) {
			root.setRight(insert(root.getRight(), data));
		}

		return root;
	}

	void Display() {

		boolean flag = true;

		while (flag) {
			System.out.println("1. Inorder");
			System.out.println("2. PreOrder");
			System.out.println("3. PostOrder");
			System.out.println("0 Exit");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				Inorder(root);
				break;
			case 2:
				PreOrder(root);
				break;
			case 3:
				PostOrder(root);
				break;
			case 0:
				flag = false;
				break;

			}

		}
	}

	void PreOrder(Node<T> temp) {
	    if (temp != null) {
	        System.out.println(temp.getData());
	        PreOrder(temp.getLeft());
	        PreOrder(temp.getRight());
	    }
	}

	void Inorder(Node<T> temp) {
	    if (temp != null) {
	        Inorder(temp.getLeft());
	        System.out.println(temp.getData());
	        Inorder(temp.getRight());
	    }
	}

	void PostOrder(Node<T> temp) {
	    if (temp != null) {
	        PostOrder(temp.getLeft());
	        PostOrder(temp.getRight());
	        System.out.println(temp.getData());
	    }
	}

	void deletedata(T data) {
		
		root= delete( data , root);
		
	}

	Node<T> delete(T data , Node<T> temp) {
		
		if(temp == null) {
			System.out.println("Empty !!");
			return null;
		}
		
		if(data.compareTo(temp.getData())<0) {
			
			temp.left = delete(data,temp.left);
			return temp;
			
		}else if( (data.compareTo(temp.data) > 0) ) {
			
			temp.Right = delete(data,temp.Right);
			return temp;
		}else {
			
			if(temp.left == null && temp.Right==null) {
				return null;
			}
			if(temp.Right==null) {
				return temp.left;
			}
			
			if(temp.left==null) {
				return temp.Right;
			}
			else {
				Node x = temp.Right;
				
				while(x.left!=null) {
					x = x.left;
					
				}
				
				temp.data = (T) x.data;
				
				temp.Right=delete( (T) x.data,temp.Right);
				return temp;
				
				
			}
			
		}
		
		
		
		
		
		
		
	}

}
