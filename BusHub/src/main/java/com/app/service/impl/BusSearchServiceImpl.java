package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Bus;
import com.app.repository.BusRepository;
import com.app.service.BusSearchService;

@Service
public class BusSearchServiceImpl implements BusSearchService {

	@Autowired
	private BusRepository repository;

	@Override
	public List<Bus> getAllBuses() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Bus> getAllBusesByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Bus> getAllBusesBySource(String busSource) {
		// TODO Auto-generated method stub
		return repository.findBySource(busSource);
	}

	@Override
	public List<Bus> getAllBusesByDestination(String busDestination) {
		// TODO Auto-generated method stub
		return repository.findByDestination(busDestination);
	}

	@Override
	public List<Bus> getAllBusesByType(String busType) {
		// TODO Auto-generated method stub
		return repository.findByType(busType);
	}

}
