class Printer extends Thread {
 	
	@Override
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("child "+Thread.currentThread().getName()+" "+i);
		}
	}

	
 }

public class Application01 {

		public static void main(String[] args){
			
			Printer printer = new Printer();
			printer.run();
			//System.out.println("Started");	
			
			for(int h=0; h<100;h++){
				System.out.println("main" + Thread.currentThread().getName() + h);
			}
		
		}

}