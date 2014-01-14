//WordList

import java.util.ArrayList;
public class WordList {

    private ArrayList<String> movies; 
    private ArrayList<String> actors;
    private ArrayList<String> idioms;
    private ArrayList<String> brands;
    public String category;
    
    public WordList() {
	//MOVIE QUOTES
	movies = new ArrayList<String>(4);
	movies.add("IT'S NOTHING PERSONAL, IT'S STRICTLY BUSINESS");
	movies.add("LUKE, I AM YOUR FATHER");
	movies.add("WHO YOU GONNA CALL? GHOSTBUSTERS!");
	movies.add("YOU SHALL NOT PASS!");

	//ACTORS
	actors = new ArrayList<String>(4);
	actors.add("JENNIFER LAWRENCE");
	actors.add("LEONARDO DI CAPRIO");
	actors.add("MARILYN MONROE");
	actors.add("ROBERTY DOWNEY JR");

	//IDIOMS
	idioms = new ArrayList<String>(4);
	idioms.add("RAINING CATS AND DOGS");
	idioms.add("PIECE OF CAKE");
	idioms.add("BREAK A LEG");
	idioms.add("HIT THE HAY");

	//BRAND NAMES
	brands = new ArrayList<String>(4);
	brands.add("BARNES AND NOBLE");
	brands.add("LOUIS VUITTON");
	brands.add("GENERAL MILLS");
	brands.add("AMERICAN AIRLINES");
    }

    public String getPhrase() {
	int listchoose = (int)(Math.random() * 4);
	String retStr;
	if (listchoose == 0) {
	    retStr =  movies.get((int)(Math.random() * 4));
	    category = "Movie Quotes:";
	}
	else if (listchoose == 1) {
	    retStr = actors.get((int)(Math.random() * 4));
	    category = "Actors and Actresses:";
	}
	else if (listchoose == 2) {
	    retStr = idioms.get((int)(Math.random() * 4));
	    category = "Idioms:";
	}
	else {
	    retStr =  brands.get((int)(Math.random() * 4));
	    category = "Brand Names:";
	}
	return retStr;
    }

    public String getCat() {
	return category;
    }

    //postcond: returns the number of words in this WordList that are 
    //          exactly len letters long
    public int numWordsOfLength(int len, ArrayList<String> a) { 
	int num = 0;
	for (String x : a) {
	    if (x.length() == len) 
		num += 1;
	}
	return num;
    }

    //postcond: all words that are exactly len letters long have been removed 
    //          from this WordList, with order of remaining words unchanged
    public void removeWordsOfLength(int len, ArrayList<String> a) { 
	for (String x : a) {
	    if (x.length() == len) 
		a.remove(x);
	}
    }

    public String get(int index, ArrayList<String> a) {
	return a.get(index);
    }

    public static void main( String[] args) {
	WordList ollie = new WordList();
	System.out.println(ollie.getPhrase());
	System.out.println(ollie.getCat());
    }

    //... constructor and other methods not shown
}





