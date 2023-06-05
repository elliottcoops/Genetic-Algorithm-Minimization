package ga;

public class ObjectiveFunction {
	
	public double evaluateExpression(double x) {
		
		double value = insaneEquations(x);
		return value;
		
	}
	
	public double cubicPolynomial(double x) {
		
		// f(x) = 2x^3 - 9x^2 + 12x - 3
		// Answer should return 3
		double total = 0;
		
		total += 2 * (Math.pow(x, 3));
		total -= 9 * (Math.pow(x,2));
		total += 2;
		
		return total;
	}
	
	public double logarithmicTrig(double x) {
		
		// f(x) = cos(ln(x)) * x
		// Answer should return ~ 50 / 51
		double total = 0;
		
		total += (Math.cos(Math.log(x))) * x;
		if (Double.isNaN(total))
			return 0;
		
		return total;
		
	}
	
	public double insaneEquations(double x) {
		
		// sin(x-2)e^-x -2cos(x-2)xsin(x)ln(x)
		double total = 0;
		
		total += Math.sin(x-2) * Math.exp(-x);
		total -= (2 * Math.cos(x-2)) * x * Math.sin(x) * Math.log(x);
		
		return total;
	}

}
