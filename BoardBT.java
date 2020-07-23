/**
 * 
 */
import static java.lang.Math.sqrt;
/**
 * <h1>BoardAT</h1> 
 * creates a board for player B
 * @author Nikou Kalabali Student number 001228157
 * @version 1
 */
public class BoardBT {
	/**
	 * 
	 */
	/**
	 * creates a BoardBT with given arguments
	 * @param c - coordinate of the lower left point of the ship
	 * @param w - the width of the board
	 * @param h - the height of the board
	 */
	static double width;
	static double height;
	static CoordinateT lower_left;

	public BoardBT(CoordinateT c, double w, double h) throws OutOfBoundsException {
		width = w;
		height = h;
		lower_left = c;
		if (!((w > 0) && (h > 0) && ((c.letter() + w) <= Constants.MAX_R) && ((c
				.number() + h) <= Constants.MAX_C)))
			throw new OutOfBoundsException("Not on boardA");	
	}
	/**
	 * evaluates whether point on Board 
	 * @param c - the coordinate
	 * @return boolean - boolean value true if on board
	 */
	public boolean pointOverlaping(CoordinateT c){
		CoordinateT a = new CoordinateT(lower_left.letter(), lower_left.number());
		CoordinateT b = new CoordinateT(lower_left.letter(), lower_left.number()+height);
		CoordinateT e = new CoordinateT(lower_left.letter()+ width, lower_left.number());
		CoordinateT d = new CoordinateT(lower_left.letter()+ width, lower_left.number()+height);
		if (Board(c))
			return true;
		else if (c.dist(a) <= Constants.TOLERANCE)
			return true;
		else if (c.dist(b) <= Constants.TOLERANCE)
				return true;
		else if (c.dist(e) <= Constants.TOLERANCE)
			return true;
		else if (c.dist(d) <= Constants.TOLERANCE)
			return true;
		else
			return false;
	}

	private boolean Board(CoordinateT q) {
		double qlet = q.letter();
		double qnum = q.number();
		double templet = lower_left.letter();
		double tempnum = lower_left.number();
		if (((qlet >= templet) && (qlet <= (templet + width)))
				&& ((qnum >= tempnum) && (qnum <= (tempnum + height))))
			return true;
		else
			return false;
	}
}
