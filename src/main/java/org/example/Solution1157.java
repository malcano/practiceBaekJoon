package org.example;

class Solution1157 {
    public void bj1157 (String input){
        int max = -1;
        char ch = ' ';

        java.util.Map<Character, Integer> alphabet = new java.util.HashMap<Character,Integer>();
        for(char i : input.toCharArray()){
            if(!alphabet.containsKey(Character.toUpperCase(i))){
                alphabet.put(Character.toUpperCase(i),1);
                continue;
            }
            alphabet.put(Character.toUpperCase(i), alphabet.get(Character.toUpperCase(i))+1);
        }
        for(Character key : alphabet.keySet()){
            if(max<alphabet.get(key)){
                max = alphabet.get(key);
                ch = key;
            }
        }
        boolean isSingle = true;
        for(int i : alphabet.values()){
            if(isSingle == false && i == max){
                System.out.println("?");
                return;
            }
            if(i==max)
                isSingle = false;

        }
        System.out.println(ch);

    }

}