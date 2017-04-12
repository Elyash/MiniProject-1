import java.util.LinkedList;
import java.util.Map;
class Sphere extends RadialGeometry{
	//fields:
	private Point3D _center;
	//C-tors:
	public Sphere() {super(); _center = new Point3D();}
	public Sphere (Sphere sphere) {super(sphere._radius);_center = new Point3D(sphere._center);} 
	public Sphere(double radius, Point3D center) {super(radius); _center = new Point3D(center);}
	public Sphere(Map<String, String> attributes) {} // - what to do?
	//Getters:
	public Point3D getCenter() {return _center;}
	//Setter:
	public void setCenter(Point3D center) {_center = center;}
	//functions:
	public LinkedList<Point3D> FindIntersections(Ray ray)
	{
		
	}
	public Vector getNormal(Point3D point) throws Exception
	{
		Vector aVector = new Vector(_center, point);
		aVector.normalize();
		return aVector;
	}
}
