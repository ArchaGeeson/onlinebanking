package com.solvd.onlinebanking.services.interfaces;

import com.solvd.onlinebanking.models.Account;

public interface IAccountServcie {
	Account getAccountByAccountId(long id);
}
