package org.example.supplements;

import org.example.boissons.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract float cout();
    public abstract String getDescription();

}
