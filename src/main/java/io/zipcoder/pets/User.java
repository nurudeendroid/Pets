package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by nurudeenlawal on 5/5/16.
 */
public class User {
    public int findNumberofPets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have");
        return sc.nextInt();

    }
    public String petType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of pet is this");
        return sc.next();
    }
    public String pettName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is this pet's name");
        return sc.next();


    }
}

