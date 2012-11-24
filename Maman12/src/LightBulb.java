/**
 * 
 * @author Raskanskyz. This class is a representation of a LightBulb.
 */
public class LightBulb {

	RGBColor color; 
	boolean _switchedOn;

	/**
	 * This constructor creates A LightBulb object with three given parameter
	 * (RGB)
	 * 
	 * @param red
	 *            the intensity of the red color to be set to this LightBulb
	 *            object.
	 * @param green
	 *            the intensity of the green color to be set to this LightBulb
	 *            object.
	 * @param blue
	 *            the intensity of the blue color to be set to this LightBulb
	 *            object.
	 */
	public LightBulb(int red, int green, int blue) {
		_switchedOn = false;

		final int min = 0;
		final int max = 255;
		if (red < min || red > max || green < min || green > max || blue < min
				|| blue > max) {
			color = new RGBColor();
		}// if
		else {
			color = new RGBColor(red, green, blue);
		}// else
	}// CTOR1

	/**
	 * This constructor creates a LightBulb object from an RGBColor object.
	 * 
	 * @param other
	 *            An RGBColor object from which this LightBulb object is to be
	 *            initialized from.
	 */
	public LightBulb(RGBColor other) {
		color = new RGBColor(other);
		_switchedOn = false;
	}// CTOR2

	/**
	 * This constructor initializes a LightBulb object from another LightBulb
	 * object.
	 * 
	 * @param other
	 *            A LightBulb object from which this LightBulb is to initialize
	 *            and set it's values.
	 */
	public LightBulb(LightBulb other) {
		setColor(other.getColor());
		this._switchedOn = false;
	}// CTOR3

	/**
	 * 
	 * @return This LightBulbs 'color'.
	 */
	public RGBColor getColor() {
		return this.color;
	}// getColor

	/**
	 * 
	 * @param color
	 *            Sets the Color of this LightBulb.
	 */
	public void setColor(RGBColor color) {
		this.color = new RGBColor(color);
	}// setColor

	/**
	 * 
	 * @return Whether this LightBulb is turned 'On' or 'Off'.
	 */
	public boolean isSwitchedOn() {
		return _switchedOn;
	}// isSwitchedOn

	/**
	 * This method turns the LightBulb to 'On' if it is 'Off' and turns it 'Off'
	 * if it is 'On'.
	 */
	public void switchLight() {
		_switchedOn = !_switchedOn;
	}// switchLight

	/**
 * 
 */
	public String toString() {
		String onOrOff;
		if (isSwitchedOn() == true) {
			onOrOff = "On";
		}// ifOn
		else {
			onOrOff = "Off";
		}// elseOff

		return "(" + color.getRed() + "," + color.getGreen() + ","
				+ color.getBlue() + ") " + onOrOff + "";
	}// toString

	public static void main(String[] args) {
		LightBulb b = new LightBulb(-5, 10, -1);
		System.out.println(b.toString());
	}
}// class
