package com.solvd.onlinebanking.api.todo;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteTodoMethod extends AbstractApiMethodV2 {
	public DeleteTodoMethod() {
        super("api/todo/delete/rq.json", "api/todo/delete/rs.json", "api/todo/todo.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
