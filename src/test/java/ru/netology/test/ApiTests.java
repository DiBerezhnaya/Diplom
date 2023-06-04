package ru.netology.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.data.ApiHelper;
import ru.netology.data.DataHelper;

import java.lang.module.Configuration;

public class ApiTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:8080/");
        DataHelper.CardInfo approvedCardInfo = DataHelper.getApprovedCard();
        DataHelper.CardInfo declinedCardInfo = DataHelper.getDeclinedCard();
    }

    //Запрос на покупку по карте со статусом APPROVED
    @Test
    void shouldApprovePayment() {
        ApiHelper.usePayCardApproved(approvedCardInfo);
    }

    //Запрос на кредит по карте со статусом APPROVED
    @Test
    void shouldApproveCredit() {
        ApiHelper.usePayCreditApproved(approvedCardInfo);
    }

    //Запрос на покупку по карте со статусом DECLINED
    @Test
    void shouldDeclinePayment() {
        ApiHelper.usePayCardDeclined(declinedCardInfo);
    }

    //Запрос на кредит по карте со статусом DECLINED
    @Test
    void shouldDeclineCredit() {
        ApiHelper.usePayCreditDeclined(declinedCardInfo);
    }
}