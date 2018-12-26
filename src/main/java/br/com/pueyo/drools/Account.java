package br.com.pueyo.drools;

public class Account {
    
    private Integer balance;
    private int emprestimo;
    
    
    public Account() {}
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public Account(Integer balance) {
        super();
        this.balance = balance;
    }
    public void withdraw(int money) {
        balance -= money;
    }
    public void depositaEmprestimo(int money) {
        balance += money;
        emprestimo++;
    }
    public int getEmprestimo() {
        return emprestimo;
    }
    
    

}
