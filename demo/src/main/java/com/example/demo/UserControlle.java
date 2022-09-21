package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Dudes;

@RestController
public class UserControlle {
    
  @GetMapping("/employees")
  ArrayList<String> all() {
    ArrayList<String> thing = new ArrayList<String>();
    thing.add("Hey");
    thing.add("What");
    return thing;
  }

  @GetMapping("/dudes")
  ArrayList<Dudes> dudes() {
    ArrayList<Dudes> thing = new ArrayList<Dudes>();
    Dudes bud = new Dudes();
    bud.setAge(20);
    bud.setGroup("Super Dudes");
    bud.setHeight("4' 9''");
    bud.setName("Bert");
    thing.add(bud);
    Dudes bud2 = new Dudes();
    bud2.setAge(22);
    bud2.setGroup("Super Dudes");
    bud2.setHeight("4' 10''");
    bud2.setName("Hughes");
    thing.add(bud2);
    return thing;
  }
}
