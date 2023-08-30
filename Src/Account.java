public class Account {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String eMail;
    private final long phoneNumber;

    private String surname;
    private double weight;
    private String bloodPressure; // Systolic / Diastolic
    private int numberOfSteps;

    public Account(String name, int day, int month, int year, String eMail, long phoneNumber, String surname, double weight,
                   String bloodPressure, int numberOfSteps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.numberOfSteps = numberOfSteps;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEMail() {
        return eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void printAccountInfo() {
        int age = 2020 - getYear();
        System.out.printf("Name: %s\nSurname: %s\nBirth date: %d.%d.%d\nAge: %d\nPhone number: %d\neMail: %s\n" +
                        "Weight: %.1f\nBlood pressure: %s\nNumber of Steps: %d", getName(), getSurname(),
                getDay(), getMonth(), getYear(), age, getPhoneNumber(), getEMail(), getWeight(),
                getBloodPressure(), getNumberOfSteps());
    }
}
