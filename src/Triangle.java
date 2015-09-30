
public class Triangle extends GeometricObject {
	private double Side1 = 1.0;
	private double Side2 = 1.0;
	private double Side3 = 1.0;

	public Triangle() {
	}

	public Triangle(double Side1, double Side2, double Side3) {
		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;
	}

	/** Return Side1 */
	public double getSide1() {
		return Side1;
	}

	/** Set a new Side1 */
	public void setSide1(double Side1) {
		this.Side1 = Side1;
	}

	/** Return SideB */
	public double getSide2() {
		return Side2;
	}

	/** Set a new Side2 */
	public void setSide2(double Side2) {
		this.Side2 = Side2;
	}

	/** Return Side3 */
	public double getSide3() {
		return Side3;
	}

	/** Set a new Side3 */
	public void setSide3(double Side3) {
		this.Side3 = Side3;
	}

	@Override /** Return Perimeter */
	public double getPerimeter() {
		return (Side1 + Side2 + Side3);
	}

	@Override /** Return Area */
	public double getArea() {
		// First get half of perimeter value
		double HP = getPerimeter() / 2;
		return Math.sqrt(HP * ((HP - Side1) * (HP - Side2) * (HP - Side3)));
	}

	// toString method
	public String toString() {
		return "Triangle: Side 1 = " + Side1 + " Side 2 = " + Side2 + " Side 3 = " + Side3;
	}
}
