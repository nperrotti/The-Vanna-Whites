//Oliver Zhang
//pd 8
//2013-12-16
//HW 44

public class Tile {

    private String _face;
    private boolean _isFaceUp;

    //constructor
    public Tile(  ) {
	_face = "";
	_isFaceUp = false;
    }	

    public Tile( String value ) {
	_face = value;
	_isFaceUp = false;
    }

    public boolean isFaceUp() { return _isFaceUp; }

    public void flip() { _isFaceUp = !_isFaceUp; }

    public String toString() {
	if ( isFaceUp() )
	    return _face;
	else
	    return "-X-";
    }

    //*** YOU WILL NEED TO IMPLEMENT EQUALS ***
    //	  ...(use the hints below)

    //overridden equals method
    public boolean equals( Object rightSide ) {

	//First, check for aliasing.
	if (this == rightSide)
	    return true;
	//Next, if this and input Object are different objects,
	if (! (rightSide instanceof Tile) )
	    return false;
	else 
	    return this._face.equals(((Tile)rightSide)._face);
	    //...check to see if input Object is a Tile

		//...and that its state variables match those of this Tile

    }

 
    public static void main(String [] args){
	Tile t1 = new Tile("cow");
	Tile t2 = new Tile("cow");
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t1.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t2.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
    }

}//end class Tile

