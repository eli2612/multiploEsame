package com.elisa;
import java.util.Scanner;
public class Main {

    public static boolean main(String[] args) {



        Scanner scan =new Scanner(System.in);
        System.out.print("Scrivi il numero: ");
        int n1 = scan.nextInt();

        if (n1 % 2 == 0){
            
            return true;

        }
        else{
            
            return false;

            }
        }
    }

