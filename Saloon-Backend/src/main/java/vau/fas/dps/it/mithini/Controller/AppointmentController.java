package vau.fas.dps.it.mithini.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vau.fas.dps.it.mithini.Model.Appointment;
import vau.fas.dps.it.mithini.Service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")

public class AppointmentController {
	@Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public ResponseEntity< List<Appointment> >getAllAppointments() {
        List<Appointment > appointment=appointmentService.findAll();
        return new ResponseEntity<>(appointment, HttpStatus.OK);
    }
    @PostMapping("/add")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        return appointmentService.findById(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointmentDetails) {
        Appointment appointment = appointmentService.findById(id);
        appointment.setDate(appointmentDetails.getDate());
        appointment.setTime(appointmentDetails.getTime());
        appointment.setUser(appointmentDetails.getUser());
        appointment.setTarget(appointmentDetails.getTarget());
        appointment.setWorker(appointmentDetails.getWorker());
        return appointmentService.save(appointment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
        appointmentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}

