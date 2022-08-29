package com.example.domain;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String surname;
    private String firstname;
    private String password;
    private String email;
    private String Major;
    private String Minor;
    private String Skills;
    private String selfIntroduction;

}
