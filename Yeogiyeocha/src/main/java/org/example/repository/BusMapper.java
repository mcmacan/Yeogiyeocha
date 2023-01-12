package org.example.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BusMapper {
    List getBusByid(long busid);

    Long getBusCount(long id);
}
