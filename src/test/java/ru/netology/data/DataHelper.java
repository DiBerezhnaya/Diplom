package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private static final Faker faker = new Faker(Locale.ENGLISH);
    private static final String approvedCard = "4444 4444 4444 4441";
    private static final String declinedCard = "4444 4444 4444 4442";

    public static String getStatusFirstCard() {
        return "APPROVED";
    }

    public static String getStatusSecondCard() {
        return "DECLINED";
    }

    public static String getValidMonth() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM"));
    }

    private static String getPreviousMonth() {
        return LocalDate.now().minusMonths(1).format(DateTimeFormatter.ofPattern("MM"));
    }

    private static String getZeroMonth() {
        return "00";
    }

    private static String getThirteenMonth() {
        return "13";
    }

    public static String getValidYear() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yy"));
    }

    private static String getValidYearPlusOne() {
        return LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy"));
    }

    private static String getPreviousYear() {
        return LocalDate.now().minusYears(1).format(DateTimeFormatter.ofPattern("yy"));
    }

    private static String getPlusSixYear() {
        return LocalDate.now().plusYears(6).format(DateTimeFormatter.ofPattern("yy"));
    }

    public static String getHolder() {
        return faker.name().fullName();
    }

    public static String getNameRus() {
        return fakerRu.name().lastName() + " " + fakerRu.name().firstName();
    }

    private static String getNameEn() {
        return faker.name().lastName();
    }


    public static String getCVC() {
        return faker.numerify("###");
    }

    private static String getTwoNumber() {
        return faker.numerify("##");
    }

    private static String getOneNumber() {
        return faker.numerify("#");
    }

    private static String getFakerNumberCard() {
        return faker.business().creditCardNumber();
    }

    private static String getFifteenNumber() {
        return approvedCard.substring(0, 18);
    }

    private static String getEmptyField() {
        return " ";
    }

    private static String getSpecialSymbol() {
        return "@#$%^&*()~-+/*?><|";
    }

    @Value
    public static class CardInfo {
        String number;
        String month;
        String year;
        String cardowner;
        String cvc;
    }

    public static CardInfo getApprovedCard() {
        return new CardInfo(approvedCard, getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getDeclinedCard() {
        return new CardInfo(declinedCard, getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getApprovedCardWithoutSpacebar(){
        return new CardInfo(approvedCard, getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getEmptyCardNumber() {
        return new CardInfo(getEmptyField(), getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getOneNumberCardNumber() {
        return new CardInfo(getOneNumber(), getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

  // public static CardInfo getFifteenNumberCardNumber() {
  //      return new CardInfo(getFifteenNumber(), getValidMonth(), getValidYear(), getCardowner(), getCVC());
  // }

    public static CardInfo getFakerNumberCardNumber() {
        return new CardInfo(getFakerNumberCard(), getValidMonth(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getEmptyMonth() {
        return new CardInfo(approvedCard, getEmptyField(), getValidYear(), getCardowner(), getCVC());
    }

    public static CardInfo getOneNumberMonth() {
        return new CardInfo(approvedCard, getOneNumber(), getValidYear(), getCardowner(), getCVC());
    }



    public static CardInfo getEmptyYear() {
        return new CardInfo(approvedCard, getValidMonth(), getEmptyField(), getCardowner(), getCVC());
    }

    public static String getValidMonth() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getValidYear() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yy"));
    }


    public static String getCardowner() {
        return faker.name().fullName();
    }

    public static String getCVC() {
        return faker.numerify("###");
    }

    private static String getTwoNumber() {
        return faker.numerify("##");
    }

    private static String getOneNumber() {
        return faker.numerify("#");
    }

    private static String getFakerNumberCard() {
        return faker.business().creditCardNumber();
    }

    private static String getEmptyField() {
        return " ";
    }
}
