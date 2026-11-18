package com.xyz.autocare.repository;

import com.xyz.autocare.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    @Query("SELECT COUNT(a) FROM Appointment a WHERE a.appointmentDate = :date " +
           "AND a.slotId = :slotId AND a.status IN ('PENDING', 'CONFIRMED', 'IN_PROGRESS', 'COMPLETED')")
    long countActiveBySlot(@Param("date") LocalDate date, @Param("slotId") Integer slotId);
}
