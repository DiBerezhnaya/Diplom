package ru.netology.test.apiTest;

import org.junit.jupiter.api.Test;
import ru.netology.data.ApiHelper;
import ru.netology.data.DataHelper;

public class ApiTests {

    DataHelper.CardInfo approvedCardInfo = DataHelper.getApprovedCard();
    DataHelper.CardInfo declinedCardInfo = DataHelper.getDeclinedCard();

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