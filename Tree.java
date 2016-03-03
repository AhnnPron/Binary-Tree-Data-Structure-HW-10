
public class Tree 
{
	private TreeNode root; 
	
	public Tree() //empty tree of integers 
	{
		root = null; 
	}
	
	public void insertNode(int insertValue) //inserts a new node in the binary tree
	{
		if (root == null)
			root = new TreeNode(insertValue); //creates the root node here
		else
			root.insert(insertValue); //calls the insert method in TreeNode
	}
}
