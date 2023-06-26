package core.array;

import java.util.Arrays;

public class Code1 {
	// Arrays : Collection of similar objects and require continuous memory
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[10]; // An integer array of size 10 and initialize by their default values
		// int[] arr1 = {0,0,0,0,0,0,0,0,0,0};
		int []arr2 = new int[] {0,1,2,3,4,5,6,7,8,9};
		int arr3[] = {0,1,2,3,4,5,6,7,8,9};
		String id = "sfhd";
		
		
		
		int n = arr1.length; // length is an attribute of every array to get length of an array
		String str = "abcd";
		int len = str.length(); // length() method used in string to get length of an string
		
		String a = "str3";
		
		String[] strArray = {"str1", "str2", a, new String("str4")};
		
		int strArrayLen = strArray.length;
		System.out.println(strArray[0]);
//		System.out.println(strArray[5]); //ArrayIndexOutOfBoundsException
//		System.out.println(arr2.equals(arr3));
		
		int[] arr4 = arr2;
		System.out.println("Before in arr4: "+arr4[0]);
		System.out.println("Before in arr2: "+arr2[0]);
		arr2[0] = 10;
		System.out.println("After in arr4: "+arr4[0]);
		System.out.println("After in arr2: "+arr2[0]);
		
		int[] arr5 = Arrays.copyOf(arr2, 10); //Creates a copy: New Array in memory
		System.out.println("Before in arr5: "+arr5[1]);
		System.out.println("Before in arr2: "+arr2[1]);
		arr5[1] = 15;
		System.out.println("After in arr5: "+arr5[1]);
		System.out.println("After in arr2: "+arr2[1]);
		
		String[] arr = {"jch", "ojfe", "cndj", "ijd", "qojs", "zdkn"};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, "ojfe"));
		Arrays.sort(arr); // Time taken: O(n.Log(n))
		for(String s : arr) {
			System.out.print(s+"  ");
		}
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(Arrays.binarySearch(arr, "qojs")); // Time taken: O(log(n))
		
		
		int[] nums = new int[2000];
		for(int i=0;i<2000;i++) {
			nums[i] = 10;
		}
		System.out.println("Before sorting: " + System.currentTimeMillis());
		Arrays.sort(nums);
		System.out.println("After sorting: " + System.currentTimeMillis());
		
		Arrays.fill(nums, 10); // To set all the elements with a specific value
		
		System.out.println(Integer.parseInt(args[0])%2==0?"even":"odd");
		
	}

}
