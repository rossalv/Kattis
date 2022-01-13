/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ross Alvine
 */
public class everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int newcities = 0;
        for(int i = 0; i < cases; i++){
            newcities = 0;
            int numcities = sc.nextInt();
            String[] cities = new String[numcities];
            for(int j = 0; j < numcities; j++){
                cities[j] = sc.next();
            }
            Arrays.sort(cities);
            String name = cities[0];
            for(int b = 1; b < cities.length; b++){
                if(!name.equals(cities[b])){
                    newcities += 1;
                    name = cities[b];
                }
            }
            newcities += 1;
            System.out.println(newcities);
        }
    }
}