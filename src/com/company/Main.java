package com.company;

import com.company.model.Dengue;
import com.company.model.Disease;
import com.company.model.Patient;

public class Main {

    public static void main(String[] args) {
        Disease disease = new Dengue();
        Patient patient = new Patient(12,"AJ","Smith");

    }
}
