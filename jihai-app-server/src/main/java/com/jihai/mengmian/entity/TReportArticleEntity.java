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
@Table(name = "t_report_article")
public class TReportArticleEntity {


    @Id
    @Column(name="Freport_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer reportId;


    @Column(name="Farticle_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long articleId;


    @Column(name="Fcomment_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long commentId;


    @Column(name="Fplate_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer plateId;


    @Column(name="Fauthor_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long authorUserId;


    @Column(name="Fcomment_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long commentUserId;


    @Column(name="Freporter_user_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long reporterUserId;


    @Column(name="Freport_content",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String reportContent;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}