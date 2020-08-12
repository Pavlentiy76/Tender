package com.pasha;

import java.util.Objects;

public class Worker implements Comparable<Worker> {

    private Integer price;

    private TenderSkills tenderSkills;

    public Worker(int price, TenderSkills tenderSkills) {
        this.price = price;
        this.tenderSkills = tenderSkills;
    }

    public Worker(int price, TenderSkills tenderSkills,TenderSkills tenderSkills1) {
        this.price = price;
        this.tenderSkills = tenderSkills;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Worker worker) {

        int result = this.tenderSkills.compareTo(worker.tenderSkills);

        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "price=" + price +
                ", tenderSkills=" + tenderSkills +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return price == worker.price &&
                tenderSkills == worker.tenderSkills;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, tenderSkills);
    }



}
