package com.solvd.onlinebanking.api.users;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteUserMethod extends AbstractApiMethodV2 {

    public DeleteUserMethod() {
        super("api/users/_delete/rq.json", "api/users/_delete/rs.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}