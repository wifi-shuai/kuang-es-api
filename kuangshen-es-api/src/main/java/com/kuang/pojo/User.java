package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * ClassName:User
 * Package:com.kuang.pojo
 * Description:
 *
 * @Date:2020/11/15 20:45
 * @Author:liangshuai@shuaige.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private String name;
    private int age;
}
