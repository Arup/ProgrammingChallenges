package chap02Test;

public class Test3 {
    public static void main (String [ ] args) {
        int x = 1;
        int y = 1;
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print (x + "" + y + " ");
            x = x + 1;
        }
        System.out.println ( );
    }
}