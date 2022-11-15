package com.sportShoes.SportShoesLogin.service;

import com.sportShoes.SportShoesLogin.model.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

}