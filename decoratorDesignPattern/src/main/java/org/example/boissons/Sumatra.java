package org.example.boissons;

public class Sumatra extends Boisson{
    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public float cout() {
        return 12;
    }
}
