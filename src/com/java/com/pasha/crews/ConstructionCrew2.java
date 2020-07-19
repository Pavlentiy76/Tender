package com.pasha.crews;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConstructionCrew2 {

    private int price = 21;

    private ArrayList crew2;

    public ConstructionCrew2(ArrayList crew2){
        this.crew2 = crew2;
    }

    public int getPrice() {
        return price;
    }

    public List getCrew2() {
        return crew2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructionCrew2 that = (ConstructionCrew2) o;
        return price == that.price &&
                Objects.equals(crew2, that.crew2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, crew2);
    }
}
