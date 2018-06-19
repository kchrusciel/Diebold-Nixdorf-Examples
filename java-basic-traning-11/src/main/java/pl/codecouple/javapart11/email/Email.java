package pl.codecouple.javapart11.email;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Email {

    @Id
    @GeneratedValue
    private long id;
    private String title;

}
