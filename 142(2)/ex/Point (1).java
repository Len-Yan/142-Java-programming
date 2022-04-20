
public class Point 
{
	private double xCoord;
	private double yCoord;
	
	public Point(double x, double y)
	{
		xCoord = x;
		yCoord = y;
	}
	
	public Point()
	{
		this(0, 0);
	}
	
	public double distanceTo(Point p)
	{
		double xDist = xCoord - p.xCoord;
		double yDist = yCoord - p.yCoord;
		return Math.sqrt(xDist*xDist + yDist*yDist);
	}
}
