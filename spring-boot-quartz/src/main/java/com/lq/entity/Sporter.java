package com.lq.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lq on 2018/10/8.
 * 用户的持久化类
 */
@Data
@Entity
@GenericGenerator(name = "sporter-uuid", strategy = "uuid")
public class Sporter {


    /**
     * 自增的UUID
     */
    @Id
    @GeneratedValue(generator = "sporter-uuid")
    @Column(length = 32)
    private String sporterId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;


    /**
     * 一对多关系，另一张表的外键
     */
    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sporter_id")
    private List<Walks> walksList = new ArrayList<>();


    public Sporter() {

    }


    public Sporter(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public Sporter(String account, String password, String nickname, String avatar, List<Walks> walksList) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.walksList = walksList;
    }
}
