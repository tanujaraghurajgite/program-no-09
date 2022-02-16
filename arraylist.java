//PROGRAM NO:9 write a java program to remove element from an arraylist
import java.io.*;
import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		int arr[]={34,56,78,98,76,65,20,99,11,47,66};
		System.out.println("original array:"+Arrays.toString(arr));
		int removeIndex=1;
		for(int i=removeIndex; i< arr.length-1; i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println("After removing the element="+Arrays.toString(arr));
	}
}


