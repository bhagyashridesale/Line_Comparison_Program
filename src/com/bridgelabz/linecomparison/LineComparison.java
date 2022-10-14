package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static int lineLengthCal() {
        Scanner Scanner=new Scanner(System.in);
        int x1,y1,x2,y2;

        System.out.println("Enter the value for first point");
        x1=Scanner.nextInt();
        y1=Scanner.nextInt();

        System.out.println("Enter the value for second point");
        x2=Scanner.nextInt();
        y2=Scanner.nextInt();

        int lineLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lineLength;
    }

    public static void checkEquality(int lineOneLength, int lineTwoLength) {
        if (lineOneLength == lineTwoLength){
            System.out.println("Line are Equal");
        }
        else {
            System.out.println("Lines are not Equal");
            }
        }
        public static void main (String[] args){
        int lineOneLength = lineLengthCal();
        int lineTwoLength = lineLengthCal();
            System.out.println("The length of line 1 is: "+lineOneLength);
            System.out.println("The length of line 2 is: "+lineTwoLength);
            checkEquality(lineOneLength, lineTwoLength);
        }
    }
