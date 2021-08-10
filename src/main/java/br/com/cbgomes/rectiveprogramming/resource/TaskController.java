package br.com.cbgomes.rectiveprogramming.resource;

import br.com.cbgomes.rectiveprogramming.domain.Task;
import br.com.cbgomes.rectiveprogramming.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

    @RestController
    @RequestMapping("/api/task")
    public class TaskController {

        private final TaskService service;

        public TaskController(TaskService service){
            this.service = service;
        }

        @PostMapping("/create")
        public Mono<Task> create(@RequestBody Task task) {
            return this.service.save(task);
        }

        @GetMapping("/tasks")
        public Flux<Task> list(){
            return this.service.list();
        }

        @GetMapping("/{id}")
        public Mono<Task> getById(@PathVariable("id") Long id){
            return this.service.getTask(id);
        }

        @DeleteMapping
        @ResponseStatus( HttpStatus.NO_CONTENT)
        public void remove(@RequestParam("id") Long id){
            this.service.remove(id);
        }
    }
