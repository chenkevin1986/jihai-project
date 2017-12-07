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
@Table(name = "t_verify_article")
public class TVerifyArticleEntity {


    @Column(name="Farticle_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long articleUserId;


    @Column(name="Farticle_title",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String articleTitle;


    @Column(name="Fuser_nick_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userNickName;


    @Id
    @Column(name="Farticle_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long articleId;


    @Column(name="Ftype",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer type;


    @Id
    @Column(name="Fplate_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer plateId;


    @Column(name="Fplate_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String plateName;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}