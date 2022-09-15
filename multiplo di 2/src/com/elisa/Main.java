package com.elisa;
import java.util.Scanner;
public class Main {

    public static boolean main(String[] args) {



        Scanner scan =new Scanner(System.in);
        System.out.print("Scrivi il numero: ");
        int n1 = scan.nextInt();

        if (n1 % 2 == 0){
            System.out.println("multiplo di due");
            return true;

        }
        else{
            System.out.println(" non e' multiplo di 2");
            return false;

            }
        }
    }

