public class Coordinate implements Comparable<Coordinate>{
	//fields:
	private double _coordinate;
	//C-tors:
	public Coordinate () {_coordinate = 0;}
	public Coordinate (double coordinate) {_coordinate = coordinate;}
	public Coordinate (Coordinate coordinate) {_coordinate = coordinate._coordinate;}
	//Getter:
	public double getCoordinate () {return _coordinate;}
	//Setter:
	public void setCoordinate (double coordinate) {_coordinate = coordinate;}
	//functions:
	public int compareTo (Coordinate coordinate) {return (int)(_coordinate - coordinate._coordinate);}
	//operators:
	public void add (Coordinate coordinate) {_coordinate += coordinate._coordinate;}
	public void subtract (Coordinate coordinate) {_coordinate -= coordinate._coordinate;}
}
