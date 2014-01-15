//Oliver Zhang
//pd 8
//2013-12-16
//HW 44

import java.util.ArrayList;
import cs1.Keyboard;

public class Wheel {

    public Wheel() {
	
	_board = new OurArray<Tile>(16);
	_numberFaceUp = 0;
	_list = new WordList();
	String puzzle = _list.getPhrase();
	String holdPl = new String();
	int i = 0;
	int j = 1;
	for (int x = 0; x < puzzle.length(); x++) {
	    
	    holdPl = puzzle.substring(i,j);
	    _board.add(new Tile(holdPl));
	    i++;
	    j++;
	}
	
	
	int a = 3;
	/*while ( a > 0) {
		for (int i = 0; i < 16; i ++) {
			int rand = (int)(Math.random() * 16);
			Tile holder = new Tile();
			Tile holder2 = new Tile(); 
			holder = this._board.get(rand);	
			holder2 = this._board.get(i);	
			this._board.set(i,holder);
			this._board.set(rand,holder2);	
		}
		a--;
		}*/
    }

    //instance variables
    //storage for 4x4 grid of Tiles. _board.size() == 16	
    private OurArray<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    //list of Strings used for Tile vals
    private WordList _list;

    private static int _numRows = 4;

    public String toString() {
	String retStr = "";
	for (int i = 0; i < _board.size(); i++) {
	    retStr += _board.get(i).getFace();
	    retStr += " ";
	}
	return retStr;
    }

    /*public static void main( String[] args ) {
	Concentration game = new Concentration();
	System.out.println(game._board);
	int rand = (int)(Math.random() * 16);
	for (int i = 0; i < 16; i ++) {
		Tile holder = new Tile();
		Tile holder2 = new Tile(); 
		holder = game._board.get(rand);	
		holder2 = game._board.get(i);	
		game._board.set(i,holder);
		game._board.set(rand,holder2);	
	}
	for (int i = 0; i < 16; i ++) {
		game._board.get(i).flip();
	}
	System.out.println(game._board);
	game.play();
    } */   

    public void play() {
	String ans;
	int ans2;
	
	while (this._board.size() > 0) {
	    for (int g = 0; g < _board.size(); g++) {
		if (_board.get(g).getFace().equals(",") || 
		    _board.get(g).getFace().equals(" ") || 
		    _board.get(g).getFace().equals("!") ||
		    _board.get(g).getFace().equals("'") ||
		    _board.get(g).getFace().equals("?"))
		    
		    _board.get(g).flip();
	    }
	    System.out.println("here is your board\n");
	    System.out.println(this._board);
	    System.out.println("guess a letter!");
	    ans = Keyboard.readString();
	    /*System.out.println("");
	      ans2 = Keyboard.readInt();
	    if (ans > this._board.size() || ans2 > this._board.size() || ans < 1 || ans2< 1)
		System.out.println("you cant pick those tiles");
	    else {
		this._board.get(ans - 1).flip();
		this._board.get(ans2 - 1).flip();
		System.out.println("ok, here are the revealed tiles");
		System.out.println(this._board);
		if (this._board.get(ans - 1).equals(this._board.get(ans2 - 1))) {
		    this._board.remove(ans - 1);
		    this._board.remove(ans2 - 2);
		    System.out.println("YOU GOT A MATCH");
		}
		else {
		    this._board.get(ans - 1).flip();
		    this._board.get(ans2 - 1).flip();
		    }
		}*/
	    for (int j = 0; j < _board.size(); j++) {
		if (_board.get(j).getFace().equals(ans)) 
		    _board.get(j).flip();
	    }
	    
	}
	System.out.println("YOU WON!");
	
    }


    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Wheel game = new Wheel();
	game.play();
    }

}//end class Concentration

