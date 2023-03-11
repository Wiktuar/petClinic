package vetclinik;

import vetclinik.iimpl.Cat;
import vetclinik.vetclinic.Doctor;
import vetclinik.vetclinic.Vetclinick;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Doctor doctorAlexandra = new Doctor("Alexandra", 35, 12);
        Vetclinick vetclinick = new Vetclinick("Pitomez", doctorAlexandra);

        Cat cat = new Cat("Vasya", "white");
        cat.setIll(true);
        cat.sayIfIll();
        vetclinick.getDoctor().treat(cat);
        cat.sayIfIll();
    }
}
