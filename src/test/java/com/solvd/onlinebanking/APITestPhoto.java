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
import com.solvd.onlinebanking.api.photos.DeletePhotosMethod;
import com.solvd.onlinebanking.api.photos.GetPhotosMethod;
import com.solvd.onlinebanking.api.photos.PostPhotosMethod;
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestPhoto extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestPhoto.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetPhoto() {
		GetPhotosMethod getPhotosMethod = new GetPhotosMethod();
		getPhotosMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPhotosMethod.callAPI();
		getPhotosMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getPhotosMethod.validateResponseAgainstSchema("api/photos/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreatePhoto() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostPhotosMethod postPhotosMethod = new PostPhotosMethod();
		postPhotosMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postPhotosMethod.callAPI();
		postPhotosMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeletePhoto() {
		DeletePhotosMethod deletePhotosMethod = new DeletePhotosMethod();
		deletePhotosMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deletePhotosMethod.callAPI();
		deletePhotosMethod.validateResponse();
	}
}
