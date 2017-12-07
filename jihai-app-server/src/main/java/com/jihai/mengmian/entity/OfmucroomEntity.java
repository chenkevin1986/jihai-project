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
@Table(name = "ofmucroom")
public class OfmucroomEntity {


    @Id
    @Column(name="serviceID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long serviceID;


    @Column(name="roomID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long roomID;


    @Column(name="creationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String creationDate;


    @Column(name="modificationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String modificationDate;


    @Id
    @Column(name="name",columnDefinition = "varchar(50) NOT NULL COMMENT ''")
    private String name;


    @Column(name="naturalName",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String naturalName;


    @Column(name="description",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String description;


    @Column(name="lockedDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String lockedDate;


    @Column(name="emptyDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String emptyDate;


    @Column(name="canChangeSubject",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer canChangeSubject;


    @Column(name="maxUsers",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer maxUsers;


    @Column(name="publicRoom",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer publicRoom;


    @Column(name="moderated",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer moderated;


    @Column(name="membersOnly",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer membersOnly;


    @Column(name="canInvite",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer canInvite;


    @Column(name="roomPassword",columnDefinition = "varchar(50) NOT NULL COMMENT ''")
    private String roomPassword;


    @Column(name="canDiscoverJID",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer canDiscoverJID;


    @Column(name="logEnabled",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer logEnabled;


    @Column(name="subject",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String subject;


    @Column(name="rolesToBroadcast",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer rolesToBroadcast;


    @Column(name="useReservedNick",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer useReservedNick;


    @Column(name="canChangeNick",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer canChangeNick;


    @Column(name="canRegister",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer canRegister;


}