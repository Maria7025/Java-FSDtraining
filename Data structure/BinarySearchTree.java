package javanewsample;

public class BinarySearchTree {
	
	class Node
	{
		int key;
		Node left,right;
		
		public Node(int data)
		{
			key = data;
			left=right=null;
		}
	}
	Node root;	
	BinarySearchTree()
	{
		root=null;
	}
	
	void insert(int key)
	{
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key) //recursive
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		if (key < root.key)
		{
            root.left = insertRec(root.left, key);
		}
        else if (key > root.key)
        {
            root.right = insertRec(root.right, key);
        }
		return root;		
	}
	void inorder()
    {
         inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null) 
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(12);
		bst.insert(6);
		bst.insert(9);
		bst.insert(15);
		bst.insert(11);
		bst.insert(13);
		bst.insert(5);
		bst.inorder();
		
		
	}

}
