package WeSide.Commerce.account.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
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

    protected Account() {

    }

}
