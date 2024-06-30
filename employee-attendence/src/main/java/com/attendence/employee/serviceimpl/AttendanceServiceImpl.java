package com.attendence.employee.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendence.employee.entity.Attendance;
import com.attendence.employee.repository.AttendanceRepository;
import com.attendence.employee.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public Attendance clockIn(Long employeeId) {
        Attendance attendance = new Attendance();
        attendance.setEmployeeId(employeeId);
        attendance.setInTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance clockOut(Long employeeId) {
        Attendance attendance = attendanceRepository.findFirstByEmployeeIdOrderByInTimeDesc(employeeId);
        attendance.setOutTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAttendanceRecords(Long employeeId) {
        return attendanceRepository.findAllByEmployeeIdOrderByInTimeDesc(employeeId);
    }
}