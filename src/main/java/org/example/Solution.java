package org.example;

import java.util.*;
import java.io.*;

public class Solution {
    public void bj1157 (String input){
        Map<Character,Integer> alphabet = new java.util.HashMap<Character,Integer>();
        for(char i : input.toCharArray()){
            if(!alphabet.containsKey(i)){
                alphabet.put(i,1);
                continue;
            }
            alphabet.put(i, alphabet.get(i));

        }





    }
}
