package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MobileData;
import com.example.demo.repository.MobileRepository;

@Service
public class MobileImpl implements Mobile{

	@Autowired
	private MobileRepository mr;
	
	@Override
	public List<MobileData> details() {
		// TODO Auto-generated method stub
		return mr.findAll();
		
	}

}
