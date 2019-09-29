import java.util.Arrays;

public class Sorting_in_Java
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {23,55,22,57,88,44};
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After Soring: "+Arrays.toString(arr));
	}
}