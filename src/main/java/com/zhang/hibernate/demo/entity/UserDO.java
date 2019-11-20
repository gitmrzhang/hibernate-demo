package com.zhang.hibernate.demo.entity;

import lombok.Data;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户表实体
 *
 * @author zgj
 * @version 2018-08-29 9:44
 * @since 1.0.0
 */
@Entity
@Table(name = "user_test")
@Data
public class UserDO {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(length = 50, unique = true)
    private String name;
    @Column(name = "sex")
    private byte sex;
    @Column(name = "score")
    private Integer score;
    @Column
    private Date createTime;
    @Column
    private Date modifyTime;

}
