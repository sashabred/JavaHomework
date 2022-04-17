package lesson6.bank;

public class EmployeeBank extends Human{

    public String bankName;

    public EmployeeBank(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }

    @Override
    public String getAll() {
        return getName() + " " + getFamilyName() + " , банк:"+ bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
