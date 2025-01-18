package com.healthcare.root.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.root.model.Appointment;
import com.healthcare.root.repository.AppointmentRepository;

@Service
public class AppointmentImplementation implements AppointmentService {
	
	@Autowired
    private AppointmentRepository appointmentRepository;
	
	
	 @Override
	    public Appointment createAppointment(Appointment appointment) {
	        return appointmentRepository.save(appointment);
	    }

	    @Override
	    public Appointment getAppointmentById(Long id) {
	        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
	        return optionalAppointment.orElse(null);
	    }

	    @Override
	    public List<Appointment> getAllAppointments() {
	        return appointmentRepository.findAll();
	    }

	    @Override
	    public Appointment updateAppointment(Long id, Appointment appointment) {
	        Appointment existingAppointment = getAppointmentById(id);
	        if (existingAppointment != null) {
	            existingAppointment.setPatientName(appointment.getPatientName());
	            existingAppointment.setDoctorName(appointment.getDoctorName());
	            existingAppointment.setAppointmentDate(appointment.getAppointmentDate());
	            return appointmentRepository.save(existingAppointment);
	        }
	        return null;
	    }

	    @Override
	    public void deleteAppointment(Long id) {
	        appointmentRepository.deleteById(id);
	    }
	
	
 
}
