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
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestUser extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestUser.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetUser() {
		GetUserMethod getUserMethod = new GetUserMethod();
		getUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getUserMethod.callAPI();
		getUserMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getUserMethod.validateResponseAgainstSchema("api/users/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreateUser() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostUserMethod postUserMethod = new PostUserMethod();
		postUserMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postUserMethod.callAPI();
		postUserMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeleteUser() {
		DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
		deleteUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteUserMethod.callAPI();
		deleteUserMethod.validateResponse();
	}
}
