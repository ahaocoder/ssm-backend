package com.example.granary.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("thermometer")
public class Thermometer {
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("temp") //温度
    private Double temp;

    @TableField("seat")
    private String seat;
}
