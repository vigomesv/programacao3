package com.unama;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();
        double preço;
        System.out.println("Informe o preço: ");
        preço = sc.nextDouble();
        double total;
        total = quantidade * preço;
        System.out.println("O total é: " + total);





    }


}
