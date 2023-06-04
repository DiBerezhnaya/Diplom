package ru.netology.data;

import jdk.jfr.ContentType;

public class ApiHelper {

    private static final Gson gson = new Gson();
    private static DataHelper.CardInfo cardInfo;

    public static final RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(8080)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

    public static void usePayCardApproved(DataHelper.CardInfo approvedCardInfo){
            cardInfo = DataHelper.getApprovedCard();
            var body = gson.toJson(cardInfo);
            given()
                    .spec(requestSpec)
                    .body(body)
                    .when()
                    .post("/payment")
                    .then()
                    .statusCode(200);
    }

    public static void usePayCreditApproved(DataHelper.CardInfo approvedCardInfo){
            cardInfo = DataHelper.getApprovedCard();
            given()
                    .spec(requestSpec)
                    .body(cardInfo)
                    .when()
                    .post("/credit")
                    .then()
                    .statusCode(200);

    }

    public static void usePayCardDeclined(DataHelper.CardInfo declinedCardInfo){
            cardInfo = DataHelper.getDeclinedCard();
            given()
                    .spec(requestSpec)
                    .body(cardInfo)
                    .when()
                    .post("/payment")
                    .then()
                    .statusCode(200);
    }

    public static void usePayCreditDeclined(DataHelper.CardInfo declinedCardInfo){
            cardInfo = DataHelper.getDeclinedCard();
            given()
                    .spec(requestSpec)
                    .body(cardInfo)
                    .when()
                    .post("/credit")
                    .then()
                    .statusCode(200);
    }
}
