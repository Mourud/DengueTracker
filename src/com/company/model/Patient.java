package com.company.model;

import java.util.ArrayList;
import java.util.List;

// TODO: Urination time test

/**
 * Represents a Patient
 */
public class Patient {

    // Fields
    /**
     * Stores unique identifier
     */
    private final int ID;
    /**
     * Stores first name
     */
    private String firstName;
    /**
     * Stores last name
     */
    private String lastName;
    /**
     * Stores list of diseases
     */
    private List<Disease> diseases;
    /**
     * Stores pulse rate
     */
    private int pulseRate;
    /**
     * Stores platelet count
     */
    private int plateletCount;
    /**
     * Stores hematocrit count
     */
    private int hematocritCount;
    /**
     * Stores temperature in fahrenheit
     */
    private double temperature;
    /**
     * Stores IV fluid and it's drop rate
     */
    private FluidInfo fluidInfo;
    /**
     * CRT examination positive or negative
     */
    private boolean CRTTest;
    /**
     * CRT examination positive or negative
     */
    private boolean NS1Test;
    /**
     * Stores systolic and diastolic blood pressure
     */
    private BloodPressure bp;


    //Constructors

    /**
     * Constructs patient with id, first name and last name
     *
     * @param ID        unique identifier
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Patient(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Constructs patient with id, first name and last name
     *
     * @param ID        unique identifier
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Patient(int ID, String firstName, String lastName, Disease disease) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;

        diseases = new ArrayList<>();
        diseases.add(disease);
    }

    /**
     * @param ID          unique identifier
     * @param firstName   the first name
     * @param lastName    the last name
     * @param disease     the disease admitted for
     * @param pulseRate   the pulse rate
     * @param temperature the body temperature in fahrenheit
     * @param bp          the blood pressure
     */
    public Patient(int ID, String firstName, String lastName, Disease disease, int pulseRate, double temperature, BloodPressure bp) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @param ID unique identifier
     * @param firstName the first name
     * @param lastName the last name
     * @param disease the disease admitted for
     * @param pulseRate the pulse rate
     * @param plateletCount the platelet count
     * @param hematocritCount the hematocrit count
     * @param temperature the body temperature in fahrenheit
     * @param fluidInfo the information for the IV fluid being used
     * @param CRTTest CRT test result
     * @param NS1Test NS1 test result
     * @param bp blood pressure test result
     */
    public Patient(int ID, String firstName, String lastName, Disease disease, int pulseRate, int plateletCount,
                   int hematocritCount, double temperature, FluidInfo fluidInfo, boolean CRTTest, boolean NS1Test,
                   BloodPressure bp) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pulseRate = pulseRate;
        this.plateletCount = plateletCount;
        this.hematocritCount = hematocritCount;
        this.temperature = temperature;
        this.fluidInfo = fluidInfo;
        this.CRTTest = CRTTest;
        this.NS1Test = NS1Test;
        this.bp = bp;
        diseases = new ArrayList<>();
        diseases.add(disease);
    }

    /**
     * set the first name
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set the
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param diseases
     */
    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

    /**
     * @param pulseRate
     */
    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    /**
     * @param plateletCount
     */
    public void setPlateletCount(int plateletCount) {
        this.plateletCount = plateletCount;
    }

    /**
     * @param hematocritCount
     */
    public void setHaematocritCount(int hematocritCount) {
        this.hematocritCount = hematocritCount;
    }

    /**
     * @param temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @param fluidInfo
     */
    public void setFluidInfo(FluidInfo fluidInfo) {
        this.fluidInfo = fluidInfo;
    }

    /**
     * @param CRTTest
     */
    public void setCRTTest(boolean CRTTest) {
        this.CRTTest = CRTTest;
    }

    /**
     * @param NS1Test
     */
    public void setNS1Test(boolean NS1Test) {
        this.NS1Test = NS1Test;
    }

    /**
     * @param bp
     */
    public void setBp(BloodPressure bp) {
        this.bp = bp;
    }
}
