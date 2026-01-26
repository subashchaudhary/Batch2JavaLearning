package oop.encapsulation;

public class EncapsulatedDemo {


    static void main() {


        Bank bank = new Bank(); //object : data and function ecapsulated
        bank.getBalance(1234);


        long balance =  bank.getBalance(1234);
        System.out.println("Current balance: " + balance);
    }
}



class Bank{


    private String bankName;
    private String address;
    private String branch;
    private String accountNumber;
    private String accountName;
    private int pin = 1234 ;
    private long totalBalance;


    private int changePin(int oldping, int newpin){
        if(oldping == this.pin){
            this.pin = newpin;
        }
        System.out.println("Invalid pin, : sorry pin changed");
        return oldping;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPin() {
        return pin;
    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }

    //inquiry
    public long getBalance(int pin){
        if(pin == this.pin){
            return totalBalance;

        }

        System.out.println("Invalid pin");
        return 0;


    }

    public void setBalance(long balance){

    }


}