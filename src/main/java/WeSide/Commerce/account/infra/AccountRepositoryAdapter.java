package WeSide.Commerce.account.infra;

import WeSide.Commerce.account.domain.Account;
import WeSide.Commerce.account.domain.AccountRepository;
import WeSide.Commerce.account.infra.jpa.JpaAccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryAdapter implements AccountRepository {

    private final JpaAccountRepository jpaAccountRepository;

    public AccountRepositoryAdapter(JpaAccountRepository jpaAccountRepository) {
        this.jpaAccountRepository = jpaAccountRepository;
    }

    @Override
    public void save(Account account) {
        jpaAccountRepository.save(account);
    }
}
