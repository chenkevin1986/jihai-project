package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tdal_set_table")
public class TdalSetTableEntity {


    @Id
    @Column(name="Ftable_prefix_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String tablePrefixName;


    @Column(name="Ftable_slice_num",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer tableSliceNum;


    @Column(name="Ftable_fill_zero",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer tableFillZero;


    @Column(name="Ftable_desc",columnDefinition = "varchar(512) NOT NULL COMMENT ''")
    private String tableDesc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}