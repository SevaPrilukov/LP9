package org.example;

public class Main {
//    private static Connection connection;
//    private static Statement statement;

    public static void main(String[] args) throws Exception {
        Cougar cougar = new Cougar("Южноафриканский гепард", "100", Cougar.Gender.Female, 100);
        Cougar cougar1 = new Cougar("Восточноафриканский гепард", "120", Cougar.Gender.Young,150);
        Cougar cougar2 = new Cougar("Северо-восточноафриканский гепард", "200",Cougar.Gender.Male,120);
        AnnotationProcessor.createTable(cougar);
        AnnotationProcessor.insertIntoTable(cougar);
        AnnotationProcessor.insertIntoTable(cougar1);
        AnnotationProcessor.insertIntoTable(cougar2);

    }

//    public static void connect() {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:/Users/sevaprilukov/LP9SQLITE.db");
//            statement = connection.createStatement();
//        } catch (SQLException | ClassNotFoundException var1) {
//            var1.printStackTrace();
//        }
//
//    }
//
//    public static void disconnect() {
//        try {
//            statement.close();
//        } catch (SQLException var2) {
//            var2.printStackTrace();
//        }
//
//        try {
//            connection.close();
//        } catch (SQLException var1) {
//            var1.printStackTrace();
//        }
//
//    }
}