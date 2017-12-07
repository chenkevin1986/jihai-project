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
@Table(name = "t_db_update_log")
public class TDbUpdateLogEntity {


    @Id
    @Column(name="Fdb_update_log_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer dbUpdateLogId;


    @Column(name="Fupdate_from",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String updateFrom;


    @Column(name="Fupdate_user",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String updateUser;


    @Column(name="Fdb_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String dbName;


    @Column(name="Ftable_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String tableName;


    @Column(name="Frow_key",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer rowKey;


    @Column(name="Fbefore_value",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String beforeValue;


    @Column(name="Fafter_value",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String afterValue;


    @Column(name="Fstatus",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Freason",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String reason;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}