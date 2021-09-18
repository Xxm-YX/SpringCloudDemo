package icu.sgwxm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author binggoling
 * @since 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table1")
public class Table1Entity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String test1;

    private String test2;

    private String test3;

    private String test4;

    private Integer test5;


}
