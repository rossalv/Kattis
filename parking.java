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
public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricea = sc.nextInt();
        int priceb = (sc.nextInt() * 2);
        int pricec = (sc.nextInt() * 3);
        int car1ar = sc.nextInt();
        int car1dep = sc.nextInt();
        int car2ar = sc.nextInt();
        int car2dep = sc.nextInt();
        int car3ar = sc.nextInt();
        int car3dep = sc.nextInt();
        int[] car1times = new int[car1dep - car1ar ];
        int[] car2times = new int[car2dep - car2ar];
        int[] car3times = new int[car3dep - car3ar];
        for(int i = 0; i < car1times.length; i++){
            car1times[i] = car1ar + i;
        }
        for(int i = 0; i < car2times.length; i++){
            car2times[i] = car2ar + i;
        }
        for(int i = 0; i < car3times.length; i++){
            car3times[i] = car3ar + i;
        }
        //System.out.println(Arrays.toString(car1times));
        //System.out.println(Arrays.toString(car2times));
        //System.out.println(Arrays.toString(car3times));
        int total = 0;
        boolean onecar;
        boolean twocars;
        boolean threecars;
        for(int i = 0; i <= 100; i++){
            //System.out.println("time: " + i);
            onecar = false;
            twocars = false;
            threecars = false;
            for(int j = 0; j < car1times.length; j++){
                if(car1times[j] == i){
                    onecar = true;
                }
            }
            for(int j = 0; j < car2times.length; j++){
                if(onecar == true){
                    if(car2times[j] == i){
                        twocars = true;
                    }
                }
                else{
                    if(car2times[j] == i){
                        onecar = true;
                    }
                }
            }
            for(int j = 0; j < car3times.length; j++){
                if(twocars == true){
                    if(car3times[j] == i){
                        threecars = true;
                    }
                }
                else if(onecar == true){
                    if(car3times[j] == i){
                        twocars = true;
                    }
                }
                else{
                    if(car3times[j] == i){
                        onecar = true;
                    }
                }
            }
            if(threecars == true){
                total += pricec;
            }
            else if(twocars == true){
                total += priceb;
            }
            else if(onecar == true){
                total += pricea;
            }
            //System.out.println(total);
        }
        System.out.println(total);
    }
}
