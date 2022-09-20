package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControlle {
    
    // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/employees")
  ArrayList<String> all() {
    ArrayList<String> thing = new ArrayList<String>();
    thing.add("Hey");
    return thing;
  }
}
