package com.pasha.crews;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConstructionCrew3 {

    private String name = "crew3";

    private int price = 20;

    private ArrayList crew3;

    public ConstructionCrew3(ArrayList crew3){
        this.crew3 = crew3;
    }

    public int getPrice() {
        return price;
    }

    public List getCrew3() {
        return crew3;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructionCrew3 that = (ConstructionCrew3) o;
        return price == that.price &&
                Objects.equals(crew3, that.crew3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, crew3);
    }
}
