package WeSide.Commerce.account.infra.jpa;

import WeSide.Commerce.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAccountRepository extends JpaRepository<Account, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
