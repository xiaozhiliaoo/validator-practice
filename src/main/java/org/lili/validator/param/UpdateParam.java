package org.lili.validator.param;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author lili
 * @date 2021/9/3 18:02
 */
public class UpdateParam {
    @NotBlank(message = "姓名不能为空")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}