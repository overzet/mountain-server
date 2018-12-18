package be.intecbrussel.mountainserver.service;

import be.intecbrussel.mountainserver.model.Mountain;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class MountainRepo {

    List<Mountain> mountains;


    public MountainRepo() {
        mountains = new ArrayList<>();
    }

    public List<Mountain> getMountains() {
        return mountains;
    }

    public void setMountains(List<Mountain> mountains) {
        this.mountains = mountains;
    }


    @PostConstruct
    public List<Mountain> init() {
        mountains.add(new Mountain(1, "Mont Blanc", 4884));
        mountains.add(new Mountain(2, "Mount Vesuvius", 1265));
        mountains.add(new Mountain(3, "Mountain Bike", 2));
        return mountains;
    }
}
