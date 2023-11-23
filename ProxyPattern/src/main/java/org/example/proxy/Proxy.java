package org.example.proxy;

import java.util.Random;

public class Proxy implements Standard{
    private StandardImpl1 target;
    @Override
    public void process() {
        System.out.println("Verification du contexte de securite ");
        boolean b=new Random().nextBoolean();
        if(b){
            target=new StandardImpl1();
            target.process();
        }else{
            throw new RuntimeException("Forbidden 403");
        }

    }
}
