package entities;

public class BankAccount {
    private Integer accNum;
    private Integer agency;
    private String owner;
    private Double amount;

    public BankAccount(Integer accNum, Integer agency, String owner, Double amount) {
        this.accNum = accNum;
        this.agency = agency;
        this.owner = owner;
        this.amount = amount;
    }


    public Integer getAccNum() {
        return accNum;
    }
    public void setAccNum(Integer accNum) {
        this.accNum = accNum;
    }


    public Integer getAgency() {
        return agency;
    }
    public void setAgency(Integer agency) {
        this.agency = agency;
    }


    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }


    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
