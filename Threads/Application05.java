class Printer implements Runnable {
 	
	
	public void run(){
		
		for(int i=0;i<50;i++){
			Thread.yield(); //allow this method to wait and allow main method to complete its execution
			System.out.println("child "+ " "+i);
			
			
		}
	}

	
 }

public class Application05 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			Thread thread = new Thread(printer);
			thread.start();
				
			
			for(int h=0; h<50;h++){
				System.out.println("main" + Thread.currentThread().getName()+ " "+ h);
			}
		
		}

}