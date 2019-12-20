package com.mindtree.tickettrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.tickettrackingsystem.entity.CampusMind;
@Repository
public interface TicketTrackingSystemCampusMindRepository extends JpaRepository<CampusMind, String>{

	
}
