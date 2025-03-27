package com.rnb.database.repository.pool;

import lombok.ToString;

@ToString
public class ConnectionPool {
    private String userName;
    private String password;
    private String url;
    private int poolSize;
}
