
public abstract class RadialGeometry extends Geometry{
	//fields:
	protected double _radius;
	//C-tors:
	public RadialGeometry() {super();_radius = 0;}
	public RadialGeometry(double radius) {super();_radius = radius;}
	//Getters:
	public double getRadius() {return _radius;}
	//Setters:
	public void setRadius(double radius) {_radius = radius;}
}
