package org.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/name")
    public String name(){
        return "My name is Rafeef.";
    }
    @GetMapping("/age")
    public int age(){
        return 24;
    }
    @GetMapping("/check/status")
    public String status(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server is up and running";
    }
    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Nuha");
        names.add("Lama");
        names.add("Huda");
        names.add("Lina");

        return names;
    }
}
