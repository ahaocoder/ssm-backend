package com.example.granary.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hygrometer")
public class Hygrometer {
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("humidity")
    private String humidity;

    @TableField("seat")
    private String seat;
}
