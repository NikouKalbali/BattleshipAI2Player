/**
 * 
 */

//import static java.lang.Math.sqrt;


/**
 * @author Nikou Kalbali Student number 001228157
 *
 */
public class CoordinateT {
	/**
	 * 
	 */
	double rc, cc;//rc is row coordinate cc is column coordinate
	public CoordinateT(double row, double column){//throws InvalidPointException{
		rc = row;
		cc = column;
		if ((!((rc >= 0) && (rc <= Constants.MAX_R))) || 
				(!((cc >= 0) && (cc <= Constants.MAX_C))))
			try {
				throw new InvalidMoveException("InvalidMoveException");
			} catch (InvalidMoveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		// TODO Auto-generated constructor stub
	}

	public double letter() {//for the row the user enteres a letter
		return rc;
	}
	/**
	 * @param rc the rc to set
	 */
	
	public double number() {//for the column the user enters a number
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */

	public double dist(CoordinateT c) {
		double dn = Math.sqrt(Math.pow(this.rc-c.rc,2)+Math.pow(this.cc-c.cc,2));
		return dn;
	}
	/**
	 * @param cc the cc to set
	 */
}
