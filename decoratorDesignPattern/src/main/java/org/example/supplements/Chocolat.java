package org.example.supplements;

import org.example.boissons.Boisson;

public class Chocolat extends Decorator{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public float cout() {
        return boisson.cout()+3;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au chocolat";
    }
}
