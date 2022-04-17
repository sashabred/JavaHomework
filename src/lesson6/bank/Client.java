package lesson6.bank;

public class Client extends Human{
    public String bankName;

    public Client(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }

    @Override
    public String getAll() {
        return getName() + " " + getFamilyName() + " "+ bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
