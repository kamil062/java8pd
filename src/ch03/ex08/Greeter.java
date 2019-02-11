package ch03.ex08;

import java.util.Random;

public class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for(int i = 0; i < this.n; i++) {
            try {
                System.out.println("Witaj, " + this.target);
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
