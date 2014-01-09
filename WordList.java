//

import java.util.ArrayList;
public class WordList {

    private ArrayList<String> myList; // contains Strings made up of letters
    
    public WordList() {
	myList = new ArrayList<String>(16);
	//MOVIE QUOTES
	myList.add("IT'S NOTHING PERSONAL SONNY, IT'S STRICTLY BUSINESS");
	myList.add("LUKE, I AM YOUR FATHER");
	myList.add("WHO YOU GONNA CALL? GHOSTBUSTERS!");
	myList.add("YOU SHALL NOT PASS!");
	//ACTORS
	myList.add("JENNIFER LAWRENCE");
	myList.add("LEONARDO DI CAPRIO");
	myList.add("MARILYN MONROE");
	myList.add("TOM HANKS");
	//IDIOMS
	myList.add("RAINING CATS AND DOGS");
	myList.add("PIECE OF CAKE");
	myList.add("BREAK A LEG");
	myList.add("HIT THE HAY");
	//BRAND NAMES
	myList.add("BARNES AND NOBLE");
	myList.add("LOUIS VUITTON");
	myList.add("GENERAL MILLS");
	myList.add("AMERICAN AIRLINES");
    }

    //postcond: returns the number of words in this WordList that are 
    //          exactly len letters long
    public int numWordsOfLength(int len) { 
	int num = 0;
	for (String x : myList) {
	    if (x.length() == len) 
		num += 1;
	}
	return num;
    }

    //postcond: all words that are exactly len letters long have been removed 
    //          from this WordList, with order of remaining words unchanged
    public void removeWordsOfLength(int len) { 
	for (String x : myList) {
	    if (x.length() == len) 
		myList.remove(x);
	}
    }

    public String get(int index) {
	return myList.get(index);
    }

    //... constructor and other methods not shown
}





