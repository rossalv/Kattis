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
public class humanCannonball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        double g = 9.81;
        for(int i = 0; i < cases; i++){
            double init = sc.nextDouble();
            double theta = Math.toRadians(sc.nextDouble());
            double xdis = sc.nextDouble();
            double lower = sc.nextDouble();
            double upper = sc.nextDouble();
            double cos = Math.cos(theta);
            double sin = Math.sin(theta);
            double second = init * cos;
            double time = xdis / second;
            double first = init * time * sin;
            double third = g * time * time;
            double fourth = third / 2;
            double height = first - fourth;
            if(upper - height > 1 && height - lower > 1){
                System.out.println("Safe");
            }
            else{
                System.out.println("Not Safe");
            }
        }
    }
}
