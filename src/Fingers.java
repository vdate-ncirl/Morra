

import java.util.*;

/**
 *
 * @author Cal
 */
public class Fingers {

    public static int myfingers() {
        int fing = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter how many fingers (1 to 10): ");
        fing = keyb.nextInt();
        return fing;
    }
}
