package org.lili.validator.controller;

import org.lili.validator.param.UpdateParam;
import org.lili.validator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @author lili
 * @date 2021/9/3 17:56
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/updateData")
    public String updateData(@RequestBody @Valid UpdateParam updateParam) {
        return "done";
    }


    @GetMapping("/updateData2")
    public String updateData2(@RequestParam String updateParam) {
        return testService.checkParams(updateParam);
    }


}