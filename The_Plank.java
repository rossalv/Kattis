/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kattis;
import java.util.Scanner;

/**
 *
 * @author rfalv
 */
public class The_Plank {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        System.out.println(numWays(n));
    }
    static int numWays(int num){
        int DP[] = new int[num + 1];
 
        // base cases
        DP[0] = DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;
 
        // iterate for all values from 4 to n
        for (int i = 3; i <= num; i++){
            DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
        } 
        return DP[num];
    }
}

