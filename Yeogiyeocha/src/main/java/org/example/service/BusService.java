package org.example.service;

import org.example.domain.Bus;

import java.util.List;

public interface BusService{
    List getBusinfo(long busid);

    Long getBusnumber(long id);
}
