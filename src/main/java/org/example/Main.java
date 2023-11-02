package org.example;

public class Main {

    public static void main(String[] args) throws Exception {
        Cougar cougar = new Cougar("Южноафриканский гепард", "100", Cougar.Gender.Female, 100);
        Cougar cougar1 = new Cougar("Восточноафриканский гепард", "120", Cougar.Gender.Young,150);
        Cougar cougar2 = new Cougar("Северо-восточноафриканский гепард", "200",Cougar.Gender.Male,120);
        AnnotationProcessor.createTable(cougar);
        AnnotationProcessor.insertIntoTable(cougar);
        AnnotationProcessor.insertIntoTable(cougar1);
        AnnotationProcessor.insertIntoTable(cougar2);

    }
}