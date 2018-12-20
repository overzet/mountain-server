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
        mountains.add(new Mountain(0, "Mont Blanc", 4884,"45.833636, 6.865347"));
        mountains.add(new Mountain(1, "Mount Vesuvius", 5265,"40.823454, 14.429035"));
        mountains.add(new Mountain(2, "Mountain fuji", 24567,"35.361674, 138.727949"));
        return mountains;
    }

    public Mountain getById(long id) {
        return mountains.get((int) id);
    }
}
