package com.example.mindex.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.mindex.data.Employee;
import com.example.mindex.data.ReportingStructure;
import com.example.mindex.service.ReportingStructureService;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Override
    public ReportingStructure create(Employee employee) {
        LOG.debug("Creating reporting structure for employee [{}]", employee);
        return new ReportingStructure(employee);
    }
}