// objects of this class represent a point on the Cartesian plane
public class Point 
{
	private double xCoord;
	private double yCoord;
	
	public Point(double X, double Y)
	{
		xCoord = X;
		yCoord = Y;
	}
	
	public double getX()
	{
		return xCoord;
	}
	
	public double getY()
	{
		return yCoord;
	}
	
	// calculates the distance from this point to the parameter point
	public double distanceTo(Point p)
	{
		double deltaX = xCoord - p.xCoord;
		double deltaY = yCoord - p.yCoord;
		return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
	}
}
