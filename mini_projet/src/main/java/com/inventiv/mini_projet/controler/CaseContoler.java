package com.inventiv.mini_projet.controler;

import com.inventiv.mini_projet.model.Case;
import com.inventiv.mini_projet.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cases")
public class CaseContoler {

    @Autowired
    private CaseService caseService;

    @GetMapping("/{id}")
    @ResponseBody
    public Case getCaseByID(@PathVariable long id){
        return caseService.findCaseByID(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Case> updateCase(@PathVariable long id,@RequestBody Case newCase){
        return caseService.updateCase(id, newCase);
    }

    @PostMapping
    public Case createCase(@RequestBody Case newCase){
        return caseService.createCase(newCase);
    }

    @DeleteMapping("/{id}")
    public void deleteCase(@PathVariable long id){
        caseService.deleteCase(id);
    }
}
