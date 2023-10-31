package WeSide.Commerce.account.presentation.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record RegisterAccountRequest(
        @Email(message = "이메일 형식이 올바르지 않습니다.")
        String email,
        @NotEmpty(message = "패스워드는 필수입니다.")
        String password,
        @NotEmpty(message = "유저명는 필수입니다.")
        String username,
        String role,
        String phone,
        String address) {

}
