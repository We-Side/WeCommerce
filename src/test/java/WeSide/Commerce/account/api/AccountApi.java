package WeSide.Commerce.account.api;

import WeSide.Commerce.account.presentation.request.RegisterAccountRequest;
import WeSide.Commerce.common.Scenario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.springframework.http.HttpStatus;

public class AccountApi {

    private String email = "id@email.com";
    private String password = "password";
    private String username = "username";
    private String role = "role";
    private String phone = "phone";
    private String address = "address";

    public AccountApi email(String email) {
        this.email = email;
        return this;
    }

    public AccountApi password(String password) {
        this.password = password;
        return this;
    }

    public AccountApi username(String username) {
        this.username = username;
        return this;
    }

    public AccountApi role(String role) {
        this.role = role;
        return this;
    }

    public AccountApi phone(String phone) {
        this.phone = phone;
        return this;
    }

    public AccountApi address(String address) {
        this.address = address;
        return this;
    }

    public Scenario registerAccountApi() {
        var request = new RegisterAccountRequest(email, password, username, role, phone, address);

        RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/accounts")
                .then().log().all()
                .statusCode(HttpStatus.CREATED.value());

        return new Scenario();
    }
}
