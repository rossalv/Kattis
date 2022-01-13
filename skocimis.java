/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

/**
 *
 * @author Ross Alvine
 */
public class skocimis {
    public static void main(String[] args) {
        boolean x = true;
        int moves = 0;
        Scanner sc = new Scanner(System.in);
        int kang1 = sc.nextInt();
        int kang2 = sc.nextInt();
        int kang3 = sc.nextInt();
        while(x == true){
            int first = kang2 - kang1;
            int second = kang3 - kang2;
            if(first > 1 || second > 1){
                if(first > second){
                    kang3 = kang2;
                    kang2 = kang1 + 1;
                    moves += 1;
                }
                else{
                    kang1 = kang2;
                    kang2 = kang2 + 1;
                    moves += 1;
                }
            }
            else{
                x = false;
            }
        }
        System.out.println(moves);
    }
}
