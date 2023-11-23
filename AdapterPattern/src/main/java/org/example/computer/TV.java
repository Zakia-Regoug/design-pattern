package org.example.computer;

public class TV implements HDMI{
    public void plot(byte[] sms){
        String str=new String(sms);
        System.out.println(".............. TV .............");
        System.out.println(str);
    }
}
