package vau.fas.dps.it.mithini.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vau.fas.dps.it.mithini.Model.Worker;
import vau.fas.dps.it.mithini.Service.WorkerService;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {
	@Autowired
    private WorkerService workerService;

    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.findAll();
    }

    @PostMapping
    public Worker createWorker(@RequestBody Worker worker) {
        return workerService.save(worker);
    }

    @GetMapping("/{id}")
    public Worker getWorkerById(@PathVariable Long id) {
        return workerService.findById(id);
    }

    @PutMapping("/{id}")
    public Worker updateWorker(@PathVariable Long id, @RequestBody Worker workerDetails) {
        Worker worker = workerService.findById(id);
        worker.setName(workerDetails.getName());
        return workerService.save(worker);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
        return ResponseEntity.noContent().build();
    }

}


