package WeSide.Commerce.account.domain;

import WeSide.Commerce.account.domain.Account;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class AccountRepository {

    private final AtomicLong sequence = new AtomicLong(1L);
    private final Map<Long, Account> accounts = new HashMap<>();

    public void save(Account account) {
        account.setId(sequence.getAndIncrement());
        accounts.put(account.getId(), account);
    }

    public List<Account> findAll() {
        return accounts.values().stream().toList();
    }
}
