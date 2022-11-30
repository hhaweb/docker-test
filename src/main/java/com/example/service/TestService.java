package com.example.service;

import com.example.model.User;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static final BiMap<String, User> USER_MAP = Maps.synchronizedBiMap(HashBiMap.create());

    public void addUser(String id, User user) {
        USER_MAP.put(id,user);
    }

    public  User getUser(String id) {
        return  USER_MAP.get(id);
    }

    public String getId(User user) {
        return  USER_MAP.inverse().get(user);
    }


}
