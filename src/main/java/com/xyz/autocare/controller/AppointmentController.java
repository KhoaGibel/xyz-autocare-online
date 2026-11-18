package com.xyz.autocare.controller;

import com.xyz.autocare.entity.Appointment;
import com.xyz.autocare.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "*")
public class AppointmentController {

    private static final int MAX_CAPACITY = 3; // F07: Toi da 3 xe / khung gio

    @Autowired
    private AppointmentRepository repo;

    @GetMapping
    public List<Appointment> getAll() {
        return repo.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> create(@RequestBody Appointment req) {
        long booked = repo.countActiveBySlot(req.getAppointmentDate(), req.getSlotId());
        if (booked >= MAX_CAPACITY) {
            return ResponseEntity.badRequest().body(
                Map.of("error", "Khung gio da dat gioi han toi da (3/3 xe)!")
            );
        }
        req.setStatus("PENDING");
        return ResponseEntity.ok(repo.save(req));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<?> updateStatus(@PathVariable Integer id, @RequestParam String status) {
        return repo.findById(id).map(a -> {
            a.setStatus(status);
            return ResponseEntity.ok(repo.save(a));
        }).orElse(ResponseEntity.notFound().build());
    }
}
