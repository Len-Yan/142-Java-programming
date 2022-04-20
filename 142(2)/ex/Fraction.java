
public class Fraction
{
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d)
	{
		if (d == 0)
			throw new ArithmeticException("cannot have zero denominator");
		numerator = n;
		if (numerator == 0)
			denominator = 1;
		else
		{
			denominator = d;
			int divisor = gcd(Math.abs(numerator), Math.abs(denominator));
			numerator /= divisor;
			denominator /= divisor;
		}
		if (denominator < 0)
		{
			numerator *= -1;
			denominator *= -1;
		}
	}
	
	public Fraction multiply(Fraction f)
	{
		int top = numerator * f.numerator;
		int bottom = denominator * f.denominator;
		return new Fraction(top, bottom);
	}
	
	public Fraction divide(Fraction f)
	{
		
	}
	
	public Fraction add(Fraction f)
	{
		
	}
	
	public Fraction subtract(Fraction f)
	{
		
	}
	
	public String toString()
	{
		if (denominator == 1)
			return numerator + "";
		return numerator + "/" + denominator;
	}
	
	private int gcd(int a, int b)
	{
		if (a < b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		while (a % b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		return b;
	}

}
