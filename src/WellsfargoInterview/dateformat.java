package WellsfargoInterview;

public class dateformat {
	
	public static void main(String[] args) {
		
		String date = "08/30/2020";
	
		String date1 = date.substring(0, 2);
		String month1 = date.substring(3, 5);
		String year = date.substring(6);
		
		System.out.println(month1+"/"+date1+"/"+year);
		
		removeduplicates();
	}	
	
	public static void removeduplicates() {
		String data = "abacdbebaef";
		
		
		for(int i=0; i<data.length(); i++) {
			for(int j=i+1; j<data.length(); j++) {	
				if(data.charAt(i)==data.charAt(j)) {
					data= data.substring(0,j)+data.substring(j+1);
				}		
			}
		}
		System.out.println(data);
	}

}
