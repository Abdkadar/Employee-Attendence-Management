package com.attendence.employee.service;

import java.util.List;

import com.attendence.employee.entity.Attendance;

public interface AttendanceService {

	Attendance clockIn(Long employeeId);

    Attendance clockOut(Long employeeId);

    List<Attendance> getAttendanceRecords(Long employeeId);
}
