package com.pattern.design_patterns.creational_patterns.factory_method.after;

import com.pattern.design_patterns.creational_patterns.abstract_factory.after.Anchor;
import com.pattern.design_patterns.creational_patterns.abstract_factory.after.Wheel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", anchor='" + anchor + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
