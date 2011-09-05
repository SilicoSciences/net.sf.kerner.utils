package net.sf.kerner.utils.math;

import java.util.Arrays;
import java.util.List;

import net.sf.kerner.utils.counter.Counter;

public class MathUtils {

	private MathUtils() {
	}

	/**
	 * Round a floating point number ({@code double}) with an accuracy up to
	 * given decimal place.
	 * 
	 * @param number
	 *            {@code double} that is rounded to given decimal place
	 * @param decimalPlace
	 *            decimal place to which given {@code double} is rounded
	 * @return rounded {@code double}
	 */
	public static double round(double number, int decimalPlace) {
		int n = decimalPlace;
		Counter c = new Counter();
		while (n > 10) {
			n = n / 10;
			c.count();
		}

		decimalPlace = decimalPlace + c.getCount();
		// System.out.println("number: " + number + ", digits: " +
		// decimalPlace);
		final double factor = Math.pow(10, decimalPlace);
		final double result = Math.round(number * factor) / factor;
		// System.out.println("result: " + result);
		return result;
	}

	public static int max(Integer... values) {
		int result = Integer.MIN_VALUE;
		for (int i : values) {
			if (i > result)
				result = i;
		}
		return result;
	}

	public static int min(Integer... values) {
		int result = Integer.MAX_VALUE;
		for (int i : values) {
			if (i < result)
				result = i;
		}
		return result;
	}

	public static double average(Double... values) {
		return average(Arrays.asList(values));
	}
	
	public static double average(List<Double> values) {
		return sum(values) / values.size();
	}
	
	public static double sum(List<Double> values) {
		double result = 0;
		for (Double d : values) {
			
			// Ignore null values
			
			if(d != null)
			result += d;
		}
		return result;
	}

	public static double sum(Double... values) {
		return sum(Arrays.asList(values));
	}
}
