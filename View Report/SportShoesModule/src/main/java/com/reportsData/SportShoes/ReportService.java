package com.reportsData.SportShoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportService extends JpaRepository<ReportModel,Integer> {
	
@Override
List<ReportModel> findAll();
}
