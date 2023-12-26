package com.human.model;

import java.util.ArrayList;
import com.human.dto.UserDto;

public interface UserService {
	
	public void userInsert(UserDto dto) throws Exception;
	public void userUpdate(UserDto dto) throws Exception;
	public void userDelete(String username) throws Exception;
	public ArrayList<UserDto> userSelectAll() throws Exception;
	public UserDto userSelectName(String username) throws Exception;
}
