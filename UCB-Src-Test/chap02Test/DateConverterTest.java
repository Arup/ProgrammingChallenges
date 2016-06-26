package chap02Test;

public class DateConverterTest {
    public static void main (String [] args) {
        try {
            //int reps = Integer.parseInt(args[0]);
            int reps=1;
            while (reps < 10) {
            	for(int i=0;i<reps;i++)
            		System.out.println("*"+"%2s");
            	
            	System.out.println("\n");
                reps ++;
            }
        } catch (NumberFormatException e) {
            return;
        }
    }
    
    void printStar(){
    	System.out.println("*");
    }
}
