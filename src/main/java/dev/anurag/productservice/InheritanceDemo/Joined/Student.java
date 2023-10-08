package dev.anurag.productservice.InheritanceDemo.Joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_student")
@PrimaryKeyJoinColumn(name="user_id")
public class Student extends User {
    private  double psp;
    private  double attendance;
}
