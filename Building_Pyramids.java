package Kattis;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rfalv
 */
public class Building_Pyramids {
    public static void main(String[] args) {
        ArrayList<Integer> layers = new ArrayList<Integer>();
        int n = 0;
        int tn = 0;
        int ln = 0;
        int i = 0;
        int hei = -1;
        while(tn < 100000000){
            n = (2 * i + 1) * (2 * i + 1);
            tn = n + tn;
            layers.add(tn);
            i = i + 1;
        }
        Scanner stdin = new Scanner(System.in);
        int num = stdin.nextInt();
        for(int j = 0; j < layers.size(); j++){
            if(num < layers.get(j)){
                hei = j;
                break;
            }
        }
        System.out.print(hei);
    }
    
}
