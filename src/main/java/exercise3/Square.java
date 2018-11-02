package exercise3;

public class Square extends ConvexPolygon{

	public Square(Point upperLeft, Point lowerRight)
	{
		super(new Point[]{
			upperLeft, new Point(upperLeft.getX(),lowerRight.getY()),
			lowerRight, new Point(upperLeft.getY(),lowerRight.getX())
		});
	}

}
