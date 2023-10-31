package WeSide.Commerce.account.application;

import WeSide.Commerce.account.application.command.RegisterAccount;
import WeSide.Commerce.account.application.command.RegisterAccountCommand;
import org.springframework.stereotype.Service;

@Service
public class AccountFacade {

    private final RegisterAccount registerAccount;

    public AccountFacade(RegisterAccount registerAccount) {
        this.registerAccount = registerAccount;
    }

    public void registerAccount(RegisterAccountCommand command) {
        registerAccount.register(command.email(), command.password(), command.username(),
                command.role(), command.phone(), command.address());
    }

}
