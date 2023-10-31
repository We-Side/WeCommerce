package WeSide.Commerce.account;

import WeSide.Commerce.account.domain.Account;
import WeSide.Commerce.account.domain.AccountRepository;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class FakeAccountRepository implements AccountRepository {

    private final AtomicLong sequence = new AtomicLong(1L);
    private final Map<Long, Account> accounts = new ConcurrentHashMap<>();

    public void save(Account account) {
        accounts.put(sequence.getAndIncrement(), account);
    }

    @Override
    public boolean existsByEmail(String email) {
        return accounts.values()
                .stream()
                .anyMatch(account -> account.getEmail().equals(email));
    }

    @Override
    public boolean existsByUsername(String username) {
        return accounts.values()
                .stream()
                .anyMatch(account -> account.getUsername().equals(username));
    }
    
    public List<Account> findAll() {
        return accounts.values().stream().toList();
    }
}
