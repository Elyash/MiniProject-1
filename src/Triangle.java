import java.awt.List;
import java.util.LinkedList;
import java.util.Map;

public class Triangle extends Geometry{
	//fields:
	private Point3D _p1;
	private Point3D _p2;
	private Point3D _p3;
	//C-tors:
	public Triangle()
	{
		_p1 = new Point3D();
		_p2 = new Point3D();
		_p3 = new Point3D();
	}
	public Triangle(Triangle triangle)
	{
		_p1 = new Point3D(triangle._p1);
		_p2 = new Point3D(triangle._p2);
		_p3 = new Point3D(triangle._p3);
	}
	public Triangle(Point3D p1, Point3D p2, Point3D p3)
	{
		_p1 = new Point3D(p1);
		_p2 = new Point3D(p2);
		_p3 = new Point3D(p3);
	}
	public Triangle(Map<String, String> attributes)
	{
		//we need to implement..
	}
	//Getters:
	public Point3D getP1() {return _p1;}
	public Point3D getP2() {return _p2;}
	public Point3D getP3() {return _p3;}
	//Setters:
	public void setP1(Point3D p1) {_p1 = p1;}
	public void setP2(Point3D p2) {_p2 = p2;}
	public void setP3(Point3D p3) {_p3 = p3;}
	//functions:
	public Vector getNormal(Point3D point) throws Exception
	{
		Vector aVector = new Vector(getP1(),getP2());
		Vector bVector = new Vector(getP1(),getP3());
		aVector.crossProduct(bVector);
		aVector.normalize();
		aVector.scale(-1);
		return aVector;
	}
	public LinkedList<Point3D> FindIntersections(Ray ray) throws Exception
	{
		Point3D p0 = new Point3D(ray.getPOO());
		Vector nVector = new Vector(this.getNormal(p0));
		Plane plane = new Plane(nVector,getP3());
		if (plane.FindIntersections(ray).size() == 0)
			return new LinkedList<Point3D>();
		Vector p_p0 = new Vector(p0, plane.FindIntersections(ray).pop());
		
	}

}
