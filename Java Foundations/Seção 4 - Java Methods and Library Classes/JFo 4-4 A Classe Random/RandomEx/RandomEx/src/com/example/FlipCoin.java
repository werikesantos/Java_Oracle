/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {
        
        for (int i = 0; i < 1000; i++) {
            
            // 50% chance heads, 50% chance tails
            Random rand = new Random();
            double chance = rand.nextDouble();
            System.out.println(chance);
        
            if (chance < 0.5) {
                double superior = chance;
                System.out.println("Superior: " + superior);
            }else{
                double inferior = chance;
                System.out.println("Inferior: " + inferior);
            }
        }
    }
}

