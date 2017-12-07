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
@Table(name = "t_stick")
public class TStickEntity {


    @Id
    @Column(name="Fplate_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer plateId;


    @Id
    @Column(name="Farticle_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long articleId;


    @Column(name="Farticle_title",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String articleTitle;


    @Column(name="Fstick_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer stickId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Fauthor_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long authorUserId;


}