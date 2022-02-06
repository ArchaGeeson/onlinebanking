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
import com.solvd.onlinebanking.api.posts.DeletePostsMethod;
import com.solvd.onlinebanking.api.posts.GetPostsMethod;
import com.solvd.onlinebanking.api.posts.PostPostsMethod;
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestPost extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestPost.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetPost() {
		GetPostsMethod getPostsMethod = new GetPostsMethod();
		getPostsMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPostsMethod.callAPI();
		getPostsMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getPostsMethod.validateResponseAgainstSchema("api/posts/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreatePost() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostPostsMethod postMethod = new PostPostsMethod();
		postMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postMethod.callAPI();
		postMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeletePost() {
		DeletePostsMethod deletePostMethod = new DeletePostsMethod();
		deletePostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deletePostMethod.callAPI();
		deletePostMethod.validateResponse();
	}
}
