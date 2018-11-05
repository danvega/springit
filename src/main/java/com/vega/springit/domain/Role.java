package com.vega.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

}
