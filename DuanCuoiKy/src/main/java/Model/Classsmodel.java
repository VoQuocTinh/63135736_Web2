package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "classes")
public class Classsmodel {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "class_name")
 private String className;

 @Column(name = "teacher")
 private String teacher;

 @Column(name = "room")
 private String room;

 // Getters and Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getClassName() {
     return className;
 }

 public void setClassName(String className) {
     this.className = className;
 }

 public String getTeacher() {
     return teacher;
 }

 public void setTeacher(String teacher) {
     this.teacher = teacher;
 }

 public String getRoom() {
     return room;
 }

 public void setRoom(String room) {
     this.room = room;
 }
}
