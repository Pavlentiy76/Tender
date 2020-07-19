package com.pasha.crews.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tender {

    private int price;

    private ArrayList tender;

    public Tender(ArrayList tender) {
        this.tender = tender;
    }

    public int getPrice() {
        return price;
    }

    public List getTender() {
        return tender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tender tender1 = (Tender) o;
        return price == tender1.price &&
                Objects.equals(tender, tender1.tender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, tender);
    }
}
