package org.example;

import org.example.boissons.Boisson;
import org.example.boissons.Sumatra;
import org.example.supplements.Chocolat;
import org.example.supplements.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson b= new Sumatra();
        b = new Lait(new Chocolat(new Lait(b)));
        System.out.println(b.getDescription());
        System.out.println(b.cout());
    }
}