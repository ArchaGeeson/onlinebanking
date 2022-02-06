package com.solvd.onlinebanking.api.comments;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostCommentsMethod extends AbstractApiMethodV2{
	public PostCommentsMethod() {
        super("api/comments/post/rq.json", "api/comments/post/rs.json", "api/comments/comments.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
