package com.healthcare.root.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.root.model.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
