package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int CommonDenominator(Fraction f1, Fraction f2) {
		return f1.getDenominator() * f2.getDenominator();
	}
	
	
	
	public static String Sum(Fraction f1, Fraction f2) {
		return f1.getNumerator()*((double) f1.CommonDenominator(f1, f2)/f1.getDenominator()) + 
				(f2.getNumerator()*((double) f2.CommonDenominator(f1, f2)/f1.getDenominator()) 
				+ "/" + f1.CommonDenominator(f1, f2));
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction (2,2);
		System.out.println(f1.Sum(f1,f2));
	}
}
