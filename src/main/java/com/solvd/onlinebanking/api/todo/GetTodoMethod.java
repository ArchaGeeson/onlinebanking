package com.solvd.onlinebanking.api.todo;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetTodoMethod extends AbstractApiMethodV2{
	public GetTodoMethod() {
        super(null, "api/todo/get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
