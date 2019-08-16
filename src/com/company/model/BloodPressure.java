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
    // TODO: Is a constructor needed, since there is nothing to be made?

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

    /**
     * sets systolic and diastolic pressure
     *
     * @param systolic  the systolic pressure
     * @param diastolic the diastolic pressure
     */
    public void setBloodPressure(int systolic, int diastolic) {
        setSystolic(systolic);
        setDiastolic(diastolic);
    }

    /**
     * sets systolic pressure
     *
     * @param systolic the systolic pressure
     */
    private void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    /**
     * sets diastolic pressure
     *
     * @param diastolic the diastolic pressure
     */
    private void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    //GETTERS

    /**
     * returns systolic pressure
     *
     * @return <code>systolic</code>
     */
    public int getSystolic() {
        return systolic;
    }

    /**
     * returns diastolic pressure
     *
     * @return <code>diastolic</code>
     */
    public int getDiastolic() {
        return diastolic;
    }

    /**
     * returns pulse pressure
     *
     * @return pulse pressure
     */
    public int getPulsePressure() {
        return systolic - diastolic;
    }


}
