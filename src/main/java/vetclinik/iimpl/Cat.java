package vetclinik.iimpl;

import vetclinik.interfaces.Runnable;

public class Cat extends Animal implements Runnable {

    public Cat(String color, String name){
        super(color, name);
    }

    @Override
    public double getRunSpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}