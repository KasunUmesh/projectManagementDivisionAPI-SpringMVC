package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TechLead implements SuperEntity{

    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String profileIMG;
}
