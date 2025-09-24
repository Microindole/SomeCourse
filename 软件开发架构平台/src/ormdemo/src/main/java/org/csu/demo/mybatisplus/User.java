package org.csu.demo.mybatisplus;


//使用lombok简化步骤

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@TableName("userinfo")
public class User {


    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isAdmin;

}
