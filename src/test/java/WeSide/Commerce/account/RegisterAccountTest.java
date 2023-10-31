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
            Account account = new Account(email, password, username, role, phone, address);

        }
    }

    private class Account {

        private String email;
        private String password;
        private String username;
        private String role;
        private String phone;
        private String address;

        public Account(String email, String password, String username, String role, String phone, String address) {
            this.email = email;
            this.password = password;
            this.username = username;
            this.role = role;
            this.phone = phone;
            this.address = address;
        }
    }
}
