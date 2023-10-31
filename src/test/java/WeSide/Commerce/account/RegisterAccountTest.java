package WeSide.Commerce.account;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import WeSide.Commerce.account.application.RegisterAccount;
import WeSide.Commerce.account.domain.Account;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterAccountTest {

    @Test
    @DisplayName("회원가입 테스트")
    void register() {
        var accountRepository = new FakeAccountRepository();
        var sut = new RegisterAccount(accountRepository);

        sut.register("email", "password", "username", "role", "phone", "address");

        assertThat(accountRepository.findAll()).hasSize(1);
    }

    @Test
    @DisplayName("회원가입 중복 이메일 예외")
    void registerDuplicateEmail() {
        var accountRepository = new FakeAccountRepository();
        var sut = new RegisterAccount(accountRepository);
        accountRepository.save(
                new Account("email", "password", "username", "role", "phone", "address"));

        assertThatThrownBy(
                () -> sut.register("email", "password", "username", "role", "phone", "address"))
                .hasMessage("Duplicate Email");
    }

    @Test
    @DisplayName("회원가입 중복 유저명 예외")
    void registerDuplicateUsername() {
        var accountRepository = new FakeAccountRepository();
        var sut = new RegisterAccount(accountRepository);
        accountRepository.save(
                new Account("email2", "password", "username", "role", "phone", "address"));

        assertThatThrownBy(
                () -> sut.register("email", "password", "username", "role", "phone", "address"))
                .hasMessage("Duplicate Username");
    }

}
