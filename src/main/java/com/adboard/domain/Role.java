package com.adboard.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Version
    int version;

    @Enumerated(EnumType.STRING)
    ROLE_NAME name;

}
