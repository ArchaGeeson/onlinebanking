package com.solvd.onlinebanking.api.comments;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetCommentsMethod extends AbstractApiMethodV2{
	public GetCommentsMethod() {
        super(null, "api/comments/get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}