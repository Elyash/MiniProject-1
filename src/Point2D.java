public class Point2D implements Comparable<Point2D>{
	//fields:
	protected Coordinate _x;
	protected Coordinate _y;
	//C-tors:
	public Point2D() {_x = new Coordinate(); _y = new Coordinate();}
	public Point2D(Coordinate x, Coordinate y) {_x = new Coordinate(x); _y = new Coordinate(y);}
	public Point2D(Point2D point2D){_x = new Coordinate(point2D._x); _y = new Coordinate(point2D._y);}
	//getters:
	public Coordinate getX() {return _x;}
	public Coordinate getY() {return _y;}
	//setters:
	public void setX(Coordinate x) {_x.setCoordinate(x.getCoordinate());}
	public void setY(Coordinate y) {_y.setCoordinate(y.getCoordinate());;}
	//functions:
	public int compareTo(Point2D point2D) 
	{
		if (_x.compareTo(point2D.getX()) == 0 && _y.compareTo(point2D.getY()) == 0)
			return 0;
		return 1;
	}
}
