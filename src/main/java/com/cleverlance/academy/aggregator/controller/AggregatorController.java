package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Identification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j //pro logovani
@RestController
public class AggregatorController {

    /**
     * metoda 'welcome' da na vypsani 'welcome'
     * */

//    @GetMapping(path = "/welcome")
//    public ResponseEntity<String> welcome(){
//        return ResponseEntity.ok("welcome");
//    }

    /**
     * metoda 'identification' vypise DTO-cka
     * */
//    @GetMapping("/identification")
//    public ResponseEntity <Identification> getIdentification(){
//        return ResponseEntity.ok(new Identification("Moje meteostanice",
//                new Address("Horcicna", 22, "Praha"),
//                new Person("Martin", "Vesely")));
//    }

    /**
     * seznam 'identification', do ktereho budu ukladat posty a
     * nasledne ho pouziju v get metode
     * */
    private List<Identification> identifications = new ArrayList<>();

    /**
     * post pro ulozeni na server
     * header: content-type application/json
     * restman nebo postman
     */

    @PostMapping("/server")
    public ResponseEntity<Void> saveServer(@RequestBody Identification identification) {
        log.info("Server identification: {}", identification);
//        log.info("Server identification: " + identification); //to same

        this.identifications.add(identification);

        return ResponseEntity.ok().build(); //tady musi byt 'build' metoda - kanon
    }

    @GetMapping("/server")
    public ResponseEntity<List<Identification>> getIdentifications(){

        log.info("Server identifications {}", identifications);

        return ResponseEntity.ok(this.identifications);
    }
}
