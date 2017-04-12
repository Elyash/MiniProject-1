import java.awt.Color;
import java.util.LinkedList;
public abstract class Geometry {
	//fields:
	private Material _material = new Material();
	private double _nShininess = 1;
	private Color _emmission = new Color(0, 0, 0);
	//functions:
	public abstract LinkedList<Point3D> FindIntersections (Ray ray);
	public abstract Vector getNormal(Point3D point) throws Exception;
	//Getters:
	public double getShininess() {return _nShininess;}
	public Material getMaterial() {return _material;}
	public Color getEmmission() {return _emmission;}
	//Setters:
	public void setShininess(double n) {_nShininess = n;}
	public void setMaterial(Material material) {_material = material;}
	public void setEmmission(Color emmission) {_emmission = emmission;}
	public void setKs(double ks) {_material.setKs(ks);}
	public void setKd(double kd) {_material.setKd(kd);}
	public void setKr(double Kr) {_material.setKr(Kr);}
	public void setKt(double Kt) {_material.setKt(Kt);}
}
