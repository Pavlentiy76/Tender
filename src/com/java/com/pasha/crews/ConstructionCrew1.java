package com.pasha.crews;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConstructionCrew1 {

    private String name = "crew1";

    private int price = 13;

    private ArrayList<String> crew1;

    public ConstructionCrew1(ArrayList crew1){
        this.crew1 = crew1;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public List getCrew1() {
        return crew1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructionCrew1 that = (ConstructionCrew1) o;
        return price == that.price &&
                Objects.equals(crew1, that.crew1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, crew1);
    }
}
