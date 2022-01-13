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
public class oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++){
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println(num + " is even");
            }
            else{
                System.out.println(num + " is odd");
            }
        }
    }
}
