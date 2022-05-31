package com.example.mindex.service;

import com.example.mindex.data.Compensation;

public interface CompensationService {
    Compensation create(Compensation compensation);
    Compensation read(String employeeId);
    Compensation update(Compensation compensation);
}
