package com.solvd.onlinebanking.api.comments;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteCommentsMethod extends AbstractApiMethodV2 {
	public DeleteCommentsMethod() {
        super("api/comments/delete/rq.json", "api/comments/delete/rs.json", "api/comments/comments.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
