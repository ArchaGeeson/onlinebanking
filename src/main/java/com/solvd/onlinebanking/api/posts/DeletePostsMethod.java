package com.solvd.onlinebanking.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePostsMethod extends AbstractApiMethodV2 {
	public DeletePostsMethod() {
        super("api/posts/delete/rq.json", "api/posts/delete/rs.json", "api/posts/posts.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
