package com.company.model.datatype;

import com.company.model.Disease;

import java.util.List;

public class MedicalInformation {
    /**
     * Stores list of diseases
     */
    private List<Disease> diseases;
    /**
     * Stores IV fluid and it's drop rate
     */
    private FluidInfo fluidInfo;
    /**
     * Stores vitals
     */
    private Vitals vitals;
    /**
     * Stores blood test results
     */
    private BloodTestResult bloodTestResult;
    /**
     *  Stores Examination findings
     */
    private ExaminationFindings findings;
}
