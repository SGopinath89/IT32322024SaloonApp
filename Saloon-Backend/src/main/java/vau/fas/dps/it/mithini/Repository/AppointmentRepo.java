package vau.fas.dps.it.mithini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vau.fas.dps.it.mithini.Model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
