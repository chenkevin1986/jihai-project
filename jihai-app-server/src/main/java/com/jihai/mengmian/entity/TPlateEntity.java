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
@Table(name = "t_plate")
public class TPlateEntity {


    @Id
    @Column(name="Fplate_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer plateId;


    @Column(name="Fplate_name",columnDefinition = "varchar(20) NOT NULL COMMENT ''")
    private String plateName;


    @Column(name="Fplate_description",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String plateDescription;


    @Column(name="Fplate_logo_path",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String plateLogoPath;


    @Column(name="Fplate_admins",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String plateAdmins;


    @Column(name="Fdelete_flag",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer deleteFlag;


    @Column(name="Forder",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer order;


    @Column(name="Fpage_view",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer pageView;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}