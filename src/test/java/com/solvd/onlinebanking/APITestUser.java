package com.solvd.onlinebanking;

import java.lang.invoke.MethodHandles;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.onlinebanking.api.GetUserMethod;

public class APITestUser extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Test()
    @MethodOwner(owner = "archa")
    public void testGetUsers() {
        GetUserMethod getUsersMethod = new GetUserMethod();
        getUsersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUsersMethod.callAPI();
        getUsersMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethod.validateResponseAgainstSchema("api/users/get/rs.schema");
    }
}
