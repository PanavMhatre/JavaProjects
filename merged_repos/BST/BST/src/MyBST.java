
public class MyBST {
	IntTreeNode overallRoot;
	public int size() {
		return counter(overallRoot,0);
	}
	private int counter(IntTreeNode node, int counter) {
		if(node == null) {
			return 0;
		}
		counter = 1 + counter(node.left,counter) + counter(node.right, counter + 1);
		return counter;
	}
	public void insert(Integer n) {
		IntTreeNode temp = overallRoot;
		if(temp == null) {
			overallRoot = new IntTreeNode(n);
			return;
		}
		temp = insert(n, temp);
	}
	private IntTreeNode insert(Integer n, IntTreeNode temp) {
		if(temp == null) {
			temp = new IntTreeNode(n);
		}
		if(n < temp.val) {
			temp.left = insert(n, temp.left);
		}
		else if(n > temp.val) {
			temp.right = insert(n, temp.right);
		}
		return temp;
	}
	public boolean contains(Integer n) {
		IntTreeNode temp = overallRoot;
		boolean contains = contains(n, false, temp);
		return contains;
	}
	private boolean contains(Integer n, boolean b, IntTreeNode temp) {
		if(temp == null) {
			return false;
		}
		if(temp.val == n) {
			return true;
		}
		if(n < temp.val) {
			return contains(n, b, temp.left);
		}
		else if(n > temp.val) {
			return contains(n,b, temp.right);
		}
		return false;
	}
	public Integer getMax() {
		IntTreeNode temp = overallRoot;
		int n = getMax(Integer.MIN_VALUE, temp);
		return n;
	}
	public Integer getMax(Integer n, IntTreeNode temp) {
		if(temp == null) {
			return n;
		}
		
		if(temp.val > n) {
			n = temp.val;
		}
		
		return getMax(n, temp.right);
	}
	public Integer getMin() {
		IntTreeNode temp = overallRoot;
		int n = getMin(Integer.MAX_VALUE, temp);
		return n;
	}
	public Integer getMin(Integer n, IntTreeNode temp) {
		if(temp == null) {
			return n;
		}
		
		if(temp.val < n) {
			n = temp.val;
		}
		
		return getMin(n, temp.left);
	}
	public void delete(Integer n) {
		
	}
	
}

class IntTreeNode{
	Integer val;
	IntTreeNode left,right;
	public IntTreeNode(Integer val) {
		this.val = val;
		left = right = null;
	}
	public String toString() {return "" + this.val;}
}
