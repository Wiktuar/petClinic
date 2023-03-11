package vetclinik.iimpl;

import vetclinik.interfaces.Swimmable;

public class Guppi extends Animal implements Swimmable {

    public Guppi(String color, String name){
        super(color, name);
    }

    @Override
    public double getSwimSpeed() {
        return (double)getDistance() / getMilliseconde();
    }
}
