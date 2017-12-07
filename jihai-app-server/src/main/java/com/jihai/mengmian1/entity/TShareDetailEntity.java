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
@Table(name = "t_share_detail")
public class TShareDetailEntity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Id
    @Column(name="Fshare_user_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer shareUserId;


    @Column(name="Fapp_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer appId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flast_modify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastModifyTimestamp;


}