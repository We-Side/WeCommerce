package WeSide.Commerce.account.application;

import WeSide.Commerce.account.domain.Account;
import WeSide.Commerce.account.domain.AccountRepository;

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
