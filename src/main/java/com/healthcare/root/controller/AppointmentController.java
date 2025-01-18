package com.healthcare.root.controller;

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

import com.healthcare.root.model.Appointment;
import com.healthcare.root.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	 @Autowired
	    private AppointmentService appointmentService;

	    @PostMapping
	    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
	        Appointment createdAppointment = appointmentService.createAppointment(appointment);
	        return ResponseEntity.ok(createdAppointment);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Appointment> getAppointmentById(@PathVariable Long id) {
	        Appointment appointment = appointmentService.getAppointmentById(id);
	        return ResponseEntity.ok(appointment);
	    }

	    @GetMapping
	    public ResponseEntity<List<Appointment>> getAllAppointments() {
	        List<Appointment> appointments = appointmentService.getAllAppointments();
	        return ResponseEntity.ok(appointments);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Appointment> updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
	        Appointment updatedAppointment = appointmentService.updateAppointment(id, appointment);
	        return ResponseEntity.ok(updatedAppointment);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
	        appointmentService.deleteAppointment(id);
	        return ResponseEntity.noContent().build();
	    }
	
}
