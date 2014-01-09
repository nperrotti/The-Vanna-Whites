//Oliver Zhang
//pd 8
//2013-12-16
//HW 44
import java.util.ArrayList;
public class WordList {

    private ArrayList<String> myList; // contains Strings made up of letters
    
    public WordList() {
	myList = new ArrayList<String>(8);
	myList.add("dog");
	myList.add("cat");
	myList.add("bird");
	myList.add("mouse");
	myList.add("cow");
	myList.add("frog");
	myList.add("elephant");
	myList.add("fox");
	myList.add("dog");
	myList.add("cat");
	myList.add("bird");
	myList.add("mouse");
	myList.add("cow");
	myList.add("frog");
	myList.add("elephant");
	myList.add("fox");
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





