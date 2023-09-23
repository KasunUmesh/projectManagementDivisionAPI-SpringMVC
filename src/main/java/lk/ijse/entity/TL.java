package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TL implements SuperEntity{
    @Id
    private UUID tlId;
    @Column(nullable = false)
    private String tlName;
    @Column(nullable = false)
    private String tlEmail;

    @OneToMany(mappedBy = "tl",cascade = CascadeType.DETACH)
    private List<Project> projects;
}
