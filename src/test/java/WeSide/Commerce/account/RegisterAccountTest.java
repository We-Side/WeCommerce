package WeSide.Commerce.account;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.Test;

public class RegisterAccountTest {

    @Test
    void register() {
        var accountRepository = new AccountRepository();
        var sut = new RegisterAccount(accountRepository);

        sut.register("email", "password", "username", "role", "phone", "address");


    }

    public class RegisterAccount {

        private final AccountRepository accountRepository;

        public RegisterAccount(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }

        public void register(String email, String password, String username, String role,
                String phone, String address) {
            Account account = new Account(email, password, username, role, phone, address);

            accountRepository.save(account);
        }
    }

    private class Account {

        private Long id;
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

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

    public class AccountRepository {

        private final AtomicLong sequence = new AtomicLong(1L);
        private final Map<Long, Account> accounts = new HashMap<>();

        public void save(Account account) {
            account.setId(sequence.getAndIncrement());
            accounts.put(account.getId(), account);
        }
    }
}
