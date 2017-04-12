import java.util.LinkedList;
public class Plane extends Geometry{ //Plane = ощиз
	//fields:
	private Vector _normal;
	private Point3D _Q;
	//C-tors:
	public Plane() {_normal = new Vector(); _Q = new Point3D();}
	public Plane (Plane plane) {_normal = new Vector(plane._normal); _Q = new Point3D(plane._Q);}
	public Plane (Vector normal, Point3D q) {_normal = new Vector(normal); _Q = new Point3D(q);}
	//Getters:
	public Vector getNormal(Point3D point) {return _normal;}
	public Point3D getQ() {return _Q;}
	//Setters:
	public void setNormal(Vector normal) {_normal = normal;}
	public void setQ(Point3D d) {_Q = d;}
	//functions:
	public LinkedList<Point3D> FindIntersections(Ray ray)
	{
		
	}


}
