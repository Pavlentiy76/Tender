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

        //-------------------------------------------------------------------------

        Worker welder1 = new Worker(23, TenderSkills.WELD);
        Worker locksmith1 = new Worker(24, TenderSkills.BUILD);
        Worker craneOperator1 = new Worker(18, TenderSkills.RAISE);
        Worker concreter1 = new Worker(23, TenderSkills.MAKING_CONCRETE);
        Worker roofer1 = new Worker(26, TenderSkills.MAKING_ROOF);
        Worker installer1 = new Worker(25, TenderSkills.MOUNT,TenderSkills.BUILD);
        Worker foreman1 = new Worker(22, TenderSkills.MANAGE);
        Worker painter1 = new Worker(22, TenderSkills.PAINT);
        Worker tiler1 = new Worker(23, TenderSkills.LAYING_TILES);
        Worker finisher1 = new Worker(35, TenderSkills.FINISHING_WORK);
        Worker watchman1 = new Worker(13, TenderSkills.PROTECT);
        Worker plumber1 = new Worker(24, TenderSkills.PLUMBING_WORK);

        ArrayList<Worker> workers1 = new ArrayList<>();

        workers1.add(welder1);
        workers1.add(locksmith1);
        workers1.add(craneOperator1);
        workers1.add(concreter1);
        workers1.add(roofer1);
        workers1.add(installer1);
        workers1.add(foreman1);
        workers1.add(painter1);
        workers1.add(tiler1);
        workers1.add(finisher1);
        workers1.add(watchman1);
        workers1.add(plumber1);

        workers1.add(finisher1);
        workers1.add(watchman1);
        workers1.add(plumber1);

        //--------------------------------------------------------------------------

        Worker welder2 = new Worker(20, TenderSkills.WELD);
        Worker locksmith2 = new Worker(22, TenderSkills.BUILD);
        Worker craneOperator2 = new Worker(28, TenderSkills.RAISE);
        Worker concreter2 = new Worker(25, TenderSkills.MAKING_CONCRETE);
        Worker roofer2 = new Worker(26, TenderSkills.MAKING_ROOF);
        Worker installer2 = new Worker(24, TenderSkills.MOUNT,TenderSkills.BUILD);
        Worker foreman2 = new Worker(23, TenderSkills.MANAGE);
        Worker painter2 = new Worker(29, TenderSkills.PAINT);
        Worker tiler2 = new Worker(29, TenderSkills.LAYING_TILES);
        Worker finisher2 = new Worker(32, TenderSkills.FINISHING_WORK);
        Worker watchman2 = new Worker(17, TenderSkills.PROTECT);
        Worker plumber2 = new Worker(24, TenderSkills.PLUMBING_WORK);

        ArrayList<Worker> workers2 = new ArrayList<>();

        workers2.add(welder2);
        workers2.add(locksmith2);
        workers2.add(craneOperator2);
        workers2.add(concreter2);
        workers2.add(roofer2);
        workers2.add(installer2);
        workers2.add(foreman2);
        workers2.add(painter2);
        workers2.add(tiler2);
        workers2.add(finisher2);
        workers2.add(watchman2);
        workers2.add(plumber2);

        //-----------------------------------------------------------------------

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

        //-------------------------------------------------------------------------

        Brigade brigade3 = new Brigade("brig1", workers);
        Brigade brigade1 = new Brigade("brig2", workers1);
        Brigade brigade2 = new Brigade("brig3", workers2);

        ArrayList<Brigade> brigades = new ArrayList<>();

        brigades.add(brigade1);
        brigades.add(brigade2);
        brigades.add(brigade3);

        BrigadeChoice.choiceBrigade(contract,brigades);


    }
}



