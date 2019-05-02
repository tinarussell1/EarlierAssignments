package assignments;

public class Feb122019loopingMultipleSums {

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// total = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
  	int start1 = 1;
  	int end1 = 10;
  	int count1 = 0;
  	int start2 = 20;
  	int end2 = 30;
  	int count2 = 0;
  	int start3 = 35;
  	int end3 = 45; 
  	int count3 = 0;
	
	System.out.println("Welcome to Java!");

	for(int i=start1; i<=end1; i++) 
		count1 = count1 + i;
		System.out.println("Count1 " + count1);

	for(int i=start2; i<=end2; i++) 
		count2 = count2 + i;
		System.out.println("Count1 " + count2);
	for(int i=start3; i<=end3; i++) 
		count3 = count3 + i;
		System.out.println("Count1 " + count3);

	
	}
}
