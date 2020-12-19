public class MyRectangle
{


	
	private int startX, startY, width, height;
	
	public MyRectangle()
	
	{
	
	//Default Constructor
	
		startX = 0;
	
		startY = 0;
		
		width = 0;
		
		height = 0;
	
	}
	
	public MyRectangle(int x, int y, int w, int h)
	
	{
	
		//Initialize instance variables on parameters
		
		startX = x;
		
		startY = y;
		
		width = w;
		
		height = h;
	
	}
	
	public int area()
	
	{
	//returns are of the rectangle
		return width*height;
	
	}
	
	public String toString()
	
	{
	
		StringBuilder S = new StringBuilder();
		
		S.append("Width: " + width);
		
		S.append(" Height: " + height);
		
		S.append(" X: " + startX);
		
		S.append(" Y: " + startY);
		
		return S.toString();
	
	}
	
	public boolean isInside(int x, int y)
	
	{
	
		int x1 = startX;
		int y1 = startY;
		int x2 = x1 + width;
		int y2 = y1 + height;
		
		if (x >= x1 && x <= x2 && y >= y1 && y <= y2)
		
			return true;
			
			return false;
		
	}
	
	public void setSize(int newWidth, int newHeight)
	
	{
	
	//update width and height
	
		width = newWidth;
		
		height = newHeight;
	
	}
	
	public void setPosition(int newX, int newY)
	
	{
	
	//update startX and startY
		
		startX = newX;
		
		startY = newY;
	
	}
	
}