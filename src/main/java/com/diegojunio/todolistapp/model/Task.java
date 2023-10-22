package com.diegojunio.todolistapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import org.hibernate.annotations.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@EnableJpaAuditing
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String taskTitle;

    @Column(nullable = false)
    private String taskDescription;

    @CreationTimestamp
    @Column(name = "task_created_at", nullable = false, updatable = false)
    private LocalDate taskCreatedAt;

    @Column(nullable = false)
    private LocalDate taskDeadLine;

    @UpdateTimestamp
    @Column(name = "task_updated_at")
    private LocalDate taskUpdatedAt;

    @Column(name = "completed")
    private Boolean taskCompleted;

    @Column(name = "deleted")
    private Boolean deleted;

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getTaskDeadLine() {
        return taskDeadLine;
    }

    public LocalDate getTaskUpdatedAt() {
        return taskUpdatedAt;
    }

    public Boolean getTaskCompleted() {
        return taskCompleted;
    }

    public Long getId() {
        return id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setTaskDeadLine(LocalDate taskDeadLine) {
        this.taskDeadLine = taskDeadLine;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTaskCreatedAt() {
        return taskCreatedAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", TaskCreatedAt=" + taskCreatedAt +
                ", taskDeadLine=" + taskDeadLine +
                ", taskUpdatedAt=" + taskUpdatedAt +
                ", taskCompleted=" + taskCompleted +
                ", deleted=" + deleted +
                '}';
    }

}
