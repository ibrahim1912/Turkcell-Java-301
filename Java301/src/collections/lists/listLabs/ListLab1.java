package collections.lists.listLabs;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ListLab1 {

	public static void main(String[] args) {

//		Ticket ticket = new Ticket(1,new Date(),12.0f);
//		Seat seat = new Seat(22,ticket);
//		
//		System.out.println(seat);
		
		Random random = new Random();
		ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
		for(int i=0; i<10; i++) {
			Ticket ticket = new Ticket(random.nextInt(5),new Date(),random.nextFloat(100));
			ticketList.add(ticket);
		}
		
		for (Ticket ticket : ticketList) {
			System.out.println(ticket);
		}
		
		System.out.println("**********************************");
		
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		Scanner scanner = new Scanner(System.in);
		int ticketNumber = 0;
		System.out.print("Lutfen Secim Yapiniz (1 Bilet Al), (0 Cikis Yap): ");
		while((scanner.nextInt()) != 0) {
			Ticket ticket = ticketList.get(random.nextInt(ticketList.size()));
			ticketList.remove(ticket);
			Seat seat = new Seat(++ticketNumber,ticket);
			seatList.add(seat);
			System.out.println(ticketList.size());
			System.out.print("Lutfen Secim Yapiniz (1 Bilet Al), (0 Cikis Yap): ");
		}
		scanner.close();
		
		System.out.println("Satilan Bilet Sayisi: " + seatList.size());
		for (Seat seat : seatList) {
			System.out.println(seat);
		}
		
		
	}

}
