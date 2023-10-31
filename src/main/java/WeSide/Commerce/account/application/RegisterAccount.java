package WeSide.Commerce.account.application;

import WeSide.Commerce.account.domain.Account;
import WeSide.Commerce.account.domain.AccountRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RegisterAccount {

    private final AccountRepository accountRepository;

    public RegisterAccount(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void register(String email, String password, String username, String role,
            String phone, String address) {
        Account account = new Account(email, password, username, role, phone, address);

        if (accountRepository.existsByEmail(email)) {
            throw new RuntimeException("Duplicate Email");
        }
        if (accountRepository.existsByUsername(username)) {
            throw new RuntimeException("Duplicate Username");
        }

        accountRepository.save(account);
    }
}
