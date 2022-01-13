/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypackage;

import java.util.Scanner;

/**
 *
 * @author Ross Alvine
 */
public class backspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharArrayStack chars = new CharArrayStack();
        String input = sc.next();
        char[] charar = input.toCharArray();
        for(int i = 0; i < charar.length; i++){
            if(charar[i] != '<'){
                chars.push(charar[i]);
            }
            else{
                chars.pop();
            }
        }
        System.out.println(chars);
    }
}

class CharArrayStack{
    char[] arr;
    int elements;
    int size = 10;
    public CharArrayStack(){
        arr = new char[size];
        elements = 0;
    }
    //puts val on the top of the stack
    public void push(char val){
        if(elements == size){
            grow();
        }
        arr[elements] = val;
        elements++;
    }
    //removes and returns the top of the stack
    public char pop(){
        if(elements == 0){
            return '-';
        }
        elements--;
        return arr[elements];
    }
    public int getSize(){
        return elements;
    }
    public String toString(){
        return String.valueOf(arr, 0, elements);
    }
    private void grow(){
        size = size * 2;
            char[] newarr = new char[size];
            for(int i = 0; i < arr.length; i++){
                newarr[i] = arr[i];
            }
            arr = newarr;
    }
}
