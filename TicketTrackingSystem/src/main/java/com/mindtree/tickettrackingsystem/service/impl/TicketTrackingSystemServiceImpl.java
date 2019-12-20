package com.mindtree.tickettrackingsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.tickettrackingsystem.entity.CampusMind;
import com.mindtree.tickettrackingsystem.entity.Genie;
import com.mindtree.tickettrackingsystem.repository.TicketTrackingSystemCampusMindRepository;
import com.mindtree.tickettrackingsystem.repository.TicketTrackingSystemGenieRepository;
import com.mindtree.tickettrackingsystem.service.TicketTrackingSystemService;
@Service
public class TicketTrackingSystemServiceImpl implements TicketTrackingSystemService{
	@Autowired 
	TicketTrackingSystemCampusMindRepository repository;
	
@Autowired
TicketTrackingSystemGenieRepository genirepositoryObject;
	
	@Override
	public String addCampusMind(CampusMind cminds) {
		
		repository.save(cminds);
		return "added Successfully";
	}

	@Override
	public Genie raiseGenie(String mid,Genie genie) {
		CampusMind cmind=repository.getOne(mid);
		genie.setCminds(cmind);
		return genirepositoryObject.save(genie);
	}

	@Override
	public List<Genie> displayTrueGenie(String mid,Genie genie) {
		List<Genie> list=new ArrayList<Genie>();
		List<Genie> genies=repository.getOne(mid).getGenie();
		for(Genie g:genies)
		{
			if(g.isGenieStatus())
			{
//				Genie gene=new Genie();
//				gene.setGenieId(g.getGenieId());
//				gene.setGenieDescription(g.getGenieDescription());
//				gene.setGenieStatus(g.isGenieStatus());
				list.add(g);
			}
		}
		return list;
	}

	@Override
	public String changeStatus(String mid) {
		Genie genie=genirepositoryObject.findById(mid).get();
		if(genie.isGenieStatus())
		{
			genie.setGenieStatus(false);
		}
		else
		{
			genie.setGenieStatus(true);
		}
		genirepositoryObject.save(genie);
		return "Changed succesfully";
	}

}
