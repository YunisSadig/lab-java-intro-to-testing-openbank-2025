package com.example.odd.numbers;

public class OddNumbers {
    public static int[] getOdds(int n){
        if(n<1){
            return new int[]{};
        }
        int size=(n+1)/2;
        int []result=new int[size];

        int index=0;
        for(int i=1;i<=n;i+=2){
            result[index++]=i;
        }
        return result;
    }
}
