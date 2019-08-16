package com.company.model;

/**
 * Represents Blood pressure data type
 */
public class BloodPressure {

    //FIELDS

    /**
     * Stores systolic pressure
     */
    private int systolic;
    /**
     * Stores diastolic pressure
     */
    private int diastolic;


    //CONSTRUCTORS

    /**
     * Constructs blood pressure data type with systolic and diastolic pressure
     *
     * @param systolic  the systolic pressure
     * @param diastolic the diastolic pressure
     */
    public BloodPressure(int systolic, int diastolic) {
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    //SETTERS

    public void setBloodPressure(int systolic, int diastolic) {
        setSystolic(systolic);
        setDiastolic(diastolic);
    }

    private void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    private void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    //GETTERS

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public int getPulsePressure() {
        return systolic - diastolic;
    }


}
