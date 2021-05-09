import java.util.Random;

public class ArrRandom implements Runnable {

	public String[] text = {"it", "is", "recommended", "to", "use", "Calendar", "class"};
	
	public void extractArrayRandom(String currentThread) {
		int rnd = new Random().nextInt(text.length);
	    System.out.println("Random text => " + text[rnd]);
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		extractArrayRandom(currentThread.getName());
	}
}

