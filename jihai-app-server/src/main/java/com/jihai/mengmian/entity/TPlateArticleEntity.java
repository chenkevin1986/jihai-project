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
@Table(name = "t_plate_article")
public class TPlateArticleEntity {


    @Id
    @Column(name="Fplate_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer plateId;


    @Id
    @Column(name="Farticle_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long articleId;


    @Column(name="Farticle_title",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String articleTitle;


    @Column(name="Fref_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer refId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Fauthor_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long authorUserId;


    @Column(name="Fdelete_flag",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer deleteFlag;


}