package cn.dkc.Nov_25;

public class removeTarget {
	public int removetatrget(int[] arr,int target) {
		int i = 0;
		for(int j = 0;j<arr.length;j++) {
			if(arr[j] != target) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = {0,2,2,3,3};
		int i = new removeTarget().removetatrget(arr, 3);
		for(int m = 0;m<i;m++) {
			System.out.print(arr[m]+" ");
		}
	}
}
