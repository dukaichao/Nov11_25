package cn.dkc.Nov_25;

public class removeRepeat {
	public int moverepeat(int[] arr) {
		int i = 0;
		for(int j = 1;j<arr.length;j++) {
			if(arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		int[] arr = {0,2,2,3,3};
		int i = new removeRepeat().moverepeat(arr);
		for(int m = 0;m<i;m++)
			System.out.print(arr[m]+" ");
	}
}
