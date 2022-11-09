package it.ibm.interfacce.domain;

public class Programmer {

    private String favoriteLanguage; //instance variable
    private double salary;
    public final String HATED_LANGUAGE;
    private static double minSalary;
    private long id;

    public Programmer(String hatedLanguage, String favoriteLanguage){
        this.favoriteLanguage = favoriteLanguage;
        HATED_LANGUAGE = hatedLanguage;
    }

    public void writeCode(){
        System.out.println("Scrivo codice in " + this.favoriteLanguage);
    }

    public static void incrementMinSalary(double amount){
        minSalary = minSalary + amount;
        //System.out.println(this.favoriteLanguage);
        double result = Math.sin(Math.PI);
    }

}
