package com.michael;

public class Main {

    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] a, int p, int q, int x){
        int i = (int) Math.floor((q + p) / 2);
        if(a[i] == x){
            return i;
        } else if(x < a[i] && i > p){
            return binarySearch(a, p, i- 1, x);
        } else if(x > a[i] && i < q) {
            return binarySearch(a, i + 1, q, x);
        }
        return -1;
    }
}
