/**
 * 
 * @author Raskanskyz. This class is a representation of a Pixel/RGBColor.
 * 
 */
public class RGBColor {

	private int red;
	private int green;
	private int blue;

	/**
	 * 
	 * @return The red intensity of this RGBColor.
	 */
	public int getRed() {
		return red;
	}

	/**
	 * 
	 * @param red
	 *            Sets the intensity of red in this RGBColor.
	 */
	public void setRed(int red) {
		this.red = red;
	}

	/**
	 * 
	 * @return The green intensity of this RGBColor.
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * 
	 * @param green
	 *            Sets the intensity of green in this RGBColor.
	 */
	public void setGreen(int green) {
		this.green = green;
	}

	/**
	 * 
	 * @return The Blue intensity of this RGBColor.
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * 
	 * @param blue
	 *            Sets the intensity of blue in this RGBColor.
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}

	/**
	 * This is the default constructor and it sets the RGB values to 0, which is
	 * a black pixel.
	 */
	public RGBColor() {
		setRed(0);
		setGreen(0);
		setBlue(0);
	}// CTOR1

	/**
	 * This Constructor gets values of RGB and initializes a new RGBColor object
	 * from those values.
	 * 
	 * @param red
	 *            The intensity of red to be set to this RGBColor.
	 * @param green
	 *            The intensity of green to be set to this RGBColor.
	 * @param blue
	 *            The intensity of blue to be set to this RGBColor.
	 */
	public RGBColor(int red, int green, int blue) {
		final int min = 0;
		final int max = 255;
		if (red < min || red > max || green < min || green > max || blue < min
				|| blue > max) {
			setRed(0);
			setGreen(0);
			setBlue(0);

		}// if
		else { 
			setRed(red);
			setGreen(green);
			setBlue(blue);
		}// else

	}// CTOR2

	/**
	 * This constructor initializes an RGBColor object from another RGBColor
	 * thus creating an RGBColor with the same values of that RGBColor.
	 * 
	 * @param other
	 *            Another RGBColor from which this object is to be initialized
	 *            with.
	 */
	public RGBColor(RGBColor other) {
		setRed(other.getRed());
		setGreen(other.getGreen());
		setBlue(other.getBlue());
	}// CTOR3

	/**
	 * @return Returns the intensity of red, green, and blue as a String.
	 */
	public String toString() {

		return "(" + getRed() + "," + getGreen() + "," + getBlue() + ")";

	}// toString

	/**
	 * @param other
	 *            An RGBColor object which is used to compare to this RGBColor.
	 * @return Whether this RGBColor has equal RGB values as 'other'.
	 */
	public boolean equals(RGBColor other) {
		return (this.getRed() == other.getRed()
				&& this.getGreen() == other.getGreen() && this.getBlue() == other
				.getBlue());
	}// equals

	/**
	 * 
	 * @param other
	 *            An RGBColor object which is used to mix RGB values with this
	 *            RGBColor's values.
	 */
	public void mix(RGBColor other) {

		red = (red + other.getRed()) / 2;
		green = (green + other.getGreen()) / 2;
		blue = (blue + other.getBlue()) / 2;
	}// mix

	/**
	 * This method converts this RGBColor object into a grayscale representation
	 * of itself.
	 * 
	 * @return A grayscale RGBColor representation.
	 */
	public double convertToGrayscale() {

		return (((double) (getRed() * 30) / 100)
				+ ((double) (getGreen() * 59) / 100) + ((double) (getBlue() * 11) / 100));
	}// convertToGrayscale

	/**
	 * This method inverts this RGBColor to its 'negative'.
	 */
	public void invert() {
		setRed(255 - getRed());
		setGreen(255 - getGreen());
		setBlue(255 - getBlue());
	}// invert

}// class
