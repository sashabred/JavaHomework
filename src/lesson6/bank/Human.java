package lesson6.bank;

public abstract class Human implements IBank{
    private String name;
    private String familyName;

    public String getName() {
        return name;
    };

    public String getFamilyName() {
        return familyName;
    }

    public abstract String getAll();

    public Human(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }
}
