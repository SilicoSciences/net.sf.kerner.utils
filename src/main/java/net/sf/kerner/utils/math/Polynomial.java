package net.sf.kerner.utils.math;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {

	private final List<Double> elements;

	public Polynomial(int size) {
		elements = new ArrayList<Double>(size);
	}

	public Polynomial() {
		this(10);
	}
	
	public synchronized double calculate(double y){
		double result = 0;
		for (int x = elements.size() - 1; x > -1; x--) {
			double d = elements.get(x);
//			System.out.println("d="+d + ",x="+x);
			if(x > 0)
			result += (d * Math.pow(y, x));
			else
				result += d;
//			System.out.println("result="+result);
		}
		return result;
	}

	public synchronized void add(int pos, double element) {
		elements.add(pos, element);
	}

	public synchronized Polynomial getDerivate() {
		final Polynomial result = new Polynomial();
		for (int i = 1; i < elements.size(); i++) {
			double element = elements.get(i);
			result.add(i-1, element * i);
		}
		return result;
	}
	
	public synchronized double[] getPolynoms(){
		final double[] result = new double[elements.size()];
		for(int i=0;i<elements.size(); i++){
			result[i] = elements.get(i);
		}
		return result;
	}

	@Override
	public synchronized String toString() {
		final StringBuilder sb = new StringBuilder();
		for (int x = elements.size() - 1; x > -1; x--) {
			sb.append(String.format("%10.6f", elements.get(x)) + (x > 0 ? "x^" + x + " + " : ""));
		}
		return sb.toString();
	}

}
