package sysImplementation;

public class Utilities {

	public static java.lang.String getArrayString​(int[] array, char separator) {

		// throw exception if array is null
		if (array == null) {

			throw new IllegalArgumentException();

		}
		// set new StringBuffer to append the strings
		StringBuffer str = new StringBuffer();

		//looping and assigning values in the str
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				str = str.append(array[i]).append(separator);
			} else {
				str = str.append(array[i]);
			}
		}
		//change StringBuffer to String
		return str.toString();
	}


	public static int getInstances​(int[] array, int lowerLimit, int upperLimit) {
		// throw exception if array is null
		if (array == null) {

			throw new IllegalArgumentException();
		}
		int limit = 0;
		//increase the limit  so that check how many numbers are in 
		//between lowerlimit and upperlimit
		for (int i = 0; i < array.length; i++) {

			if (array[i] >= lowerLimit && array[i] <= upperLimit) {
				limit++;
			}

		}
		return limit;
	}

	public static int[] filter​(int[] array, int lowerLimit, int upperLimit) {
		// throw exception if array is null 
		// or if lowerlimit is bigger than upperlimit
		if (array == null || lowerLimit > upperLimit) {

			throw new IllegalArgumentException();
		}
		//use getinstance method to assign the size to new array
		int size = 0;
		int count = 0;
		size =  getInstances​(array, lowerLimit, upperLimit);

		int[] update = new int [size];


		//increase the limit  so that check how many numbers are in 
		//between lowerlimit and upperlimit
		for (int i = 0 ; i < array.length; i++) {

			if (array[i] >= lowerLimit && array[i] <= upperLimit) {
				update[count] = array[i];
				count++;
			}
		}

		return update;
	}

	public static void rotate​(int[] array, boolean leftRotation, int positions) {
		// throw exception if array is null 
		if (array == null) {
			throw new IllegalArgumentException();
		}
		if (array.length >= 1) {
			if (leftRotation == true) { // if leftRotation is true, run leftRotate method
				for (int i = 0; i < positions; i++) {
					leftRotate(array, array.length);
				}
			} else if (leftRotation == false) { // if leftRotation is false, run rightRotate method
				for (int i = array.length; i > positions; i--) {
					rightRotate(array, array.length);
				}
			}
		}
	}
	//if leftRotation is true run this
	private static void leftRotate(int[] array, int size) {
		
		int first = array[0];

		for (int i = 0; i < size - 1; i++) {

			array[i] = array [i + 1];

		}
		array[size - 1] = first; //set last number to first

	}
	//if leftRotation is false, run this
	private static void rightRotate(int[] array, int size) {

		int last = array[0];
		int i;

		for ( i = 0; i < size - 1; i++) {

			array[i] = array [i + 1];

		}
		array[size - 1] = last; //set last number to first number
	}

	public static java.lang.StringBuffer[] getArrayStringsLongerThan​(java.lang.StringBuffer[] array, int length) {
		// throw exception if array is null 
		if (array == null) {
			throw new IllegalArgumentException();
		}

		int count = 0;
		//check if arrya size is grather than length
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > length) {		
				count++;
			}
		}
		// make new array with count value
		StringBuffer [] str = new StringBuffer[count];
		//copy the array
		for(int i = 0, j = 0; i < array.length; i++) {
			if (array[i].length() > length) {
				str[j++] = array[i];

			}
		}
		return str; //return new array
	}

}