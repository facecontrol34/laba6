package com.company;


import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;




class Zxc{
    double x;
    double y;
    double z;
    Zxc(double x, double y){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void Formula(){
        z = (x + y)/(y + 1);
        if((y+1) == 0){
            System.out.println("Будь осторожен! На 0 делить нельзя!" );
        }
        else{
            System.out.println("z = " + (x + y)/(y + 1));
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = in.nextDouble();
        System.out.println("Введите y:");
        double y = in.nextDouble();
        Zxc result = new Zxc(x,y);
        result.Formula();

    }
}





