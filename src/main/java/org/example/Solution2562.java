package org.example;

import java.util.*;

class Solution2562 {
    public void solution(){
        Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> numList = new java.util.ArrayList<Integer>();
        int max  = 0;
        for(int i = 0 ; i< 9 ; i++){
            numList.add(sc.nextInt());
        }
        max = Collections.max(numList);
        System.out.println(max);
        System.out.println(numList.indexOf(max)+1);
    }
}
