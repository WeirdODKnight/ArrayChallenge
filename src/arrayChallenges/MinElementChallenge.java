package arrayChallenges;
import java.util.Scanner;

public class MinElementChallenge {


	//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs
	// to enter.
	//-The method needs to read from the console until all the numbers are entered, and then return an array containing the
	// numbers entered.
	//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
	//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
	//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
	//-Finally, print the minimum element in the array.
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of values:");
        int count = scanner.nextInt();
        int[] arr = readIntegers(count);
        System.out.println("The Minimum Number is: " + findMin(arr));
    }

    public static int[] readIntegers(int count) {
        int[] numbers = new int[count];
        System.out.printf("Enter %d numbers:\n", count);

        for (int i = 0; i < count; i++) {
           numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int findMin(int[] arr) {
       int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
               min = arr[i];
            }
        }

        return min;
    }
}