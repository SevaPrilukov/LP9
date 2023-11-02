package org.example;

@Table(title = "Гепард")
public class Cougar {
    public enum Gender {
        Female, Male, Young;
    }
    @Column
    private String name;

    @Column
    private String speed;

    @Column
    private Gender gender;

    @Column
    private int weight;

    public Cougar(String name, String speed, Gender gender, int weight) {
        this.name = name;
        this.speed = speed;
        this.gender = gender;
        this.weight = weight;
    }
}
