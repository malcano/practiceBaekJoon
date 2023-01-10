package org.example;

import java.util.*;

class Solution2438 {
    public void solution(){
        Scanner sc = new java.util.Scanner(System.in);
        int count = sc.nextInt();
        String star = "*";
        for(int i = 0 ; i<count ; i++){
            System.out.println(star);
            star+="*";
        }
    }
}
