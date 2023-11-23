package org.example.computer;

public class UniteCentral {
    private VGA vga;

    public void setVga(VGA vga) {
        this.vga = vga;
    }

    public void print(String message){
        System.out.println("################ Unite Centrale ##############");
        vga.print(message);
    }
}
