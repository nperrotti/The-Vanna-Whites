import java.util.ArrayList;
public class OurArray<T> extends ArrayList<T> {

    public OurArray(int x) {
	super(x);
    }

    public String toString() {
	String retStr = "";
	for (int i = 0; i < this.size(); i++) {
	    retStr += this.get(i) + " ";
	}
	return retStr;
    }
}