/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kattis;
import java.util.*;

/**
 *
 * @author rfalv
 */
public class Methods {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int x = stdin.nextInt();
        System.out.println(takeTwoStones(x));
    }
    static double triangleArea(double h, double b){
        return h * b / 2;
    }
    static double twoSum(double a, double b){
        return a + b;
    }
    static int tarifa(int x, int n, Scanner stdin){
        int total = x;
        for(int i = 0; i < n; i++){
            total += x - stdin.nextInt();
        }
        return total;
    }
    static String takeTwoStones(int a){
        if(a % 2 == 0){
            return "Bob";
        }
        return "Alice";
    }
}


