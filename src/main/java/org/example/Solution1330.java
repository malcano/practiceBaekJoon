package org.example;

class Solution1330{

    public void solution(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a-b>0)
            System.out.println(">");
        else if(a-b<0)
            System.out.println("<");
        else
            System.out.println("==");

    }
}
