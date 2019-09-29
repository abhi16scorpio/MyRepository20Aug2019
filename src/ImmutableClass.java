import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ImmutableClass
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(11);
		myList.add(12);
		myList.add(14);
		myList.add(12);
		
		System.out.println("Arraylist: "+myList);
		
		LinkedHashSet<Integer> mySet = new LinkedHashSet<>(myList);
		
		System.out.println("LinkedHashSet: "+mySet);
	}
}