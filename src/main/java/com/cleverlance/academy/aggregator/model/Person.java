package com.cleverlance.academy.aggregator.model;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Value;


/**
 * @Data
 * @Getter
 * @EqualsAndHashCode
 * @Setter
 * */
@Value //immutable, mohlo by se pridat 'final'
public class Person {

    private String firstName;
    private String lastName;
}
