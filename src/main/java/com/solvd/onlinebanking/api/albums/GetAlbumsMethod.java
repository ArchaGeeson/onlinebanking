package com.solvd.onlinebanking.api.albums;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetAlbumsMethod extends AbstractApiMethodV2{
	public GetAlbumsMethod() {
        super(null, "api/albums/get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
