package com.qmq.springbootpoj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author bdQmq
 * @since 2022-01-17
 */
@TableName("MS_User")
@ApiModel(value = "User对象", description = "用户信息表")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    private String userAccount;

    private String userPwd;

    private String firstName;

    private String lastName;

    private Integer gender;

    private String eMail;

    private String selfIntroduction;

    private Boolean isOnline;

    private Boolean isDelete;
}
