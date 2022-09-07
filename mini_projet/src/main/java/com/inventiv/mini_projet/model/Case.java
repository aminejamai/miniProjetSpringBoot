package com.inventiv.mini_projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity(name = "Case2")
@NoArgsConstructor
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long caseId;
    private Date creationDate;
    private Date lastUpdateDate;
    private String title;
    private String description;
}
