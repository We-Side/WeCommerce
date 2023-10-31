package WeSide.Commerce.account.api;

import WeSide.Commerce.account.presentation.request.RegisterAccountRequest;
import WeSide.Commerce.common.ApiTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class AccountApiTest extends ApiTest {

    @Test
    @DisplayName("회원가입")
    void registerUser() {
        var request = new RegisterAccountRequest("id@email.com", "password", "username", "role",
                "phone", "address");

        RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/accounts")
                .then().log().all()
                .statusCode(HttpStatus.CREATED.value());
    }

}
