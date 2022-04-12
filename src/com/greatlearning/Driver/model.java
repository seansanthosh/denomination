package com.greatlearning.Driver;

import java.util.Arrays;
import java.util.Scanner;

public class model {
    public static void main(String[] args) {
        int size,i,amount,j,temp;
        Scanner sc =new Scanner(System.in);
        task t = new task();
        System.out.println("Enter the size of currency denominations");
        size=sc.nextInt(); // input size from user
        int arr[] = new int[size];
        System.out.println("Enter the currency denominations value");
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt(); // input various denomination from user and save it in an array.
        System.out.println("Enter the amount you want to pay");
        amount=sc.nextInt();//input total amount user want to pay
        System.out.println("Your payment approach in order to give min no of notes will be");
        t.find(size,arr,amount);//invoking the find function
    }
}
