// objects of this class represent a polygon whose vertices are represented by Points
public class Polygon 
{
	private Point[] vertices;  // stores the Points that represent the vertices of the polygon
	
	public Polygon(Point[] v)
	{
		vertices = v;
	}
	
	// returns the perimeter of the polygon
	public double perimeter()
	{
		double total = 0;
		for (int i=0; i<vertices.length-1; i++)
			total += vertices[i].distanceTo(vertices[i+1]);
		total += vertices[0].distanceTo(vertices[vertices.length-1]);
		return total;
	}
}
