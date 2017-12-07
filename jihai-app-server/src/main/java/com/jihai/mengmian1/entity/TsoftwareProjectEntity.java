package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tsoftware_project")
public class TsoftwareProjectEntity {


    @Id
    @Column(name="fproject_id",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fprojectId;


    @Column(name="fname",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String fname;


    @Column(name="fremark",columnDefinition = "text NOT NULL COMMENT ''")
    private String fremark;


    @Column(name="fcreate_timestamp",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fcreateTimestamp;


}