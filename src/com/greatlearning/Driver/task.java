package com.greatlearning.Driver;

public class task extends model{
public void find(int size,int arr[],int amount){
    int i,j,temp,answer,flag=0;
    for(i=0;i<size;i++) // line number 6 to 17 will perform sorting
    {
        for(j=i;j<size;j++)
        {
            if(arr[j]>arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(i=0;i<size&&amount!=0;i++) // for loop iterates through the array
    {
        if(amount%arr[i]>=0)
        {
            answer=amount/arr[i];
            if(answer!=0) { //to avoid zero denomination values
                amount -= arr[i] * answer; // finds the balance amount
                System.out.println(arr[i] + ":" + answer); // prints on screen
                flag=1; // flag is set from 0 to 1 - for detecting wrong denomination
            }

        }
    }
    if(flag==0) // if flag is 0, then no denominations can be found
    {
        System.out.println("Cannot calculate the due to wrong denomination");
    }

}
}
