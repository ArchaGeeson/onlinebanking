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
import com.solvd.onlinebanking.api.albums.DeleteAlbumsMethod;
import com.solvd.onlinebanking.api.albums.GetAlbumsMethod;
import com.solvd.onlinebanking.api.albums.PostAlbumsMethod;
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestAlbum extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestAlbum.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetAlbum() {
		GetAlbumsMethod getAlbumMethod = new GetAlbumsMethod();
		getAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getAlbumMethod.callAPI();
		getAlbumMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getAlbumMethod.validateResponseAgainstSchema("api/albums/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreateAlbum() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostAlbumsMethod postAlbumMethod  = new PostAlbumsMethod();
		postAlbumMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postAlbumMethod.callAPI();
		postAlbumMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeleteAlbum() {
		DeleteAlbumsMethod deleteAlbumMethod = new DeleteAlbumsMethod();
		deleteAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteAlbumMethod.callAPI();
		deleteAlbumMethod.validateResponse();
	}
}
