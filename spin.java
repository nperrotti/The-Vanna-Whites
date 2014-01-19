import java.util.ArrayList;

public class spin {
    public ArrayList<String> wheel = new ArrayList<String>(24);
    public int score = 0;
    
    public spin() {

	wheel.add("600");
	wheel.add("400");
	wheel.add("300");
	wheel.add("800");
	wheel.add("350");
	wheel.add("450");
	wheel.add("700");
	wheel.add("300");
	wheel.add("600");
	wheel.add("5000");
	wheel.add("600");
	wheel.add("500");
	wheel.add("300");
	wheel.add("500");
	wheel.add("800");
	wheel.add("550");
	wheel.add("400");
	wheel.add("300");
	wheel.add("900");
	wheel.add("500");
	wheel.add("300");
	wheel.add("900");
	wheel.add("bankrupt");
	wheel.add("lose a turn");
	
    }

    public String spinie() {
	String result = (wheel.get((int)(Math.random() * 23)));
	return result;
    }

    public int getScore(){
	return score;
    }

    public void addScore(int numLetters) {
	String amount = this.spinie();
	System.out.println("You span a " + amount);
	if (!(amount.equals("bankrupt") || amount.equals("lose a turn")))
	    score += Integer.parseInt(amount) * numLetters;
	else
	    if (amount.equals("bankrupt"))
		score = 0;
		
    }

    public static void main(String[] args) {
	spin ollie = new spin();
	//System.out.println(ollie.spinie());
	ollie.addScore(1);
	System.out.println(ollie.score);
	ollie.addScore(2);
	System.out.println(ollie.score);
	ollie.addScore(3);
	System.out.println(ollie.score);
	ollie.addScore(4);
	System.out.println(ollie.score);
	
    }

}