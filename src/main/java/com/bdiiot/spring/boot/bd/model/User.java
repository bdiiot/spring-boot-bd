package com.bdiiot.spring.boot.bd.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    private String gender;

}
