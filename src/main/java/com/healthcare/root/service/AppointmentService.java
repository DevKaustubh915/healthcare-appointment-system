package com.healthcare.root.service;

import java.util.List;

import com.healthcare.root.model.Appointment;

public interface AppointmentService {
	
	Appointment createAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Long id, Appointment appointment);
    void deleteAppointment(Long id);

}
