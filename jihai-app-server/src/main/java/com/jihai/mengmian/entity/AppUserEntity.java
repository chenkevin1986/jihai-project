package com.jihai.mengmian.entity;



import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * Created by kevinchen on 2016/12/20.
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@Entity
@Table(name = "app_user_info")
public class AppUserEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String uid;
    @NonNull
    private String phone;
    @NonNull
    private String password;

}
