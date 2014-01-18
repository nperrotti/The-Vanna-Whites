//Oliver Zhang
//pd 8
//2013-12-16
//HW 44

import java.util.ArrayList;
import cs1.Keyboard;

public class Wheel {
    public String puzzle;
    public String cat;
    
    public OurArray<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    private final static String symbols = "!?,.@#$%^&*()-=+_/><";

    //list of Strings used for Tile vals
    private WordList _list;

    private static int _numRows = 4;
    //public OurArray _board;
    public Wheel() {
	
	_board = new OurArray<Tile>(16);
	_numberFaceUp = 0;
	_list = new WordList();
	puzzle = _list.getPhrase();
	cat = _list.category;
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
    }

    public static boolean isSymbol(String s) {
	if (symbols.indexOf(s) > -1) 
		return true;
	else 	
		return false;
    }  

    public boolean gameOver() {
	boolean retBoo = false;
	for (int i = 0; i < _board.size(); i++) {
	    if (!(_board.get(i).isFaceUp()))
		return false;
	}
	return true;
    }

    public String toString() {
	String retStr = "";
	for (int i = 0; i < _board.size(); i++) {
	    retStr += _board.get(i).getFace();
	    retStr += " ";
	}
	return retStr;
    }

    public void play() {
	String ans;
	ArrayList guessedLetters = new ArrayList();
	int numCount = 0;
	System.out.println("the category is " + cat);
	for (int g = 0; g < _board.size(); g++) {
		if (_board.get(g).getFace().equals(",") || 
		    _board.get(g).getFace().equals(" ") || 
		    _board.get(g).getFace().equals("!") ||
		    _board.get(g).getFace().equals("'") ||
		    _board.get(g).getFace().equals("?"))
		    
		    _board.get(g).flip();
	    }
	while (!this.gameOver()) {
	    numCount = 0;
	    System.out.println("here is your board\n");
	    
	    System.out.println(this._board);
	    
	    System.out.println("guess a letter, or guess the phrase");
	    ans = Keyboard.readString();
	    ans = ans.toUpperCase();
	    if (ans.equals(puzzle)) {
		System.out.println("YOU GUESSED THE PHRASE!"); 
		for (int i = 0; i < _board.size(); i++) {
		    if (!(_board.get(i).isFaceUp()))
			_board.get(i).flip();
		}
	    }
		

	    else { 
		if (isSymbol(ans))
			while (isSymbol(ans))  {
			    System.out.println("You guesed a symbol");
			    ans = Keyboard.readString();
			    ans = ans.toUpperCase();
		}	
		while (guessedLetters.indexOf(ans) != -1)  {
		    System.out.println("You guesed this letter already");
		    ans = Keyboard.readString();
		    ans = ans.toUpperCase();
		}
		guessedLetters.add(ans);
		for (int j = 0; j < _board.size(); j++) {
		    if (_board.get(j).getFace().equals(ans)) {
			_board.get(j).flip();
			numCount += 1;
		    }
		
		}
		if (numCount == 1) 
		    System.out.println("There was " + numCount + " " + ans);
		else 
		    System.out.println("There were " + numCount + " " + ans + "s");
	    }
	}
	System.out.println(_board);
	System.out.println("YOU WON!");
	
    }


    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Wheel game = new Wheel();
	game.play();
    }

}//end class Concentration

