package AppleInterviewPractice;

public class PerformStringShifts {

	public static void main(String[] args) {
		String data = "performances";
		int findex =0;
		int nindex = 0;

		int length = data.length();
		
		for(int i=0; i<=length-1; i++) {
			if(data.charAt(i)=='f') {
				 findex = i;		
			}
			if(data.charAt(i)=='n') {
				 nindex = i;
			}
			
		}
		String result = data.substring(0,findex)+data.charAt(nindex)+data.substring(findex+1,nindex)+data.charAt(findex)+data.substring(nindex+1);
		System.out.println(result);
		
	}

}
