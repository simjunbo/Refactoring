package chapter6.removeAssignmentsToParameters.after;

/**
 * 매개변수로의 값 대입 제거
 */
public class Example1 {
	private int discount(final int inputVal, final int quantity, final int yearToDate) {
		int result = inputVal;

		if (inputVal > 50) {
			result -= 2;
		}

		if (quantity > 100) {
			result -= 1;
		}

		if (yearToDate > 10000) {
			result -= 4;
		}
		return result;
	}
}
