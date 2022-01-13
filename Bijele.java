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
public class Bijele {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] correctNums = {1, 1, 2, 2, 2, 8};
        int[] nums = new int[6];
        for(int i = 0; i < 6; i++){
            nums[i] = stdin.nextInt();
            nums[i] = correctNums[i] - nums[i];
            System.out.println(nums[i]);
        }
    }
}
