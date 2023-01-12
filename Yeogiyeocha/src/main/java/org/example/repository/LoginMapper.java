package org.example.repository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    String getUserpw(Long id);
}
