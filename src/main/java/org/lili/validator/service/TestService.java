package org.lili.validator.service;

import org.lili.validator.param.UpdateParam;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;

/**
 * @author lili
 * @date 2021/9/3 20:12
 */
@Service
public class TestService {

    public String checkParams(@NotBlank String updateParam) {
        return "checkDone";
    }
}