import java.awt.List;
import java.util.ArrayList;

/**
 * <h1>ShotA</h1> 
 * generic list
 * @author Nikou Kalabali student number 001228157
 * @version 1
 */
public class ShotA<T> {
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
		CoordinateT a = new CoordinateT(BoardBT.lower_left.letter(), BoardBT.lower_left.number());
		CoordinateT b = new CoordinateT(BoardBT.lower_left.letter(), BoardBT.lower_left.number()+BoardBT.height);
		CoordinateT e = new CoordinateT(BoardBT.lower_left.letter()+ BoardBT.width, BoardBT.lower_left.number());
		CoordinateT d = new CoordinateT(BoardBT.lower_left.letter()+ BoardBT.width, BoardBT.lower_left.number()+BoardBT.height);
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
