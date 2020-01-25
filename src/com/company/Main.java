package com.company;

public class Main {

    //https://projecteuler.net/archives

    public static void main(String[] args) {

	/*
	If we list all the natural numbers below 10 that are multiples of
    3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
	*/
//        int sum = 0;
//
//        for (int i = 0; i < 1000; i++) {
//
//            if((i % 3 == 0) || (i % 5 == 0)) {
//                sum += i;
//            }
//        }
//        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sum + ".");


    /*
    By considering the terms in the Fibonacci sequence whose values do
    not exceed four million, find the sum of the even-valued terms.
    The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    */
        int firstNum = 0;
        int secondNum = 1;
        int total = 0;
        boolean bool = true;

         while(bool){
             if(firstNum % 2 == 0){
                if(firstNum < 4000000){
//                  System.out.println(firstNum);
                    total += firstNum;
                }
                else{
                    bool = false;
                }

            }
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;

            }
        System.out.println("The summation of all the even numbers that do not exceed four million" +
                           " within the Fibonacci sequence is " + total);
        }

    }

