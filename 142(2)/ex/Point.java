
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
		xCoord = 0;
		yCoord = 0;
	}
	
	public double getX()
	{
		return xCoord;
	}
	
	public void setX(double x)
	{
		xCoord = x;
	}
}
