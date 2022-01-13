/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ross Alvine
 */
public class pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] conts = new String[5];
        int[] scores = new int[5];
        int sum = 0;
        int max = 0;
        int winner = 0;
        conts[0] = sc.nextLine();
        conts[1] = sc.nextLine();
        conts[2] = sc.nextLine();
        conts[3] = sc.nextLine();
        conts[4] = sc.nextLine();
        for(int i = 0; i < conts.length; i++){
            sum = 0;
            Scanner scanner = new Scanner(conts[i]);
            for(int j = 0; j < 4; j++){
                sum += scanner.nextInt();
            }
            scores[i] = sum;
        }
        max = scores[0];
        winner = 1;
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
                winner = i + 1;
            }
        }
        System.out.println(winner + " " + max);
    }
}
