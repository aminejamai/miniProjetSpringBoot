package com.inventiv.mini_projet.service;

import com.inventiv.mini_projet.model.Case;
import com.inventiv.mini_projet.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    public Case findCaseByID(long id){
        return caseRepository.findByCaseId(id);
    }

    public ResponseEntity<Case> updateCase(long id, Case newCase){
        Case oldCase = this.findCaseByID(id);

        Date date = new Date(new java.util.Date().getTime());

        if (oldCase != null){
            oldCase.setLastUpdateDate(date);
            oldCase.setTitle(newCase.getTitle());
            oldCase.setDescription(newCase.getDescription());

            caseRepository.save(oldCase);
        }
        return ResponseEntity.ok(oldCase);
    }

    public Case createCase(Case newCase) {
        Date date = new Date(new java.util.Date().getTime());
        newCase.setCreationDate(date);
        newCase.setLastUpdateDate(date);

        return caseRepository.save(newCase);
    }

    public void deleteCase(long id) {
        caseRepository.delete(findCaseByID(id));

        if (findCaseByID(id) == null) {
            System.out.println("Case "+id+" deleted");
        }
    }
}
