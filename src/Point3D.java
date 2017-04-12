import java.lang.String;
public class Point3D extends Point2D{
	//fields:
	Coordinate _z;
	//C-tors:
	public Point3D() {super(); _z = new Coordinate();}
	public Point3D(Coordinate x, Coordinate y, Coordinate z) {super(x,y); _z = new Coordinate(z);}
	public Point3D(double x, double y, double z) 
	{ 
		_x = new Coordinate(x);
		_y = new Coordinate(y);
		_z = new Coordinate(z);
	} 
	public Point3D(Point3D point3D)
	{
		_x = new Coordinate(point3D.getX());
		_y = new Coordinate(point3D.getY());
		_z = new Coordinate(point3D.getZ());
	}
	//getters:
	public Coordinate getZ() {return _z;}
	//setters:
	public void setZ (Coordinate z) {_z = z;} 
	//functions:
	public int compareTo (Point3D point3D)
	{
		if (point3D.getX().compareTo(_x) == 0 && point3D.getY().compareTo(_y) == 0 && point3D.getZ().compareTo(_z) == 0)
			return 0;
		return 1;
	}
	public String toString () {return String.format("(.%2f,_.%2f,_.%2f)", _x.getCoordinate(), _y.getCoordinate(), _z.getCoordinate());}
	//operators:
	public void add (Vector vector) 
	{
		_x.add(vector.getHead().getX());
		_y.add(vector.getHead().getY());
		_z.add(vector.getHead().getZ());
	}
	public void subtract (Vector vector)
	{
		_x.subtract(vector.getHead().getX());
		_y.subtract(vector.getHead().getY());
		_z.subtract(vector.getHead().getZ());
	}
	public double distance (Point3D point)
	{
		point.getX().subtract(_x);
		point.getY().subtract(_y);
		point.getZ().subtract(_z);
		return Math.pow(Math.pow(point.getX().getCoordinate(), 2) + Math.pow(point.getY().getCoordinate(), 2) + Math.pow(point.getZ().getCoordinate(), 2), 0.5);
	}
}
