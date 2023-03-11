package vetclinik.iimpl;

import vetclinik.interfaces.Swimmable;

public class Turtle extends Animal implements Swimmable {

    public Turtle(String color, String name){
        super(color, name);
    }

    @Override
    public double getSwimSpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}
