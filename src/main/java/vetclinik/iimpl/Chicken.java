package vetclinik.iimpl;

import vetclinik.interfaces.Flyable;

public class Chicken extends Animal implements Flyable {
    public Chicken(String color, String name){
        super(color, name);
    }

    @Override
    public double getFlySpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}
