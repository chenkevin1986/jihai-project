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
@Table(name = "tdaily_user_gift_income_statistics_result")
public class TdailyUserGiftIncomeStatisticsResultEntity {


    @Id
    @Column(name="Fresult_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer resultId;


    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fincome",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer income;


    @Column(name="Fstat_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer statId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


}