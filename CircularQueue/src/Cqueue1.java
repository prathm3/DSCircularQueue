
public class Cqueue1 {
	int[] arr;
	static int F=-1,R=-1;
	public Cqueue1() {
		this.arr = new int[5];
	}
	public Cqueue1(int value) {
		this.arr = new int[value];
	}
	public void insert(int value) {
		//full
		if((R==arr.length && F ==0)||(R+1 == F)) {
			System.out.println("Full");
		}else {
			if(F==-1) {
				R=F=0;

			}else {
				if(R== arr.length-1) {
					R = 0;
				}else
					R++;
			}

			arr[R] = value;
		}
		//first
		//after length
	}
	
	public void remove() {
		//empty
		if(F==-1) {
			System.out.println("Empty");
		}else {
			int value = arr[F];
			if(F==R) {
				F=R=-1;
			}
			else if(F==arr.length-1) {
				F=0;
			}else {
				F++;
			}
		}
	
	}
	public String toString() {
		String str ="";
		int i = F-1;
		while(true) {
			if(i==arr.length-1) {
				i=-1;
			}
			if(i+1==R) {
				str+= arr[i+1]+",";
				break;
			}
			
			i++;
			str += arr[i]+ ",";
		}
		return str;
	}

}
