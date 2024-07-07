package vau.fas.dps.it.mithini.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name="appointments")
@CrossOrigin(origins = "http://localhost:3000")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String date;
    private String time;

	private String service;

	private String mobile;
    @ManyToOne
    private User user;

    @ManyToOne
    private Target target;

    @ManyToOne
    private Worker worker;

	public Appointment() {
		super();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Appointment(Long id,String mobile, String date, String time, User user, Target target, Worker worker, String service) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.user = user;
		this.target = target;
		this.worker = worker;
		this.service=service;
		this.mobile=mobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
}
