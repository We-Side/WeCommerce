package WeSide.Commerce.account.presentation;

import WeSide.Commerce.account.application.RegisterAccount;
import WeSide.Commerce.account.presentation.request.RegisterAccountRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final RegisterAccount registerAccount;

    public AccountController(RegisterAccount registerAccount) {
        this.registerAccount = registerAccount;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerAccount(@Valid @RequestBody RegisterAccountRequest request) {
        registerAccount.register(request.email(), request.password(), request.username(),
                request.role(), request.phone(), request.address());
    }

}
