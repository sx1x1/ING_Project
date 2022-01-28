package per.sxr.sxr.service.domain;

import lombok.Data;

import java.util.Date;

/**
 * 用户实体
 */
@Data
public class User {
    private Long userId;

    private String name;

    private String address;

    private Date createTime;

    private Date updateTime;

    private String operator;
}