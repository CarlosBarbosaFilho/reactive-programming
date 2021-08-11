package br.com.cbgomes.rectiveprogramming.service;

import br.com.cbgomes.rectiveprogramming.domain.Task;
import br.com.cbgomes.rectiveprogramming.repository.TaskRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public Mono save(Task task) {
        return  this.repository.save(task);
    }

    public Flux list(){
        return this.repository.findAll();
    }

    public Mono<Task> getTask(Long id) {
        return this.repository.findById(id);
    }

    public Mono<Void> remove(Long id) {
        return this.repository.deleteById(id);
    }
}
