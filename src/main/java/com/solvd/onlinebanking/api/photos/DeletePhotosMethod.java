package com.solvd.onlinebanking.api.photos;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePhotosMethod extends AbstractApiMethodV2 {
	public DeletePhotosMethod() {
        super("api/photos/delete/rq.json", "api/photos/delete/rs.json", "api/photos/photos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
