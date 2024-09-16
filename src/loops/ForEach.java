package loops;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,8,3,4,5,6,7,2,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(arr[j]%2==0) {
					int temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] =temp1;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}	
	}
}
