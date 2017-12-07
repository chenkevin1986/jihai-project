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
@Table(name = "tsoftware_detail")
public class TsoftwareDetailEntity {


    @Id
    @Column(name="fsoftware_id",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fsoftwareId;


    @Column(name="fbundle_identifier",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String fbundleIdentifier;


    @Column(name="fname",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String fname;


    @Column(name="fversion",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String fversion;


    @Column(name="fplatform_id",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String fplatformId;


    @Column(name="fproject_id",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fprojectId;


    @Column(name="furl",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String furl;


    @Column(name="fremark",columnDefinition = "text NOT NULL COMMENT ''")
    private String fremark;


    @Column(name="fin_use",columnDefinition = "tinyint(1) NOT NULL COMMENT ''")
    private Integer finUse;


    @Column(name="fin_maintain",columnDefinition = "tinyint(1) NOT NULL COMMENT ''")
    private Integer finMaintain;


    @Column(name="frelease_notes",columnDefinition = "text NOT NULL COMMENT ''")
    private String freleaseNotes;


    @Column(name="fexist_related_file",columnDefinition = "tinyint(1) NOT NULL COMMENT ''")
    private Integer fexistRelatedFile;


    @Column(name="frelated_file_format",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String frelatedFileFormat;


    @Column(name="fcreate_timestamp",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fcreateTimestamp;


    @Column(name="fmodify_timestamp",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer fmodifyTimestamp;


}