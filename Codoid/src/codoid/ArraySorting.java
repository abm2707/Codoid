package codoid;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		int temp = 0;

		// Performing sorting
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// Swap the elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Print the sorted array
		System.out.println("Sorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
