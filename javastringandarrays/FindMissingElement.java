package javastringandarrays;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,4,3,2,8,6,7};
		Arrays.sort(arr);

		//to find the length of an array
		int totalLen = arr.length;

		for (int i = 0; i < totalLen; i++) {

			if(i+1!=arr[i]) { 
				System.out.println("The missing element is " +(i+1));
				break;
				//System.out.println(arr[i]);
			}

		}



	}

}
