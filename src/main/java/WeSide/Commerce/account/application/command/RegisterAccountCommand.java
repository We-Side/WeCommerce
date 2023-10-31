package WeSide.Commerce.account.application.command;

public record RegisterAccountCommand(
        String email,
        String password,
        String username,
        String role,
        String phone,
        String address
) {

}
