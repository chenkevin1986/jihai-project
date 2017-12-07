package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tallocid_bysect")
public class TallocidBysectEntity {


    @Id
    @Column(name="Fsect",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer sect;


    @Column(name="Fid",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long id;


    @Column(name="Falloc_size",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer allocSize;


    @Column(name="Fdesc",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String desc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}