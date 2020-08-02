package com.pasha;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Worker welder = new Worker(21, TenderSkills.WELD);
        Worker locksmith = new Worker(22, TenderSkills.BUILD);
        Worker craneOperator = new Worker(28, TenderSkills.RAISE);
        Worker concreter = new Worker(25, TenderSkills.MAKING_CONCRETE);
        Worker roofer = new Worker(26, TenderSkills.MAKING_ROOF);
        Worker installer = new Worker(24, TenderSkills.MOUNT,TenderSkills.BUILD);
        Worker foreman = new Worker(23, TenderSkills.MANAGE);
        Worker painter = new Worker(29, TenderSkills.PAINT);
        Worker tiler = new Worker(29, TenderSkills.LAYING_TILES);
        Worker finisher = new Worker(32, TenderSkills.FINISHING_WORK);
        Worker watchman = new Worker(17, TenderSkills.PROTECT);
        Worker plumber = new Worker(24, TenderSkills.PLUMBING_WORK);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(welder);
        workers.add(locksmith);
        workers.add(craneOperator);
        workers.add(concreter);
        workers.add(roofer);
        workers.add(installer);
        workers.add(foreman);
        workers.add(painter);
        workers.add(tiler);
        workers.add(finisher);
        workers.add(watchman);
        workers.add(plumber);

        ArrayList<Worker> workers1 = new ArrayList<>();

        workers1.add(welder);
        workers1.add(locksmith);
        workers1.add(craneOperator);
        workers1.add(concreter);
        workers1.add(roofer);
        workers1.add(installer);
        workers1.add(foreman);
        workers1.add(painter);
        workers1.add(tiler);
        workers1.add(finisher);
        workers1.add(watchman);
        workers1.add(plumber);

        ArrayList<Worker> workers2 = new ArrayList<>();

        workers2.add(welder);
        workers2.add(locksmith);
        workers2.add(craneOperator);
        workers2.add(concreter);
        workers2.add(roofer);
        workers2.add(installer);
        workers2.add(foreman);
        workers2.add(painter);
        workers2.add(tiler);
        workers2.add(finisher);
        workers2.add(watchman);
        workers2.add(plumber);

        ArrayList<Worker> contract = new ArrayList<>();

        contract.add(welder);
        contract.add(locksmith);
        contract.add(craneOperator);
        contract.add(concreter);
        contract.add(roofer);
        contract.add(installer);
        contract.add(foreman);
        contract.add(painter);
        contract.add(tiler);
        contract.add(finisher);
        contract.add(watchman);
        contract.add(plumber);

        Brigade brigade1 = new Brigade(workers);
        Brigade brigade2 = new Brigade(workers1);
        Brigade brigade3 = new Brigade(workers2);

        ArrayList<Brigade> brigades = new ArrayList<>();

        brigades.add(brigade1);
        brigades.add(brigade2);
        brigades.add(brigade3);

        BrigadeChoice.choiceBrigade(contract,brigades);
    }
}



