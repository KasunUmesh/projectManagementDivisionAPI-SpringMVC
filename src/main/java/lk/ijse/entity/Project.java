package lk.ijse.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Project implements SuperEntity{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid")
    private UUID projectId;
    @Column(nullable = false)
    private String projectName;
    @Column(nullable = false)
    private String projectDeadline;
    @Column(nullable = false)
    private String projectStatus;

    @ManyToOne
    @JoinColumn(name = "tlId", referencedColumnName = "tlId")
    private TL tl;
}
