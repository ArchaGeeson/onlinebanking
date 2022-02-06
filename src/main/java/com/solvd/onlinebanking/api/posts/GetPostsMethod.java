package com.solvd.onlinebanking.api.posts;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetPostsMethod extends AbstractApiMethodV2{
	public GetPostsMethod() {
        super(null, "api/posts/get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
