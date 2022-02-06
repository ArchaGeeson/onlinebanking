package com.solvd.onlinebanking.api.photos;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostPhotosMethod extends AbstractApiMethodV2{
	public PostPhotosMethod() {
        super("api/photos/post/rq.json", "api/photos/post/rs.json", "api/photos/photos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}