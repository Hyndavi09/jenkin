package com.mindtree.tickettrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.tickettrackingsystem.entity.CampusMind;
import com.mindtree.tickettrackingsystem.entity.Genie;
import com.mindtree.tickettrackingsystem.service.TicketTrackingSystemService;

@RestController
public class TicketTrackingSystemController {
	@Autowired
	TicketTrackingSystemService service;

	@PostMapping(value = "/addcampus")
	public String addCampusMind(@RequestBody CampusMind cminds) {
		return service.addCampusMind(cminds);
	}
	@PostMapping(value = "/raiseGenie/{mid}")
	public String raiseGenie(@PathVariable(name="mid") String mid,@RequestBody Genie genie)	{
		
		service.raiseGenie(mid,genie);
		return "Genie raised succesfully";
		
	}
	@GetMapping(value="/getGenie/{mid}")
	public List<Genie> getGenie(@PathVariable(name="mid") String mid,@RequestBody Genie genie)
	{
		return service.displayTrueGenie(mid, genie);
		
	}
	@RequestMapping(value="/changeGenie/{gid}")
	public String changeStatus(@PathVariable(name="gid") String gid)
	{
		return service.changeStatus(gid);
		
	}
}
