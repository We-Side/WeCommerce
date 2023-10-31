package WeSide.Commerce.account.domain;

public interface AccountRepository {

    void save(Account account);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
