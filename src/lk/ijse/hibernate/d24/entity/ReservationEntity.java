package lk.ijse.hibernate.d24.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class ReservationEntity {
    @Id
    @Column(length = 20)
    String resId;
    Date date;
    @JoinColumn(name = "studentId", referencedColumnName = "studentId", nullable = false)
    @ManyToOne
    StudentEntity student;
    @JoinColumn(name = "roomTypeId", referencedColumnName = "roomTypeId", nullable = false)
    @ManyToOne
    RoomEntity room;
    String status;
}
