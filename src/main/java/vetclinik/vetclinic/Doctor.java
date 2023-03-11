package vetclinik.vetclinic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vetclinik.iimpl.Animal;

@AllArgsConstructor
@Getter
@Setter
public class Doctor {
    private String name;
    private int age;
    private int experience;

    public void treat(Animal animal){
        if(animal.isIll())animal.setIll(false);
    }
}
