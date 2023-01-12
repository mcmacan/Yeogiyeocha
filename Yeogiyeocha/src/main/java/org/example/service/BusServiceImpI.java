package org.example.service;

import org.example.domain.Bus;
import org.example.repository.BusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpI implements BusService{
    private BusMapper busMapper;
    @Autowired
    public BusServiceImpI(BusMapper busMapper){
        this.busMapper = busMapper;
    }
    @Override
    public List getBusinfo(long busid) {
        return busMapper.getBusByid(busid);
    }
    @Override
    public Long getBusnumber(long busid) {
        return busMapper.getBusCount(busid);
    }
}
