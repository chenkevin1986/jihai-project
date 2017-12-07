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
@Table(name = "ttask_queue")
public class TtaskQueueEntity {


    @Id
    @Column(name="Ftask_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer taskId;


    @Column(name="Ftask_type",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer taskType;


    @Column(name="Fqueue_message",columnDefinition = "text NOT NULL COMMENT ''")
    private String queueMessage;


    @Column(name="Fsource",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String source;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flast_modify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastModifyTimestamp;


}