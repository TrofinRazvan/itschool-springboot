package ro.itschool.springboot.designpatterns.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {

    private String name;
    private int age;
}
