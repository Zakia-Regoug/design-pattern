package org.example;

import org.example.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentral uc= new UniteCentral();
        uc.setVga(new Ecran());
        uc.print("Bonjour");
        uc.setVga(new VP());
        uc.print("VGA");
        uc.setVga(new HdmiVgaAdapter(new TV()));
        uc.print("Adapter");
    }
}