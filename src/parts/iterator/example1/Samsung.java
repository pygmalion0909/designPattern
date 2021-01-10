package parts.iterator.example1;

import java.util.List;

public class Samsung {
	
	private String date;
	private List<String> lunch;
	private List<String> night;
	
	public Samsung(String date, List<String> lunch, List<String> night) {
		this.date = date;
		this.lunch = lunch;
		this.night = night;
	}
		
	public String getDate() {
		return this.date;
	}
	
	public List<String> getLunch() {
		return this.lunch;
	}
	
	public List<String> getNight() {
		return this.night;
	}
	
	@Override
	public String toString() {
		return "Samsung [lunch=" + lunch + "]";
	}
	
}
