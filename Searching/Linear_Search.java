import java.util.*;

public class Linear_Search{

	public static int linearSearch(int size, int arr[], int key){
		
		for(int i = 0; i < size; i++){
			
			if(arr[i] == key){
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();

		int result = linearSearch(size, arr, key);

		if(result == -1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at index " + result);
		}
	}
}
