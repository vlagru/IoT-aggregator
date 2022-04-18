package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AggregatorControllerTest {

    @Test
    void saveServerAndGetIdentificationsTest(){
        AggregatorController controller = new AggregatorController();

        controller.saveServer(new Identification("Moje meteostanice",
                new Address("Horova", 31, "Praha"),
                new Person("Alex", "Novy")));
        List<Identification> list = controller.getIdentifications().getBody();

        Assertions.assertNotNull(list);
        Assertions.assertEquals(1, list.size());
    }

}
