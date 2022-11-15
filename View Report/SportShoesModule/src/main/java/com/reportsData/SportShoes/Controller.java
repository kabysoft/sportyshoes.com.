package com.reportsData.SportShoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	ReportService reportservice;
	
	@GetMapping(path ="getdata" )
	List<ReportModel> getReport(){
		return reportservice.findAll();
	
	
		
	}
}
