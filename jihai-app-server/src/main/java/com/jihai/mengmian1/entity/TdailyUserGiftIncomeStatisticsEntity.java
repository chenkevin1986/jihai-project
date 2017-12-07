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
@Table(name = "tdaily_user_gift_income_statistics")
public class TdailyUserGiftIncomeStatisticsEntity {


    @Id
    @Column(name="Fstat_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer statId;


    @Column(name="Fstat_begin_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer statBeginTimestamp;


    @Column(name="Fstat_end_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer statEndTimestamp;


    @Column(name="Fstat_fail_user_id_list",columnDefinition = "text NOT NULL COMMENT ''")
    private String statFailUserIdList;


    @Column(name="Ffail_num",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer failNum;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flast_modify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastModifyTimestamp;


}