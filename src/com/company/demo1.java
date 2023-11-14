package com.company;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if(i<j){
            if(i<k){
                System.out.println(i);
            }else{
                System.out.println(k);
            }
        }else{
            if(j<k){
                System.out.println(j);
            }else{
                System.out.println(k);
            }
        }



    }
}
