package com.xl001;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            BigInteger[] a = new BigInteger[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextBigInteger();
            }
            Arrays.sort(a);
            for(int k=0; k<n; k++){
                System.out.println(a[k]);
            }

        }
    }
}
