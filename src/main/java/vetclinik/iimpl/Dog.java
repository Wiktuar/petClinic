package vetclinik.iimpl;

import vetclinik.interfaces.Runnable;

public class Dog extends Animal implements Runnable {

    public Dog(String color, String name){
        super(color, name);
    }

    @Override
    public double getRunSpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}
