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

import vau.fas.dps.it.mithini.Model.Target;
import vau.fas.dps.it.mithini.Service.TargetService;

@RestController
@RequestMapping("/api/targets")
public class TargetController {
	@Autowired
    private TargetService targetService;

    @GetMapping
    public List<Target> getAllTargets() {
        return targetService.findAll();
    }

    @PostMapping
    public Target createTarget(@RequestBody Target target) {
        return targetService.save(target);
    }

    @GetMapping("/{id}")
    public Target getTargetById(@PathVariable Long id) {
        return targetService.findById(id);
    }

    @PutMapping("/{id}")
    public Target updateTarget(@PathVariable Long id, @RequestBody Target targetDetails) {
        Target target = targetService.findById(id);
        target.setName(targetDetails.getName());
        return targetService.save(target);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarget(@PathVariable Long id) {
        targetService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
