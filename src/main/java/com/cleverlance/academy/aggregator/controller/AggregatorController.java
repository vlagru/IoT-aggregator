package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    /**
     * metoda na vypsani 'welcome'
     * */

//    @GetMapping(path = "/welcome")
//    public ResponseEntity<String> welcome(){
//        return ResponseEntity.ok("welcome");
//    }

    @GetMapping("/identification")
    public ResponseEntity <Identification> getIdentification(){
        return ResponseEntity.ok(new Identification("Moje meteostanice",
                new Address("Horcicna", 22, "Praha"),
                new Person("Martin", "Vesely")));
    }

}
