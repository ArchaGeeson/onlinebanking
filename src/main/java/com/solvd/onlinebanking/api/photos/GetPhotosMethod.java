package com.solvd.onlinebanking.api.photos;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetPhotosMethod extends AbstractApiMethodV2{
	public GetPhotosMethod() {
        super(null, "api/photos/get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
