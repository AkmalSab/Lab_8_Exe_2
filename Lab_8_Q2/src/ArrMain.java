
public class ArrMain {
	
	public static void main(String[] args) {
		
		Runnable runnableOne = new Arr();
		Runnable runnableTwo = new ArrRandom();
		
		Thread text = new Thread(runnableOne,"text");
		Thread word1 = new Thread(runnableTwo,"word1");
		
		text.start();
		word1.start();
	}

}
