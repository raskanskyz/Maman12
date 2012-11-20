public class Disco {

	LightBulb _bulb1;
	LightBulb _bulb2;
	LightBulb _bulb3;
	LightBulb _bulb4;

	/**
	 * This constructor initializes this 'Disco' object and takes 4 'LightBulb'
	 * objects as parameters.
	 * 
	 * @param b1
	 *            The first LightBulb.
	 * @param b2
	 *            The second LightBulb.
	 * @param b3
	 *            The third LightBulb.
	 * @param b4
	 *            The fourth LightBulb.
	 */
	public Disco(LightBulb b1, LightBulb b2, LightBulb b3, LightBulb b4) {
		_bulb1 = b1;
		_bulb2 = b2;
		_bulb3 = b3;
		_bulb4 = b4;
	}// CTOR

	/**
	 * This method takes a number as a value and switches its state from 'On' to
	 * 'Off' or from 'Off' to 'On'.
	 * 
	 * @param num
	 *            The LightBulb on which you want to apply this method on.
	 */
	public void switchBulb(int num) {
		switch (num) {
		case 1:
			_bulb1.switchLight();
			break;
		case 2:
			_bulb2.switchLight();
			break;
		case 3:
			_bulb3.switchLight();
			break;
		case 4:
			_bulb4.switchLight();
			break;

		default:
			break;// <--do nothing if not 1-4?
		}
	}// switchBulb

	/**
	 * This method turns all LightBulbs to 'On'.
	 */
	public void turnAllOn() {
		if (!_bulb1.isSwitchedOn()) {
			_bulb1.switchLight();
		}// if
		if (!_bulb2.isSwitchedOn()) {
			_bulb2.switchLight();
		}// if
		if (!_bulb3.isSwitchedOn()) {
			_bulb3.switchLight();
		}// if
		if (!_bulb4.isSwitchedOn()) {
			_bulb4.switchLight();
		}// if
	}// turnAllOn

	/**
	 * This method turns all LightBulbs to 'Off'.
	 */
	public void turnAllOff() {
		if (_bulb1.isSwitchedOn()) {
			_bulb1.switchLight();
		}// if
		if (_bulb2.isSwitchedOn()) {
			_bulb2.switchLight();
		}// if
		if (_bulb3.isSwitchedOn()) {
			_bulb3.switchLight();
		}// if
		if (_bulb4.isSwitchedOn()) {
			_bulb4.switchLight();
		}// if
	}// turnAllOff

	/**
	 * 
	 * @return Whether all LightBulbs are in the 'On' state.
	 */
	public boolean areAllOn() {
		return (_bulb1.isSwitchedOn() && _bulb2.isSwitchedOn()
				&& _bulb3.isSwitchedOn() && _bulb4.isSwitchedOn());
	}// areAllOn

	/**
	 * 
	 * @return Whether all LightBulbs are in the 'Off' state.
	 */
	public boolean areAllOff() {
		return (!_bulb1.isSwitchedOn() && !_bulb2.isSwitchedOn()
				&& !_bulb3.isSwitchedOn() && !_bulb4.isSwitchedOn());
	}// areAllOff

	/**
	 * 
	 * @return Whether all LightBulbs have the same 'color' value.
	 */
	public boolean allSameColor() {
		return (_bulb1.getColor().equals(_bulb2.getColor().equals(
				_bulb3.getColor().equals(_bulb4))));
	}// allSameColor

	/**
	 * 
	 * @return The first LightBulb.
	 */
	public LightBulb getFirstBulb() {
		return _bulb1;
	}// getFirstBulb

	/**
	 * 
	 * @return The second LightBulb.
	 */
	public LightBulb getSecondBulb() {
		return _bulb2;
	}// getSecondBulb

	/**
	 * 
	 * @return The third LightBulb.
	 */
	public LightBulb getThirdBulb() {
		return _bulb3;
	}// getThirdBulb

	/**
	 * 
	 * @return The fourth LightBulb.
	 */
	public LightBulb getFourthBulb() {
		return _bulb4;
	}// getFourthBulb

}// class
