package org.onetwo.cloud.ms.consumer.vo;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.validator.constraints.NotBlank;

@Data
@EqualsAndHashCode
public class AdminUser {
	
    private Long id;
	
    private String userName;


	@NotBlank
    private String password;

    private String email;

    private String mobile;

    private String gender;

    private String status;

    private Date birthday;

    private Date createAt;

    private Date updateAt;

    private String appCode;
    
}