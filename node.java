public class node{
	interval me;
	node left,right,parent;
	node max,min;
	public node(interval me, node parent, node left, node right) {
		this.me = me;
		this.left = left;
		this.right = right;
		this.parent = parent;
		this.max = null;
		this.min = null;
	}
	public void set_max(node max) {
		this.max = max;
	}
	public void set_min(node min) {
		this.min = min;
	}
	public void set_left(node left) {
		this.left = left;
	}
	public void set_right(node right) {
		this.right = right;
	}
	
}
