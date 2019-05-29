package com.healthtracker.healthTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiaryController {

    @Autowired
    DiaryRepo repo;


//post new exercise
    @PostMapping("/entry")
    public void createEntry(@RequestParam String title,
                            @RequestParam String quantity,
                            @RequestParam String description,
                            @RequestParam String timestamp){
        Entry entry = new Entry(title, quantity, description, timestamp);
        repo.save(entry);
    }

// get all exercises
    @GetMapping("/all")
    public List getAll(){
        return repo.findAll();
    }

}
