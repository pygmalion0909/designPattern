package parts.singleton;

public class TicketMarker {
	
	private static int ticket = 1000;
	
	public static int getNextTicketNumber(){
		return ticket++;
	}
	
}
