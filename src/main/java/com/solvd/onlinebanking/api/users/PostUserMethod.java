package com.solvd.onlinebanking.api.users;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserMethod extends AbstractApiMethodV2 {
    public PostUserMethod() {
        super("api/users/post/rq.json", "api/users/post/rs.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
