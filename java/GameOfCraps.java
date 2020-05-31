/*
S.M. Ibrahim Azam
FA13-BCS-093
2A
*/


public class GameOfCraps {

	public static void main(String[] args) {
	
	int l=0,w=0;	
        for(int count=0;count<10000;count++)              //loop to run the program 10,000 times
	{
		
                int d1 = (int)(Math.random()* 6) + 1;        //math.random to generate [0,1) 
		int d2 = (int)(Math.random()* 6) + 1;
		int roll = d1 + d2;
		
		System.out.println("You rolled "+roll+". ");
		if(roll == 2 || roll == 3 || roll == 12){
			System.out.println("You Lose...");
			l++;
		}else if(roll == 7 || roll == 11){
			System.out.println("You Win...");
			w++;
		}else{
			System.out.println("Point is "+roll+"\n");
			d1 = (int)(Math.random()* 6) + 1;
			d2 = (int)(Math.random()* 6) + 1;
			int roll1 = d1 + d2;
			System.out.print("You rolled "+roll1+". ");
                        while(roll1 != 7){
				if(roll == roll1){
					System.out.println("You Win...");
					w++;
					break;
				}else{
					System.out.println("Point is "+roll+"\n");
				}
				d1 = (int)(Math.random()* 6) + 1;
				d2 = (int)(Math.random()* 6) + 1;
				roll1 = d1 + d2;
				System.out.print("You rolled "+roll1+". ");
			}
			if(roll1 == 7){
				System.out.println("You Lose...");
				l++;
			}			
		}
	    }

		        System.out.println("\n\nyou won "+w+" times.");
			System.out.println("you lost "+l+" times.");
			float x=w+l;
			float p;
			p=w/x;
			System.out.println("Probability of Winning = "+p);

         
	}
	
}
