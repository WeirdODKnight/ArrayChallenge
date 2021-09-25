package arrayChallenges;
import java.util.Arrays;

public class ReverseArrayChallenge {

	/**
	 * Write a method called reverse() with an int array as a parameter.
	 * The method should not return any value. In other words, the method is allowed to modify the array parameter.
	 * In main() test the reverse() method and print the array both reversed and non-reversed.
	 * To reverse the array, you have to swap the elements, 
	 * so that the first element is swapped with the last element and so on.
	 * For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		// Print non reverse array
		reverse(array);
	}
	
	public static void reverse(int[] array) {
		// Non reverse array
		int[] nonReversedArray = new int[array.length];
		for(int i = 0; i < nonReversedArray.length; i++) {
			nonReversedArray[i] = array[i];
		}
		System.out.println("Non reverse array = " + Arrays.toString(nonReversedArray));
		// Reverse array
		int[] reverseArray = new int[array.length];
		for(int i = 0; i < reverseArray.length; i++) {
			reverseArray[i] = array[i];
		}
		
		for(int i = 0; i < reverseArray.length / 2; i++) {
			int temp = reverseArray[i];
			reverseArray[i] = reverseArray[reverseArray.length - i - 1];
			reverseArray[reverseArray.length - i - 1] = temp;
		}
		System.out.println("Reverse array = " + Arrays.toString(reverseArray));
	}

}