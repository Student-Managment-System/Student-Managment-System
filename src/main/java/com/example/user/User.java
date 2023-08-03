package com.example.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;  

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {         //barakalla
    @Id
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)

    private String surname;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
}
