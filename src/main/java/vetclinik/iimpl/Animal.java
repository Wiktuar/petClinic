package vetclinik.iimpl;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Animal {
    private String color;
    private String name;
    private boolean isIll;
    private int distance;
    private int milliseconde;

//  данные для вычисения скорости каждого животного автоматически задаются в конструкторе
    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
        this.isIll = false;
        this.distance = new Random().nextInt(100);
        this.milliseconde = new Random().nextInt(60);
    }

    public void canEat(){
        System.out.println(getType() + " кушает");
    }

    public void sayIfIll(){
        if(this.isIll()) System.out.println(getType() + " заболел");
            else  System.out.println(getType() + " здоров");
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

}
