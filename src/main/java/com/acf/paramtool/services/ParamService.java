package com.acf.paramtool.services;

import com.acf.paramtool.enums.ParamFormat;
import com.acf.paramtool.models.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ParamService {
    @Bean
    public int run () {
        Param<ParamFormat> param = new Param<>(ParamFormat.class);
        return param.getParam("影像");
    }

}
