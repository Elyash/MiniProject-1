public class Vector implements Comparable<Vector>{
	//fields:
	private Point3D _head;
	//C-tor:
	public Vector() {_head = new Point3D();}
	public Vector(Point3D head) {_head = new Point3D(head);}
	public Vector(Vector vector) {_head = new Point3D(vector._head);} 
	public Vector(double xHead, double yHead, double zHead) {_head = new Point3D(xHead, yHead, zHead);}
	public Vector(Point3D p1, Point3D p2)
	{
		_head = new Point3D(p1.getX().getCoordinate() - p2.getX().getCoordinate(),
				p1.getY().getCoordinate() - p2.getY().getCoordinate(),
				p1.getZ().getCoordinate() - p2.getZ().getCoordinate());
	}
	//Getters:
	public Point3D getHead() {return _head;}
	public void setHead(Point3D head)
	{
		_head = new Point3D(head);
		_head.setX(head.getX());
		_head.setY(head.getY());
		_head.setZ(head.getZ());
	}
	//functions:
	public int compareTo(Vector vector) {return _head.compareTo(vector.getHead());}
	public String toString() {return "To " + _head.toString();}
	//operators:
	public void add (Vector vector ) {_head.add(vector);}
	public void subtract (Vector vector) {vector.subtract(vector);}
	public void scale(double scalingFactor)
	{
		_head._x.setCoordinate(_head._x.getCoordinate()*scalingFactor);
		_head._y.setCoordinate(_head._y.getCoordinate()*scalingFactor);
		_head._z.setCoordinate(_head._z.getCoordinate()*scalingFactor);
	}
	public Vector crossProduct(Vector vector)
	{
		Vector v = new Vector();
		v.getHead().getX().setCoordinate(_head.getY().getCoordinate()*vector.getHead().getZ().getCoordinate() - 
				_head.getZ().getCoordinate()*vector.getHead().getY().getCoordinate());
		v.getHead().getY().setCoordinate(_head.getZ().getCoordinate()*vector.getHead().getX().getCoordinate() - 
				_head.getX().getCoordinate()*vector.getHead().getZ().getCoordinate());
		v.getHead().getZ().setCoordinate(_head.getX().getCoordinate()*vector.getHead().getY().getCoordinate() - 
				_head.getY().getCoordinate()*vector.getHead().getX().getCoordinate());
		return v;
	}
	public double length()
	{
		return _head.distance(new Point3D(0,0,0));
	}
	public void normalize() throws Exception // Throws exception if length = 0
	{
		if (this.length() == 0)
			 throw new Exception("Length of this vector is 0. can't normalize.");
		_head.getX().setCoordinate(_head.getX().getCoordinate() / length());
		_head.getY().setCoordinate(_head.getY().getCoordinate() / length());
		_head.getZ().setCoordinate(_head.getZ().getCoordinate() / length());
	}
	public double dotProduct(Vector vector)
	{
		return _head.getX().getCoordinate()*vector.getHead().getX().getCoordinate() +
				_head.getY().getCoordinate()*vector.getHead().getY().getCoordinate() +
				_head.getZ().getCoordinate()*vector.getHead().getZ().getCoordinate();
	}
}
