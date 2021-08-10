package br.com.cbgomes.rectiveprogramming.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    private Long id;
    private String description;
    private String project;
    private String developer;
}
