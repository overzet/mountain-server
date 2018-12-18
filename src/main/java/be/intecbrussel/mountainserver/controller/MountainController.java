package be.intecbrussel.mountainserver.controller;

import be.intecbrussel.mountainserver.model.Mountain;
import be.intecbrussel.mountainserver.service.MountainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MountainController {

    @Autowired
    private MountainRepo mountainRepo;

    @RequestMapping("/mountain")
    public List<Mountain> mountainsList() {
        return mountainRepo.getMountains();
    }

    @RequestMapping("/mountain/{id}")
    public Mountain mountain(@PathVariable long id){
        return mountainRepo.getById(id);
    }
}