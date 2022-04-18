package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class AggregatorControllerTest {

    /**
     * namokuju si, abych neukladal 'AggregatorController' class do promenne
     * v pripade, ze nebude napr. '@RestController', projde to ale
     * s '@AutoConfigureMockMvc' uz by nemelo
     * */
    @Autowired
    public MockMvc mockMvc;

    @Test
    void testWithMock() throws Exception {

        //TEST POST
        this.mockMvc.perform(post("/server")
                        .contentType("application/json").
                        content("{\"name\": \"aaaa\"}"))
                .andExpect(status().isOk());

        //TEST GET
        this.mockMvc.perform(get("/server")).andDo(print()).andExpect(status().isOk());

    }

    /**
     * Test nize neni z udevdenych duvodu doporucen psat
     * */

//    @Test
//    void saveServerAndGetIdentificationsTest(){
//        AggregatorController controller = new AggregatorController();//nemelo by se takto ukladat, pouziju MVC namist
//
//        controller.saveServer(new Identification("Moje meteostanice",
//                new Address("Horova", 31, "Praha"),
//                new Person("Alex", "Novy")));
//        List<Identification> list = controller.getIdentifications().getBody();
//
//        Assertions.assertNotNull(list);
//        Assertions.assertEquals(1, list.size());
//    }

}
