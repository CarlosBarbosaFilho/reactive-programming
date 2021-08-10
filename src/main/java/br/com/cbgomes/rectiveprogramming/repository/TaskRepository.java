package br.com.cbgomes.rectiveprogramming.repository;

import br.com.cbgomes.rectiveprogramming.domain.Task;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends ReactiveCrudRepository<Task, Long> {
}
