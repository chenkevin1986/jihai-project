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
@Table(name = "t_package_statics")
public class TPackageStaticsEntity {


    @Id
    @Column(name="Fstatic_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer staticId;


    @Column(name="Fstatic_date_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer staticDateTimestamp;


    @Column(name="Fpackage_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String packageName;


    @Column(name="Fpackage_count",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer packageCount;


    @Column(name="Fstatic_total",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer staticTotal;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Fbegin_date_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer beginDateTimestamp;


    @Column(name="Fend_date_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer endDateTimestamp;


}