package com.nco.troli.data.repositories;

import com.nco.troli.data.models.Line;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LineRepository extends JpaRepository<Line, UUID> {
}
