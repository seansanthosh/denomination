package com.greatlearning.Driver;

public class task extends model{
public void find(int size,int arr[],int amount){
    int i,j,temp,answer,flag=0;
    for(i=0;i<size;i++)
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
    for(i=0;i<size&&amount!=0;i++,answer=0)
    {
        if(amount%arr[i]>=0)
        {
            answer=amount/arr[i];
            if(answer!=0) {
                amount -= arr[i] * answer;
                System.out.println(arr[i] + ":" + answer);
                flag=1;
            }

        }
    }
    if(flag==0)
    {
        System.out.println("Cannot calculate the due to wrong denomination");
    }

}
}
