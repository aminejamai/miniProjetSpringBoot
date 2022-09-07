package com.inventiv.mini_projet.repository;

import com.inventiv.mini_projet.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
    Case findByCaseId(long id);
}
