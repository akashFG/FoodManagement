import java.lang.*;
public class Box
{
	private double length;
	private double width;
	
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	
	
	public static void main(String args[])
	{
		Box b = new Box();
		
		b.setLength(3.7);
		b.setWidth(4.1);
		
		
		System.out.println("Length is: " + b.getLength());
		System.out.println("Width is: " + b.getLength());
		
		//cout<<"Length is: " << b.getLength() << endl;
		
		//System.out.print("Length is: " + b.getLength() + "\n");
	
	}
}