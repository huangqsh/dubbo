package org.huangqsh.dubbo.service;

import org.huangqsh.dubbo.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public void add(UserEntity userEntity) {
		System.out.println("添加用户"+userEntity.getUserName());
	}

	@Override
	public void deleteById(Integer id) {
		System.out.println("删除用户"+id);
	}

	@Override
	public void update(UserEntity userEntity) {
		System.out.println("更新用户"+userEntity.getUserName());
	}

	@Override
	public UserEntity getById(Integer id) {
		System.out.println("查询用户"+id);
		return new UserEntity(1,"张三","123");
	}

}
