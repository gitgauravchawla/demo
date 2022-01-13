package com.springrestapi.demo.entity;

public class portfolio {

    private String name;
    private String age;
    private String prescribedmedicines;
    private String PreExistingDiseases;
    private String InsuranceSumEligible;

    public portfolio() {
        super();
    }

    public portfolio(String name, String age, String prescribedmedicines, String preExistingDiseases, String insuranceSumEligible) {
        this.name = name;
        this.age = age;
        this.prescribedmedicines = prescribedmedicines;
        this.PreExistingDiseases = preExistingDiseases;
        this.InsuranceSumEligible = insuranceSumEligible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPrescribedmedicines() {
        return prescribedmedicines;
    }

    public void setPrescribedmedicines(String prescribedmedicines) {
        this.prescribedmedicines = prescribedmedicines;
    }

    public String getPreExistingDiseases() {
        return PreExistingDiseases;
    }

    public void setPreExistingDiseases(String preExistingDiseases) {
        PreExistingDiseases = preExistingDiseases;
    }

    public String getInsuranceSumEligible() {
        return InsuranceSumEligible;
    }

    public void setInsuranceSumEligible(String insuranceSumEligible) {
        InsuranceSumEligible = insuranceSumEligible;
    }

    @Override
    public String toString() {
        return "portfolio{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", prescribedmedicines='" + prescribedmedicines + '\'' +
                ", PreExistingDiseases='" + PreExistingDiseases + '\'' +
                ", InsuranceSumEligible='" + InsuranceSumEligible + '\'' +
                '}';
    }
}
