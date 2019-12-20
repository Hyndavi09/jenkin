package com.mindtree.tickettrackingsystem.service;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.tickettrackingsystem.entity.CampusMind;
import com.mindtree.tickettrackingsystem.entity.Genie;
@Service
public interface TicketTrackingSystemService {
public String addCampusMind(CampusMind cminds);
public Genie raiseGenie(String mid,Genie genie);
public List<Genie> displayTrueGenie(String mid,Genie genie);
public String changeStatus(String mid);
}
