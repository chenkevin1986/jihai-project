package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofroster")
public class OfrosterEntity {


    @Id
    @Column(name="rosterID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long rosterID;


    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Column(name="jid",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String jid;


    @Column(name="sub",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer sub;


    @Column(name="ask",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer ask;


    @Column(name="recv",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer recv;


    @Column(name="nick",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String nick;


}