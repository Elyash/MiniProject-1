
public class Ray {
	//fields:
	// Point of origin
	private Point3D _POO;
	// Ray direction
	private Vector _direction;
	//C-tors:
	public Ray() {_POO = new Point3D(); _direction = new Vector();}
	public Ray(Ray ray) {_POO = new Point3D(ray._POO); _direction = new Vector(ray._direction);}
	public Ray(Point3D poo, Vector direction) {_POO = new Point3D(poo); _direction = new Vector(direction);}
	//Getters:
	public Vector getDirection() {return _direction;}
	public Point3D getPOO() {return _POO;}
	//Setters:
	public void setPOO(Point3D _poo) {_POO = _poo;} 
	public void setDirection(Vector _Direction) {_direction = _Direction;}
}
