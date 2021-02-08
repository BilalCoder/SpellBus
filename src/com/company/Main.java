package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j=0;
        for(int i=1; i<=a; i++){
            if(i%5 != 0)
                System.out.print(i);
            if(i%5 == 0) {
                if(j==0){
                    System.out.print("Bus");
                    j++;
                }
                else if(j==1){
                    System.out.print("bUs");
                    j++;
                }
                else if(j==2){
                    System.out.print("buS");
                    j=0;
                }
            }
            if(i!=a)
                System.out.print(" ");
        }
    }
}
