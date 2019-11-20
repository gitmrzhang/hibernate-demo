package com.zhang.hibernate.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zgj
 * @version 2018-08-29 15:59
 * @since 1.0.0
 */
@Entity
@Table(name = "score")
@Data
public class Score {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(length = 50, unique = true)
    private String name;
    @Column(length = 50)
    private String teacherName;
    @Column
    private Date createTime;
    @Column
    private Date modifyTime;
}
