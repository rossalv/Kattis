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
public class hissingmicrphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(word.contains("ss")){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}
