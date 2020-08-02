package com.pasha;

import java.util.ArrayList;
import java.util.Objects;

public class Brigade {

    private ArrayList<Worker> workers;

    public Brigade(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public int price(){
        int price = 0;
       for (int i=0; i < workers.size(); i++){
           price += workers.get(i).getPrice();
       }
       return price;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "workers=" + workers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return Objects.equals(workers, brigade.workers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workers);
    }
}
