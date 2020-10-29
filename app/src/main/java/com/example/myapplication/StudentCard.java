package com.example.myapplication;

public class StudentCard {


    private String Name;
    private int enrollment;
    private float cgpa;
    private int id;

    private int S1,S2,S3,S4;

    public StudentCard(String name, int enrollment, float cgpa, int id, int s1, int s2, int s3, int s4) {
        Name = name;
        this.enrollment = enrollment;
        this.cgpa = cgpa;
        this.id = id;
        S1 = s1;
        S2 = s2;
        S3 = s3;
        S4 = s4;
    }

    public String getName() {
        return Name;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public float getCgpa() {
        return cgpa;
    }

    public int getId() {
        return id;
    }

    public int getS1() {
        return S1;
    }

    public int getS2() {
        return S2;
    }

    public int getS3() {
        return S3;
    }

    public int getS4() {
        return S4;
    }
}
