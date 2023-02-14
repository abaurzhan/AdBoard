package com.adboard.domain;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ad_id")
    int id;

    String name;

    @Version
    int version;

    String description;

    AdStatus status;

    @Column(name = "min_price")
    BigDecimal minPrice;

    @Column(name = "current_price")
    BigDecimal currentPrice;

    @ManyToOne
    @JoinColumn(name = "FK_Current_User")
    User currentUser;

    @ManyToOne
    @JoinColumn(name = "FK_Last_User")
    User lastUser;

}
