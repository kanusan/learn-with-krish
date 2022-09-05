class Printer implements Runnable {
 	
	
	public void run(){
		
		for(int i=0;i<50;i++){
			System.out.println("child "+ " "+i);
			
			try{
			Thread.sleep(250);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	
 }

public class Application04 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			Thread thread = new Thread(printer);
			thread.start();
				
			throws thread.join(5000);  //main method will wait until child finished its work
			
			for(int h=0; h<50;h++){
				System.out.println("main" + Thread.currentThread().getName()+ " "+ h);
			}
		
		}

}