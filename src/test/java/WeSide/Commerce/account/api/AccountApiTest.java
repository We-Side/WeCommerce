package WeSide.Commerce.account.api;

import WeSide.Commerce.common.ApiTest;
import WeSide.Commerce.common.Scenario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountApiTest extends ApiTest {

    @Test
    @DisplayName("회원가입")
    void registerAccount() {
        Scenario.accountApi().registerAccountApi();
    }

}
