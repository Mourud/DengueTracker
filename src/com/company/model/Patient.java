package com.company.model;

import com.company.model.datatype.MedicalInformation;

// TODO: Implement Barcode ID system

/**
 * Represents a Patient
 */
public class Patient {

    // FIELDS

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
     * Stores age
     */
    private int age; //TODO: Make age type to use months and age
    /**
     * Stores weight
     */
    private double weight;
    /**
     * Stores medical information
     */
    private MedicalInformation medicalInformation;

    //CONSTRUCTORS

    /**
     * Constructs patient with ID, first name and last name
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
     * Constructs patient with ID, first name, last name, weight and age
     *
     * @param ID        unique identifier
     * @param firstName the first name
     * @param lastName  the last name
     * @param age       the age
     * @param weight    the weight
     */
    public Patient(int ID, String firstName, String lastName, int age, double weight) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //SETTERS

    /**
     * sets the first name
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * sets the last name
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * sets the age
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * sets the weight
     *
     * @param weight the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * sets the medical information
     *
     * @param medicalInformation the medical information
     */
    public void setMedicalInformation(MedicalInformation medicalInformation) {
        this.medicalInformation = medicalInformation;
    }

    //GETTERS

    /**
     * returns ID
     *
     * @return <code>ID</code>
     */
    public int getID() {
        return ID;
    }

    /**
     * returns first name
     *
     * @return <code>firstName</code>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * returns last name
     *
     * @return <code>lastName</code>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * returns age
     *
     * @return <code>age</code>
     */
    public int getAge() {
        return age;
    }

    /**
     * returns weight
     *
     * @return <code>weight</code>
     */
    public double getWeight() {
        return weight;
    }

    /**
     * returns medical information
     *
     * @return <code>medicalInformation</code>
     */
    public MedicalInformation getMedicalInformation() {
        return medicalInformation;
    }
}
