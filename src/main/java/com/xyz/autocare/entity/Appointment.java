package com.xyz.autocare.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    private String appointmentCode;
    private String customerName;
    private String phone;
    private String licensePlate;
    private String serviceName;
    private LocalDate appointmentDate;
    private Integer slotId;
    private String slotTime;
    private String status = "PENDING";

    public Integer getAppointmentId() { return appointmentId; }
    public void setAppointmentId(Integer appointmentId) { this.appointmentId = appointmentId; }
    public String getAppointmentCode() { return appointmentCode; }
    public void setAppointmentCode(String appointmentCode) { this.appointmentCode = appointmentCode; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public LocalDate getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(LocalDate appointmentDate) { this.appointmentDate = appointmentDate; }
    public Integer getSlotId() { return slotId; }
    public void setSlotId(Integer slotId) { this.slotId = slotId; }
    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
