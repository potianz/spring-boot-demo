package com.springboot.bean;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    @Id
    private Integer id;
    @Column
    private String name;
    //    角色
    @Column
    private String role;

}

