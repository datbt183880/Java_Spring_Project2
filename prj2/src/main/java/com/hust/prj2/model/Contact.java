package com.hust.prj2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class Contact implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private Date dob;
    private int age;
    private String email;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    public Contact(){
        id=0;
    }
    public Contact(int id,String name, int age, Date dob, String email) {
        this.id =id;
        this.name =name;
        this.age =age;
        this.dob =dob;
        this.email =email;
    }
}
