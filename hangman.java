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
public class hangman {
    public static void main(String[] args) {
        int count = 0;
        boolean n = false;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] asd = new char[3];
        char[] words = word.toCharArray();
        //System.out.println(Arrays.toString(words));
        String guess = sc.next();
        char[] guesses = guess.toCharArray();
        //System.out.println(Arrays.toString(guesses));
        for(int i = 0; i < 26; i++){
            n = false;
            for(int j = 0; j < word.length(); j++){
                if(guesses[i] == words[j]){
                    words[j] = ' ';
                    n = true;
                }
            }
            boolean win = true;
            for(int k = 0; k < word.length(); k++){
                if(words[k] != ' '){
                    win = false;
                }
            }
            if(win == true){
                System.out.println("WIN");
                break;
            }
            if(n == false){
                count += 1;
            }
            if(count == 10){
                System.out.println("LOSE");
                break;
            }
            //System.out.println("Guesses: " + (count + 1));
            //System.out.println(Arrays.toString(words));
        }
    }
}
