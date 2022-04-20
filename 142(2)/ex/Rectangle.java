
public class Rectangle
{
	private int lowX;
	private int lowY;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int w, int h)
	{
		lowX = x;
		lowY = y;
		width = w;
		height = h;
	}
	
	public int getArea()
	{
		return width * height;
	}
}
