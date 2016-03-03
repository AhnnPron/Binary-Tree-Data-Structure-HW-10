
public class TreeNode 
{
	TreeNode leftNode; 
	int value; //node value
	TreeNode rightNode;
	
	public TreeNode(int nodeValue) //initializes data and makes a leaf node (no children)
	{
		value = nodeValue; 
		leftNode = null; //no children
		rightNode = null; //no children
	}
	
	public void insert(int insertValue) 
	{
		if (insertValue < value) //insert in left subtree when the inserted value is less than the parent node
		{
			if (leftNode  == null)
				leftNode = new TreeNode(insertValue);
			else 
				leftNode.insert(insertValue);
		}
		else if (insertValue > value) //insert in right subtree when the inserted value is greater than the parent node
		{
			if (rightNode == null)
				rightNode = new TreeNode(insertValue); 
			else 
				rightNode.insert(insertValue);
		}
	}
}
