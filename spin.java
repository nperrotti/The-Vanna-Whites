public class spin {
    public ArrayList<String> wheel = new ArrayList<String>(16);
    
    public spin() {

	wheel.add("500");
	wheel.add("500");
	wheel.add("500");
	wheel.add("1000");
	wheel.add("1000");
	wheel.add("1000");
	wheel.add("1000");
	wheel.add("2000");
	wheel.add("3000");
	wheel.add("4000");
	wheel.add("5000");
	wheel.add("10000");
	wheel.add("bankrupt");
	wheel.add("bankrupt");
	wheel.add("trip");
	
    }

    public String spinie() {
	return wheel.get((int)(Math.random() * 16));
    }
    public static void main(String[] args) {
	spin ollie = new spin();
	System.out.println(ollie.spinie());
    }

}