package com.learning.courses.model;

import com.learning.courses.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person tutor;

    private String collaborators;

    private String ISBN;

    private String topic;

}
