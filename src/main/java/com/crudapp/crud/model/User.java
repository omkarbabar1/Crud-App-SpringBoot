package com.crudapp.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Name Is Mandatory")
    private String name;
    private String username;
    private String email;
    @NotNull(message = "Phone Is Mandatory")
    private Long phone;
}
