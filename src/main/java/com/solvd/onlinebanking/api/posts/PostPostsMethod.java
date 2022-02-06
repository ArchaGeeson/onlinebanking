package com.solvd.onlinebanking.api.posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostPostsMethod extends AbstractApiMethodV2{
	public PostPostsMethod() {
        super("api/posts/post/rq.json", "api/posts/post/rs.json", "api/posts/posts.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
