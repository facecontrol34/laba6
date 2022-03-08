package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        // z = (x+y)/(y+1)
        Scanner in = new Scanner(System.in);
        double x,y,z;
        System.out.print("Введите x: ");
        x = in.nextDouble();
        System.out.print("Введите y: ");
        y = in.nextDouble();
        if (y+1==0){
            System.out.println("Будь осторожен! На ноль делить нельзя!");
        }
        else {
            System.out.println("z = " + (x+y)/(y+1));
        }

    }

}

