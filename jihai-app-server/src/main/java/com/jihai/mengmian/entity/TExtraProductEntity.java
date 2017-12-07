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
@Table(name = "t_extra_product")
public class TExtraProductEntity {


    @Id
    @Column(name="Fproduct_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productId;


    @Column(name="Fiap_rate",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer iapRate;


    @Column(name="Falipay_rate",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer alipayRate;


    @Column(name="Fweixin_pay_rate",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer weixinPayRate;


}