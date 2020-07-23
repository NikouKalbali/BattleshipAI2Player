import java.awt.List;
import java.util.ArrayList;

/**
 * <h1>ShotA</h1> 
 * generic list
 * @author Nikou Kalabali student number 001228157
 * @version 1
 */
public class ShotB<T> {
	ArrayList<T> s = new ArrayList();
	//TODO make sure the constructor is called just one time
	public void add(T c) {
		s.add(c);
	}
	public void setval(T c) {
		s.set(0, c);
	}
	public T getval(int i) {
		return s.get(i);
	}
	public int size(){
		return s.size(); //TODO to find item that is full
	}
	public boolean pointOverlaping(CoordinateT c){
		CoordinateT a = new CoordinateT(BoardAT.lower_left.letter(), BoardAT.lower_left.number());
		CoordinateT b = new CoordinateT(BoardAT.lower_left.letter(), BoardAT.lower_left.number()+BoardAT.height);
		CoordinateT e = new CoordinateT(BoardAT.lower_left.letter()+ BoardAT.width, BoardAT.lower_left.number());
		CoordinateT d = new CoordinateT(BoardAT.lower_left.letter()+ BoardAT.width, BoardAT.lower_left.number()+BoardAT.height);
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
	private boolean Board(CoordinateT c) {
		// TODO Auto-generated method stub
		return false;
	}


}
