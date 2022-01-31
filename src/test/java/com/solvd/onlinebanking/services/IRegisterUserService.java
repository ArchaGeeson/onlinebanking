package com.solvd.onlinebanking.services;

import com.solvd.onlinebanking.models.User;

public interface IRegisterUserService {
	default User registerUser(User user) {
		return null;
	}
}
