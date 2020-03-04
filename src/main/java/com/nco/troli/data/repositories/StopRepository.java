package com.nco.troli.data.repositories;

import com.nco.troli.data.models.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StopRepository extends JpaRepository<Stop, UUID> {
}
