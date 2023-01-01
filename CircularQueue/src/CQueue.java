
public class CQueue {
	int[] arr;
	static int F=-1,R=-1;
	public CQueue() {
		this.arr = new int[5];
	}
	public CQueue(int value) {
		this.arr = new int[value];
	}
	public void insert(int value) {
		if((F==0 && R==arr.length-1) || (R+1 == F) ){
			System.out.println("Full");
		}else {
			if(R==-1) {
				R=F=0;
			}else {
				if(R== arr.length -1) {
					R = 0;
				}else
					R++;
			}
			//R = (++R) % length
			arr[R] = value;
		}
	}
	public int remove() {
		int value = 0;
		if(R==-1) {
			System.out.println("EMpty");
		}else {
			value = arr[F];
			if(R==F) {
				R=F=-1;
			}else if(F== arr.length -1) {
				F= 0;
			}
			else {
				F++;
			}
		}
		return value;
	}
	public String toString() {
		String str  = "";
		if(F==-1) {
			str += "Empty";
		}
		else{for(int i =F; i<=R; ) {
			if(i == arr.length -1) {
				i = 0;
			}else {
				i++;
			}
			
			str += arr[i] + " ";
			if(i==F) {
				break;
			}
		}}
		return str;
	}
}
