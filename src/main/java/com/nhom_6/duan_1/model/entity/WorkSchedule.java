package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="WorkSchedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkSchedule extends BaseEntity{
    @Column
    private String nameWorkSchedule;
    @Column
    private Date createAt;
    @Column
    private Date endAt;
    @Column
    private String description;
    @Column
    private String status;

    @OneToMany(mappedBy = "workSchedules")
    private List<ShiftAssignment> shiftAssignment;
}
