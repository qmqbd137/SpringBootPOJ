package com.qmq.springbootpoj.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.springframework.data.relational.core.mapping.Column;

//若不指定则默认为实体类名（驼峰映射规则）去寻找，数据库的表名也需确定是否设置为大小写不敏感
@TableName(value = "MS_User")
//与builder注解一起使用则会发生错误
@Data
public class User {
	@TableId
	@Column(value = "userId")
	private long userId;

	@Column(value = "userAccount")
	private String userAccount;

	@Column(value = "userPwd")
	private String userPwd;

	@Column(value = "firstName")
	private String firstName;

	@Column(value = "lastName")
	private String lastName;

	@Column(value = "gender")
	private int gender;

	@Column(value = "eMail")
	private String eMail;

	@Column(value = "selfIntroduction")
	private String selfIntroduction;

	@Column(value = "isOnline")
	private boolean isOnline;

	@Column(value = "isDelete")
	private boolean isDelete;

}
