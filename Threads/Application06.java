class Printer implements Runnable {
 	
	
	public void run(){
		
		for(int i=0;i<50;i++){
			
			try{
		      Thread.sleep(1000);
		      } catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("child "+ " "+i);
			
			
		}
	}

	
 }

public class Application06 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			Thread thread = new Thread(printer);
			thread.start();
			thread.interrupt();
				
			for(int h=0; h<50;h++){
				System.out.println("main" + Thread.currentThread().getName()+ " "+ h);
			}
			System.out.println("======================");
			thread.interrupt();
		
		}

}