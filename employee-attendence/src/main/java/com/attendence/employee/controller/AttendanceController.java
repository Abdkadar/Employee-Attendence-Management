package com.attendence.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendence.employee.entity.Attendance;
import com.attendence.employee.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/clock-in/{employeeId}")
    public Attendance clockIn(@PathVariable Long employeeId) {
        return attendanceService.clockIn(employeeId);
    }

    @PostMapping("/clock-out/{employeeId}")
    public Attendance clockOut(@PathVariable Long employeeId) {
        return attendanceService.clockOut(employeeId);
    }

    @GetMapping("/records/{employeeId}")
    public List<Attendance> getAttendanceRecords(@PathVariable Long employeeId) {
        return attendanceService.getAttendanceRecords(employeeId);
    }
}
