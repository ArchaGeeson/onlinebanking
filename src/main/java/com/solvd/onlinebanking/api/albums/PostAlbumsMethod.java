package com.solvd.onlinebanking.api.albums;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostAlbumsMethod extends AbstractApiMethodV2{
	public PostAlbumsMethod() {
        super("api/albums/post/rq.json", "api/albums/post/rs.json", "api/albums/albums.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}