package day1.sheet;

import java.util.Arrays;
import java.util.Scanner;

//REmove element 'n' all occurences put in end & return size of array(unique element)

public class Replace {
	
	
	static int removeElement1(int []arr, int num) {
		
		int j = 0; 
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!=num) {
				arr[j] = arr[i];
				j++;
			}
		}
		return j;
	}
	
	static int[] removeElement2(int []arr, int num){
		
		int j = 0; 
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!=num) {
				int temp = arr[j];
				arr[j]= arr[i];
				arr[i] = temp;
				j++;
			}
		}
		return arr;
	}
	
	
	
	public static void main(String []args) {
		Scanner scn  = new Scanner(System.in);
			
		System.out.println("Enter Size of array : ");
		int size = scn.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<size; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter element to remove its all occurences:");
		int num = scn.nextInt();
		
		// call function to remove a element all occurences and return new size (unique elements)
		
//		int newSize = removeElement1(arr,num);
		
//		System.out.println("New size without " + num + " is: "+ newSize);
		
		int newArr[] = removeElement2(arr,num);
		System.out.println("Elements are: "+ Arrays.toString(newArr));
		
		

	}
	
}
