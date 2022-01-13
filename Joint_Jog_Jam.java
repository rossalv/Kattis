package Kattis;
import java.util.Scanner;

/**
 *
 * @author rfalv
 */
public class Joint_Jog_Jam {
    public static double distance(int x1, int y1, int x2, int y2){
        double sub1 = y2 - y1;
        double sq1 = sub1 * sub1;
        double sub2 = x2 - x1;
        double sq2 = sub2 * sub2;
        double add = sq1 + sq2;
        return Math.sqrt(add);
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int karisx = stdin.nextInt();
        int karisy = stdin.nextInt();
        int olasx = stdin.nextInt();
        int olasy = stdin.nextInt();
        int kariex = stdin.nextInt();
        int kariey = stdin.nextInt();
        int olaex = stdin.nextInt();
        int olaey = stdin.nextInt();
        int max = 0;
        double d1 = distance(karisx, karisy, olasx, olasy);
        double d2 = distance(kariex, kariey, olaex, olaey);
        if(d1 > d2){
            System.out.println(d1);
        }
        else{
            System.out.println(d2);
        }
    }
}
