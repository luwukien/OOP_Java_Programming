package data;

public class Client {
    private String idCardBanking;
    private String nameCardBanking;
    private String identityCardNumber; //CCCD
    private String phoneNumber; //giới hạn là 10 con số tức là
    private long balance;

    public Client(String idCardBanking, String nameCardBanking, String identityCardNumber, long balance, String phoneNumber) {
        this.idCardBanking = idCardBanking;
        this.nameCardBanking = nameCardBanking;
        this.identityCardNumber = identityCardNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getIdCardBanking() {
        return idCardBanking;
    }

    public void setIdCardBanking(String idCardBanking) {
        this.idCardBanking = idCardBanking;
    }

    public String getNameCardBanking() {
        return nameCardBanking;
    }

    public void setNameCardBanking(String nameCardBanking) {
        this.nameCardBanking = nameCardBanking;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long changeBalance(long moneyWithdraw) {
        this.balance -= moneyWithdraw;
        return this.balance;
    }
}
