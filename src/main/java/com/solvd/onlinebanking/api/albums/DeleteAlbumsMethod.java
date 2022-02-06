package com.solvd.onlinebanking.api.albums;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteAlbumsMethod extends AbstractApiMethodV2 {
	public DeleteAlbumsMethod() {
        super("api/albums/delete/rq.json", "api/albums/delete/rs.json", "api/albums/albums.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
