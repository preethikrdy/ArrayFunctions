package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import sysImplementation.Utilities;

public class StudentTests {

	@Test
	public void getArrayStringTest() {

		int [] array = {1,2,3,4,5};
		char c = ',';
		String answer = Utilities.getArrayString​(array,c);
		String expected = "1,2,3,4,5";
		assertEquals(answer, expected);
	}

	@Test
	public void getInstancesTest() {
		int [] array = {1,2,3,4,5};
		int lowerLimit = 2;
		int upperLimit = 5;
		int answer = Utilities.getInstances​(array, lowerLimit, upperLimit);
		int expected = 4;
		assertEquals(answer, expected);
	}

	@Test
	public void filtersTest() {
		int [] array = {2,3,4,5,6,7,8,9};
		int lowerLimit = 2;
		int upperLimit = 5;

		int[] arr = Utilities.filter​(array, lowerLimit, upperLimit);
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			if ((arr.length - 1) == i) {
				answer += arr[i];
			} else {
				answer += arr[i] + ",";
			}
		}
		String expected = "2,3,4,5";
		assertTrue(answer.equals(expected));
	}

	@Test
	public void rotateTest1() {
		int [] array = {3,4,5,6,7,8};
		int positions = 1;
		Utilities.rotate​(array, true, positions);

		String answer = "";
		String expected = "4,5,6,7,8,3";

		for (int i = 0 ; i < array.length ; i++) {
			if (i == (array.length - 1)) {
				answer += array[i];
			} else {
				answer += array[i] + ",";

			}
		}
		System.out.println(answer);
		assertTrue(answer.equals(expected));
	}
	@Test
	public void rotateTest() {

		int [] array = {3,4,5,6,7,8};
		int positions = 1;
		Utilities.rotate​(array, false, positions);

		String answer = "";
		String expected = "8,3,4,5,6,7";

		for (int i = 0 ; i < array.length ; i++) {
			if (i == (array.length - 1)) {
				answer += array[i];
			

			}
		}
		System.out.println(answer);
		assertTrue(answer.equals(expected));


	}
	@Test
	public void getArrayStringsLongerThan​Test() {
		StringBuffer a = new StringBuffer();
		a.append("Hi");
		StringBuffer b = new StringBuffer();
		b.append("Hello");
		StringBuffer c = new StringBuffer();
		c.append("Hola");
		StringBuffer[] ar = {a,b,c};
		StringBuffer[] answer;
		answer = Utilities.getArrayStringsLongerThan​(ar,3);
		String answers = "";
		for(StringBuffer i : answer) {
			answers += i;
		}
		String expected = "HelloHola";
		assertTrue(answers.equals(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenExceptionThrown() {
		Utilities.getArrayString​(null, ',');
		Utilities.getInstances​(null, 1,5);
		Utilities.filter​(null, 1,5);
		Utilities.rotate​(null, false, 3);
		Utilities.getArrayStringsLongerThan​(null, 5);
	}
}
