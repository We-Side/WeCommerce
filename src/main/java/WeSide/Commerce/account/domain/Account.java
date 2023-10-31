package WeSide.Commerce.account.domain;

public class Account {

    private Long id;
    private String email;
    private String password;
    private String username;
    private String role;
    private String phone;
    private String address;

    public Account(String email, String password, String username, String role, String phone,
            String address) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
