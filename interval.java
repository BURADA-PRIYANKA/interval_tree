public class interval {
	double high;
	double low;
	
	public interval(double low,double high) {
		this.high = high;
		this.low = low;
	}
	
	public void set_low(double low) {
		this.low = low;
	}
	public void set_high(double high) {
		this.high = high;
	}
	public void merge_interval(interval a) {
		if(this.low>a.high) {
			this.low = a.low;
		}else {
			this.high = a.high;
		}
	}
}