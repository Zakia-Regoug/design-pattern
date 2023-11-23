package org.example.computer;

public class HdmiVgaAdapter implements VGA{
    private HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        byte[] bt=message.getBytes();
        hdmi.plot(bt);

    }
}
