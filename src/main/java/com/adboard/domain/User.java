package com.adboard.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    int id;

    @Version
    int version;

    String username;

    String password;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Role> roles;

    String email;
}
