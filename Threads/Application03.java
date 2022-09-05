class Printer implements Runnable {
 	
	
	public void run(){
		
		for(int i=0;i<50;i++){
			System.out.println("child "+ " "+i);
		}
	}

	
 }

public class Application03 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			
			System.out.println("main before "+ Thread.currentThread().getPriority());
			
			Thread.currentThread().setPriority(7);
			
			Thread thread = new Thread(printer);
			
			thread.setPriority(7);
			
			System.out.println("main"+ Thread.currentThread().getPriority());
			System.out.println("child"+ thread.getPriority());
			
			thread.start();
				
			
			for(int h=0; h<50;h++){
				System.out.println("main" + Thread.currentThread().getName()+ " "+ h);
			}
		
		}

}