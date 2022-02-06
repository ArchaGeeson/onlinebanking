package com.solvd.onlinebanking;

import org.apache.logging.log4j.LogManager;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.onlinebanking.api.comments.DeleteCommentsMethod;
import com.solvd.onlinebanking.api.comments.GetCommentsMethod;
import com.solvd.onlinebanking.api.comments.PostCommentsMethod;
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestComment extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestComment.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetComment() {
		GetCommentsMethod getCommentMethod = new GetCommentsMethod();
		getCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getCommentMethod.callAPI();
		getCommentMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getCommentMethod.validateResponseAgainstSchema("api/comments/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreateComment() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostCommentsMethod postCommentMethod = new PostCommentsMethod();
		postCommentMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postCommentMethod.callAPI();
		postCommentMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeleteComment() {
		DeleteCommentsMethod deleteCommentsMethod = new DeleteCommentsMethod();
		deleteCommentsMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteCommentsMethod.callAPI();
		deleteCommentsMethod.validateResponse();
	}
}
