package com.rnb.service;

import com.rnb.database.repository.UserRepository;
import com.rnb.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

}
