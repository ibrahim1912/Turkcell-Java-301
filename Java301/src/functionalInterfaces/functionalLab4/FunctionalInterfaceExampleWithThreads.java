package functionalInterfaces.functionalLab4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class FunctionalInterfaceExampleWithThreads {

	public static void main(String[] args) {

		System.out.println("Merhaba");
		Scanner scanner = new Scanner(System.in);
		/*Thread inputThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.print("Enter: ");
					String line = scanner.nextLine();
					System.out.println(line.toUpperCase());
				}
				
			}
		});*/
		
		//with lambda
		Thread inputThread = new Thread(() -> {
			while(true) {
				System.out.print("Enter: ");
				String line = scanner.nextLine();
				System.out.println(line.toUpperCase());
			}
		});
		
		inputThread.start();
		
		
		while (true) {
			System.out.println(new Date());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
