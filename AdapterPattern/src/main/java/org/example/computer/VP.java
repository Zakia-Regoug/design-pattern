package org.example.computer;


public class VP implements VGA{
    @Override
    public void print(String message) {
        System.out.println(" **************** VP **************");
        System.out.println(message);
    }
}
