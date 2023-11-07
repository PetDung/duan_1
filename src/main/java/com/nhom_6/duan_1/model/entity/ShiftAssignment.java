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
@Table(name="ShiftAssignment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShiftAssignment extends BaseEntity {

    @Column
    private Date createAt;
    @Column
    private Date endAt;
    @Column
    private String description;
    @Column
    private String status;
    @Column
    private double startingAmount;
    @Column
    private double finalAmount;

    @OneToMany
    @JoinColumn(name="workSchedule_id")
    @JsonBackReference
    private List<WorkSchedule> workSchedules;

    @OneToMany
    @JoinColumn(name="user_id")
    @JsonBackReference
    private List<User> users;
}
