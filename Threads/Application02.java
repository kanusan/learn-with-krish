class Printer implements Runnable {
 	
	@Override
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("child "+ " "+i);
		}
	}

	
 }

public class Application02 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			
			Thread thread = new Thread(printer);
			thread.start();
				
			
			for(int h=0; h<100;h++){
				System.out.println("main" + Thread.currentThread().getName()+ " "+ h);
			}
		
		}

}