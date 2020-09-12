package AppleInterviewPractice;

public class CandiesDistribution {

	public static void main(String[] args) {

		int candies = 30;
		int[] p = new int[4];	
		p[0] = 1;
		candies = 29;
		int i=0;
		int n = 0;
		
		while(candies!=0) {
			//System.out.println(i+" , "+p.length);
			while(i<p.length-1 && candies>p[i]) {
			p[i+1] = p[i]+1;
			//System.out.println(i+" , "+p[i]+" , "+p[i+1]);
			candies=candies-p[i+1];
			i++;
			System.out.println("Inside while Candies left : "+ candies);
			}
			n=p[i];
			//System.out.println(i);
			if(i+1>=p.length-1 && candies>n) {
				i=0;
				p[i]=p[i]+n+i+1;
				candies=candies-n-1;
				System.out.println("Candies left : "+ candies);
			}
			else {
				p[i+1]=p[i+1]+candies;
				candies=0;
				//System.out.println("Candies left : "+ candies);
				//System.out.println(i +" , "+p[i]);
				break;
			}
			
		}
		
		for(int j=0; j<=p.length-1; j++) {
			System.out.print(p[j]+" ");
		}
		
		

	}

}
