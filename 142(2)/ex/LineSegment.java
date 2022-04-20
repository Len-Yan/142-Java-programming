// objects of this class represent a line segment on the Cartesian plane
public class LineSegment 
{
	private Point p1;  // one endpoint
	private Point p2;  // the other endpoint
	
	public LineSegment(Point a, Point b)
	{
		p1 = a;
		p2 = b;
	}
	
	// returns the slope of the line segment or NaN for a vertical line segment
	public double slope()
	{
		double deltaX = p1.getX() - p2.getX();
		double deltaY = p1.getY() - p2.getY();
		if (deltaX == 0)
			return Double.NaN;
		return deltaY / deltaX;
	}
	
	// returns the length of the line segment
	public double length()
	{
		return p1.distanceTo(p2);
	}
}
