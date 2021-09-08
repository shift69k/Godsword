package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random computer=new Random();
        int user;
        System.out.println("it is the users choice");
        Scanner sc=new Scanner(System.in);
        user= sc.nextInt();
        switch (user){
            case 0:
                System.out.println("u chose rock");
                break;
            case 1:
                System.out.println("you chose scissor");
                break;
            case 2:
                System.out.println("you chose paper");
                break;
        }
        int input;
        System.out.println("now it is turn for computer");
        input= computer.nextInt(3);;

        switch (input){
            case 0:
                System.out.println("u chose rock");
                break;
            case 1:
                System.out.println("you chose scissor");
                break;
            case 2:
                System.out.println("you chose paper");
                break;

        }
        if(user==0 && input==1 || user==2 && input==0 || user==1 && input==2){
            System.out.println("congratulations you won");
        }
        else{
            System.out.println("sorry");
        }






    }
}
