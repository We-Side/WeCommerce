package WeSide.Commerce.account;

import static org.assertj.core.api.Assertions.assertThat;

import WeSide.Commerce.account.application.RegisterAccount;
import WeSide.Commerce.account.domain.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterAccountTest {

    @Test
    @DisplayName("회원가입 테스트")
    void register() {
        var accountRepository = new AccountRepository();
        var sut = new RegisterAccount(accountRepository);

        sut.register("email", "password", "username", "role", "phone", "address");

        assertThat(accountRepository.findAll()).hasSize(1);
    }

}
