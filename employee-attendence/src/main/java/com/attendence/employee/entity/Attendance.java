package com.attendence.employee.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Column(name = "in_time", nullable = false)
    private LocalDateTime inTime;

    @Column(name = "out_time")
    private LocalDateTime outTime;
}
