package com.attendence.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attendence.employee.entity.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

	Attendance findFirstByEmployeeIdOrderByInTimeDesc(Long employeeId);

	List<Attendance> findAllByEmployeeIdOrderByInTimeDesc(Long employeeId);

}
