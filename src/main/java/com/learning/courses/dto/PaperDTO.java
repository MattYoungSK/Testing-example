package com.learning.courses.dto;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaperDTO {

    private String collaborators;

    private String ISBN;

    private String topic;

}
