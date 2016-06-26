package HackerRank;

import java.util.Scanner;
public class FormattingExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int length = String.valueOf(x).length();
            
            String val="";
            
            if(length==3)
            	val= Integer.toString(x);
            else if(length==2)
            	val="0" + Integer.toString(x);
            else if(length==1)
            	val="00"+Integer.toString(x);
            
            System.out.printf("%-10s %-3s %s\n", s1,"",val );
            //String.format(s1,"%-10s", "test")
            //Complete this line
        }
        System.out.println("================================");
}
}
