package org.example;

import org.example.proxy.Client;
import org.example.proxy.Proxy;
import org.example.proxy.StandardImpl1;

public class Main {
    public static void main(String[] args) {
        Client client=new Client();
        client.setStandard(new Proxy());
        client.process();
    }
}
