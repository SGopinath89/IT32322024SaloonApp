package vau.fas.dps.it.mithini.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vau.fas.dps.it.mithini.Model.Appointment;
import vau.fas.dps.it.mithini.Repository.AppointmentRepo;

@Service
public class AppointmentService {
	@Autowired
    private AppointmentRepo appointmentRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }

}
