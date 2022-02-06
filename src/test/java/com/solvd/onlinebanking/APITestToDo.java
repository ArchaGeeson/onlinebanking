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
import com.solvd.onlinebanking.api.todo.DeleteTodoMethod;
import com.solvd.onlinebanking.api.todo.GetTodoMethod;
import com.solvd.onlinebanking.api.todo.PostTodoMethod;
import com.solvd.onlinebanking.api.users.DeleteUserMethod;
import com.solvd.onlinebanking.api.users.GetUserMethod;
import com.solvd.onlinebanking.api.users.PostUserMethod;

public class APITestToDo extends AbstractAPITest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(APITestToDo.class);

	@Test()
	@MethodOwner(owner = "archa")
	public void testGetTodo() {
		GetTodoMethod getTodoMethod = new GetTodoMethod();
		getTodoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getTodoMethod.callAPI();
		getTodoMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
		getTodoMethod.validateResponseAgainstSchema("api/todo/get/rs.schema");
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testCreateTodo() throws Exception {
		LOGGER.info("test");
		setCases("4555,54545");
		PostTodoMethod postTodoMethod = new PostTodoMethod();
		postTodoMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postTodoMethod.callAPI();
		postTodoMethod.validateResponse();
	}

	@Test()
	@MethodOwner(owner = "archa")
	public void testDeleteTodo() {
		DeleteTodoMethod deleteTodoMethod = new DeleteTodoMethod();
		deleteTodoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteTodoMethod.callAPI();
		deleteTodoMethod.validateResponse();
	}
}
