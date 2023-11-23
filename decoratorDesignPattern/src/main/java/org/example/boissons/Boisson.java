package org.example.boissons;

public abstract class Boisson {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract float cout();
}
