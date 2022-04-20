
public class Circle
{
	public static final double PI = 3.14159;
	private Point center;
	private double radius;
	
	public Circle(Point c, double r)
	{
		center = c;
		radius = r;
	}
	
	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * PI * radius;
	}
	
	public boolean doesOverlap(Circle c)
	{
		double dist = center.distanceTo(c.center);
		return dist < radius + c.radius;
	}
}
