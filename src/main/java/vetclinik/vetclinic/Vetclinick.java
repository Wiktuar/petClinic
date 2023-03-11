package vetclinik.vetclinic;

import lombok.Getter;
import lombok.Setter;
import vetclinik.iimpl.Animal;
import vetclinik.interfaces.Flyable;
import vetclinik.interfaces.Swimmable;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Vetclinick {
    private String name;
    private Doctor doctor;
    private final List<Animal> listOfAllAnimals;
    private final List<Runnable> listOfRunnableAnimals;
    private final List<Swimmable> listOfSwimnableAnimals;
    private final List<Flyable> listOfFlyableAnimals;

    public Vetclinick(String name, Doctor doctor){
        this.name = name;
        this.doctor = doctor;
        this.listOfAllAnimals = new ArrayList<>();
        this.listOfRunnableAnimals = new ArrayList<>();
        this.listOfSwimnableAnimals = new ArrayList<>();
        this.listOfFlyableAnimals = new ArrayList<>();
    }

    public Vetclinick addAllPatients(Animal animal){
        listOfAllAnimals.add(animal);
        return this;
    }

    public Vetclinick addRunnablePatients(Runnable runnable){
        listOfRunnableAnimals.add(runnable);
        return this;
    }

    public Vetclinick addSwimmablePatients(Swimmable swimmable){
        listOfSwimnableAnimals.add(swimmable);
        return this;
    }

    public Vetclinick addFlyablePatients(Flyable flyable){
        listOfFlyableAnimals.add(flyable);
        return this;
    }
}
