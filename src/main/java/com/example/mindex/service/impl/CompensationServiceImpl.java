package com.example.mindex.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindex.dao.CompensationRepository;
import com.example.mindex.data.Compensation;
import com.example.mindex.service.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService {

    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;

    @Override
    public Compensation create(Compensation compensation) {
        LOG.debug("Creating compensation [{}]", compensation);
        compensationRepository.insert(compensation);
        return compensation;
    }

    @Override
    public Compensation read(String employeeId) {
        LOG.debug("Reading Compensation with for employee with ID [{}]", employeeId);
        
        Compensation compensation = compensationRepository.findByEmployeeId(employeeId);
        
        if (compensation == null) {
            throw new RuntimeException("Invalid employeeId: " + employeeId);
        }

        return compensation;
    }

    @Override
    public Compensation update(Compensation compensation) {
        LOG.debug("Updating employee [{}]", compensation);

        return compensationRepository.save(compensation);
    }
}
