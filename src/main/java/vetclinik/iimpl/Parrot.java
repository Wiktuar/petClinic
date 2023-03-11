package vetclinik.iimpl;

import vetclinik.interfaces.Flyable;

public class Parrot extends Animal implements Flyable {
    public Parrot(String color, String name){
        super(color, name);
    }

    @Override
    public double getFlySpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}
