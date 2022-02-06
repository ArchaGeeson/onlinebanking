package com.solvd.onlinebanking.api.todo;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostTodoMethod extends AbstractApiMethodV2{
	public PostTodoMethod() {
        super("api/todo/post/rq.json", "api/todo/post/rs.json", "api/todo/todo.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
