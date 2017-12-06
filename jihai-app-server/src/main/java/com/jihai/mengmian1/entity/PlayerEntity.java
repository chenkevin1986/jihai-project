package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b>玩家表 ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "player")
public class PlayerEntity {


    @Id
    @Column(columnDefinition = "varchar(255) NOT NULL COMMENT '玩家id'")
    private String playerId;


    @Column(columnDefinition = "varchar(255) NOT NULL COMMENT '玩家名称'")
    private String playerName;


    @Column(columnDefinition = "bigint(20) NOT NULL COMMENT '角色id'")
    private Long roleId;


}