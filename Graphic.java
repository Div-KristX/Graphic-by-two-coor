package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("First =  ");
        System.out.print("X= ");
        Scanner num1 = new Scanner(System.in);
        float x,x2,y,y2;
        x = num1.nextInt();
        System.out.print("Y= ");
        Scanner num2 = new Scanner(System.in);
        y = num2.nextInt();



        System.out.println("Second = ");
        System.out.print("X= ");
        Scanner num3 = new Scanner(System.in);
        x2 = num3.nextInt();
        System.out.print("Y= ");
        Scanner num4 = new Scanner(System.in);
        y2 = num4.nextInt();

        char coorx = 'x';
        char coory = 'y';
        float c,dk,db;
        float k,b;
        c = x-x2;
        dk = y-y2;
        k=dk/c;
        db = x*y2-x2*y;
        b = db/c;
        double valuek = k;
        String result = String.format("%.2f",valuek);
        System.out.print("k=");
        System.out.println(result);

        double valueb = b;
        String result2 = String.format("%.2f",valueb);
        System.out.print("b=");
        System.out.println(result2);
        if (b<0){
            System.out.println("Graphic -->" +" "+ coory+"="+result + coorx +result2);

        }
        if(b==0){
            System.out.println("Graphic -->" +" "+ coory+"="+result + coorx +"+"+result2);

        }
        if(b>0){
            System.out.println("Graphic -->" +" "+ coory+"="+result + coorx);


        }
        double degrees1 = k;
        System.out.println("Tg(a)= "+k);
        double a;
        a=Math.atan(degrees1);
        double aa =a;
        if(aa<0){
            String resulta = String.format("%.2f",aa);
            double deg;
            deg = 180-((-1)*a*180/Math.PI);
            String resultad = String.format("%.2f",deg);
            System.out.println("Angle= "+resultad);


        }if(aa>0) {

            String resulta = String.format("%.2f", aa);
            double deg;
            deg = a * 180 / Math.PI;

            String resultad = String.format("%.2f", deg);
            System.out.println("Angle= " + resultad);
        }
    }
}