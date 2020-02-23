
public class tree {
	node root;
	public void insert_recursion(node x,double a,double e) {
		if(x==null) {
			interval s = new interval(a,a);
			x=new node(s,null,null,null);
		}else if(x.me.low<=a && x.me.high>=a) {
			
		}else if(x.me.low-e > a) {
			insert_recursion(x.left,a,e);
		}else if(x.me.high+e < a) {
			insert_recursion(x.right, a, e);
		}else if(x.me.low-e < a) {
			if(x.left==null) {
				x.me.low = a;
			}else {
				if(x.max.me.high+e < a) {
					x.me.low = a;
				}else {
					node y = x.left;
					node z = x.left;
					while(y.right != null) {
						z=y;
						y=y.right;
					}
					if(y.me.high + e <a) {
						x.me.low = a;
					}else {
						x.me.low = y.me.low;
					}
					z.right = y.left;
				}
			}
		}else if(x.me.high+e > a) {
			if(x.right==null) {
				x.me.high=a;
			}else {
				node y = x.right;
				node z = x.right;
				while(y.left != null) {
					z=y;
					y=y.left;
				}
				if(y.me.low-e > a) {
					x.me.high = a;
				}else {
					x.me.high = y.me.high;
					z.left = y.right;
				}
			}
		}
	}
}
