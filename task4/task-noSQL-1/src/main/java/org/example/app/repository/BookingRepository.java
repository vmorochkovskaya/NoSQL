package org.example.app.repository;

import org.example.app.entity.sql.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Ticket, Integer> {
    Ticket save(Ticket ticket);
}
