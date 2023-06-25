package ru.netology.data;

public class Cards {
    private String number;
    private String month;
    private String year;
    private String cardowner;
    private String cvc;

    public Cards(String number, String month, String year, String holder, String cvc){
        this.number =number;
        this.month = month;
        this.year = year;
        this.cardowner = holder;
        this.cvc = cvc;
    }

    public String getNumber(){
        return number;
    }
    public String getMonth(){
        return month;
    }
    public String getYear(){
        return year;
    }
    public String getCardowner(){
        return cardowner;
    }
    public String getCvc(){
        return cvc;
    }
}
