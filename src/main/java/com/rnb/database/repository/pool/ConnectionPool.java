package com.rnb.database.repository.pool;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ConnectionPool {
    private String userName;
    private String password;
    private String url;
    private int poolSize;
}
