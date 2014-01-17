//Oliver Zhang
//pd 8
//2013-12-16
//HW 44

import java.util.ArrayList;
import cs1.Keyboard;

public class Concentration {

    public Concentration() {
	
	_board = new ArrayList<Tile>(16);
	_numberFaceUp = 0;
	_list = new WordList();
	
	for (int i = 0; i < 16; i ++) {
	    _board.add(new Tile(_list.get(i)));
	    
	}
	
	
	int a = 3;
	while ( a > 0) {
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
	}
    }

    //instance variables
    //storage for 4x4 grid of Tiles. _board.size() == 16	
    private ArrayList<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    //list of Strings used for Tile vals
    private WordList _list;

    private static int _numRows = 4;


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
	int ans;
	int ans2;
	
	while (this._board.size() > 0) {
		System.out.println("here is your board\n");
		System.out.println(this._board);
		System.out.println("which tile do you want to flip?\n");
		ans = Keyboard.readInt();
		System.out.println("ok, second tile\n");
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
		}
	}
	System.out.println("YOU WON!");
	
    }


    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Concentration game = new Concentration();
	game.play();
    }

}//end class Concentration

