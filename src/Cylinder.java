import java.awt.List;

class Cylinder extends RadialGeometry{
	//fields:
	private Point3D _axisPoint;
	private Vector _axisDirection;
	//C-tors:
	public Cylinder() 
	{
		super();
		_axisPoint = new Point3D(); 
		_axisDirection = new Vector();
	}
	public Cylinder(Cylinder cylinder) 
	{
		super(cylinder._radius);
		_axisPoint = new Point3D(cylinder._axisPoint);
		_axisDirection = new Vector(cylinder._axisDirection);
	}
	public Cylinder(double radius, Point3D axisPoint, Vector axisDirection)
	{
		super(radius);
		_axisPoint = new Point3D(axisPoint);
		_axisDirection = new Vector(axisDirection);
	}
	//Getters:
	public Point3D getAxisPoint() {return _axisPoint;}
	public Vector getAxisDirection() {return _axisDirection;}
	//Setters:
	public void setAxisPoint(Point3D axisPoint) {_axisPoint = axisPoint;}
	public void setAxisDirection(Vector axisDirection) {_axisDirection = axisDirection;}
	//functions:
	public List FindIntersections(Ray ray);
	public Vector getNormal(Point3D point);

}
