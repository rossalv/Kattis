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
public class nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++){
            int noad = sc.nextInt();
            int ad = sc.nextInt();
            int adprice = sc.nextInt();
            if((ad - adprice) > noad){
                System.out.println("advertise");
            }
            else if((ad - adprice) == noad){
                System.out.println("does not matter");
            }
            else{
                System.out.println("do not advertise");
            }
        }
    }
}
