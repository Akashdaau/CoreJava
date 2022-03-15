package ParallelSorting;
import java.util.Arrays;

public class ParallelSort {
	public static void main(String[] args) {
		
	int[] arr = {1, 4, 3, 7, 2};
	
	Arrays.parallelSort(arr);
	
	for(int n: arr)
	{
		System.out.println(n);
	}
	//System.out.println(Arrays);
	
	

}
}