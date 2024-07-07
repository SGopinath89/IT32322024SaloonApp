package vau.fas.dps.it.mithini.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vau.fas.dps.it.mithini.Model.Worker;
import vau.fas.dps.it.mithini.Repository.WorkerRepo;

@Service
public class WorkerService {
	 @Autowired
	    private WorkerRepo workerRepository;

	    public List<Worker> findAll() {
	        return workerRepository.findAll();
	    }

	    public Worker save(Worker worker) {
	        return workerRepository.save(worker);
	    }

	    public Worker findById(Long id) {
	        return workerRepository.findById(id).orElse(null);
	    }

	    public void delete(Long id) {
	        workerRepository.deleteById(id);
	    }

}
