import java.util.Iterator;

public class MyBST <T extends Comparable<T>> implements Iterable<T> {
	private BinaryNode overallRoot;
	public MyBST() {
		overallRoot = null;
	}
	public MyBST(BinaryNode overallRoot) {
		this.overallRoot = overallRoot;
	}
	public boolean contains(T val) {
		return contains(val, overallRoot);
	}
	public boolean contains(T val, BinaryNode root) {
		if (root == null)
			return false;
		else {
			int compare = val.compareTo(root.data);
			if (compare == 0)
				return true;
			else if (compare < 0)
				return contains(val, root.left);
			else
				return contains(val, root.right);
		}
	}
	public T get(T val) {
		return get(val, overallRoot);
	}
	private T get(T val, BinaryNode root) {
		if (root == null)
			return null;
		else {
			int compare = val.compareTo(root.data);
			if (compare == 0)
				return root.data;
			else if (compare < 0)
				return get(val, root.left);
			else
				return get(val, root.right);
		}
	}
	public void add(T val) {
		overallRoot = add(val, overallRoot);
	}
	private BinaryNode add(T val, BinaryNode root) {
		if (root == null)
			root = new BinaryNode(val);
		else {
			int compare = val.compareTo(root.data);
			if (compare < 0)
				root.left = add(val, root.left);
			else if (compare > 0)
				root.right = add(val, root.right);
		}
		return root;
	}
	public T remove(T val) {
		T target = get(val);
		if(target != null)
			overallRoot = remove(val, overallRoot);
		return target;
	}
	private BinaryNode remove(T val, BinaryNode root) {
		if(root == null)
			return null;
		int compare = val.compareTo(root.data);
		if(compare < 0)
			root.left = remove(val, root.left);
		else if(compare > 0)
			root.right = remove(val, root.right);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else {
				BinaryNode min = findMin(root.right);
				root.data = min.data;
				root.right = remove(root.data, root.right);
			}
		}
		return root;
	}
	private BinaryNode findMin(BinaryNode root) {
		while(root.left != null)
			root = root.left;
		return root;
	}
	public Iterator<T> iterator() {
		return new TreeIterator<>(overallRoot);
	}
	private class BinaryNode {
		public T data;
		public BinaryNode left, right;
		public BinaryNode(T data) {
			this.data = data;
		}
	}
}