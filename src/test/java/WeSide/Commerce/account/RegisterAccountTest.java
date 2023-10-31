package WeSide.Commerce.account;

import org.junit.jupiter.api.Test;

public class RegisterAccountTest {

    @Test
    void register() {
        var sut = new RegisterAccount();

        sut.register("email", "password", "username", "role", "phone", "address");


    }

    public class RegisterAccount {

        public void register(String email, String password, String username, String role,
                String phone, String address) {

        }
    }
}
