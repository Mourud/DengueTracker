package com.company.model.datatype;

// Contains blood test result information
public class BloodTestResult {

    //FIELDS

    /**
     * Stores platelet count
     */
    private int plateletCount;
    /**
     * Stores hematocrit count
     */
    private int hematocritCount;
    /**
     * Stores NS1 presence in blood; ; +ve is true, -ve is false
     */
    private boolean isNS1Present;
    /**
     * Stores percentage of haemoglobin in blood
     */
    private double haemoglobinPct;
    /**
     * Stores WBC total count in blood
     */
    private int wbcCount;
    /**
     * Stores WBC differential count
     */
    private double wbcDiffCountPct;
    /**
     * Stores serum albumin fraction in g/L of blood
     */
    private double albuminLevel;
    /**
     *  Stores blood sugar
     */
    private double bloodSugarLvl;
    /**
     * Stores serum calcium
     */
    private double caLvl;
    /**
     * Stores Electrolyte information
     */
    private Electrolyte electrolyte;
    /**
     * Stores IgG presence blood; +ve is true, -ve is false
     */
    private boolean isIgGPresent;
    /**
     * Stores IgM presence blood; +ve is true, -ve is false
     */
    private boolean isIgMPresent;

    //SETTERS

    /**
     * sets platelet count
     *
     * @param plateletCount the platelet count
     */
    public void setPlateletCount(int plateletCount) {
        this.plateletCount = plateletCount;
    }

    /**
     * sets haematocrit count
     *
     * @param hematocritCount the haematocrit count
     */
    public void setHematocritCount(int hematocritCount) {
        this.hematocritCount = hematocritCount;
    }

    /**
     * sets test result for NS1 test
     *
     * @param NS1Present the test result for NS1
     */
    public void setNS1Present(boolean NS1Present) {
        this.isNS1Present = NS1Present;
    }

    //GETTERS

    /**
     * returns platelet count
     *
     * @return <code>plateletCount</code>
     */
    public int getPlateletCount() {
        return plateletCount;
    }

    /**
     * returns haematocrit count
     *
     * @return <code>haematocritCount</code>
     */
    public int getHematocritCount() {
        return hematocritCount;
    }

    /**
     * returns NS1 test result
     *
     * @return <code>NS1Test</code>
     */
    public boolean isNS1Present() {
        return isNS1Present;
    }
}
