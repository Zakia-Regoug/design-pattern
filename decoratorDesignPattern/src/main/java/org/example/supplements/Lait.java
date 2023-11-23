package org.example.supplements;

import org.example.boissons.Boisson;

public class Lait extends Decorator{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public float cout() {
        return boisson.cout()+5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Lait";
    }
}
