package org.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private LocalDate birthDay;
    private String username;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String password;
    private String bio;

    @OneToOne(fetch = FetchType.EAGER , mappedBy = "user")
    private UserMedia userMedia;

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id",nullable = false)
    private Role role;
}