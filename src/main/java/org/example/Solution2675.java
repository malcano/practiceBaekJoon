package org.example;

import java.util.*;

class Solution2675 {
    public void solution(){
        String answer = "";
        Scanner sc = new java.util.Scanner(System.in);
        int testcase = sc.nextInt();

        for(int i = 0;i<testcase ; i++){
            answer = "";
            int num = sc.nextInt();
            String inputStr = sc.next();
            for(char ch : inputStr.toCharArray()){
                for(int j = 0 ; j<num ; j++){
                    answer+=ch;
                }
            }
            System.out.println(answer);
        }
    }
}
