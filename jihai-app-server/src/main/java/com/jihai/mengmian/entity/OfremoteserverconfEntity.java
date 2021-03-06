package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofremoteserverconf")
public class OfremoteserverconfEntity {


    @Id
    @Column(name="xmppDomain",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String xmppDomain;


    @Column(name="remotePort",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer remotePort;


    @Column(name="permission",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String permission;


}