package vau.fas.dps.it.mithini.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vau.fas.dps.it.mithini.Model.Target;
import vau.fas.dps.it.mithini.Repository.TargetRepo;

@Service
public class TargetService {
	@Autowired
    private TargetRepo targetRepository;

    public List<Target> findAll() {
        return targetRepository.findAll();
    }

    public Target save(Target target) {
        return targetRepository.save(target);
    }

    public Target findById(Long id) {
        return targetRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        targetRepository.deleteById(id);
    }

}
