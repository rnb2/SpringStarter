package com.rnb.database.repository;

import com.rnb.bpp.InjectBean;
import com.rnb.database.repository.pool.ConnectionPool;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@ToString
public class CompanyRepository {

    //custom annotation same as Autowired
    @InjectBean
    //@Autowired
    private ConnectionPool connectionPool;

    /*
        If two beans for the same class were instantiated in application.xml config, prefer set variable name as a bean name
        Example:
        @Autowired
        private ConnectionPool pool; - Will NOT work without @Qualifier if there are two beans in application.xml

        @Autowired
        private ConnectionPool connectionPool; - WILL work even without @Qualifier,
            because 'connectionPool' field name is equals to name in application.xml
     */

    /*

        @Autowired
        private List<ConnectionPool> connectionPool;

        This also will work
        connectionPool=[ConnectionPool(userName=postgres, password=root, url=postgres:5432, poolSize=10),
        ConnectionPool(userName=postgres, password=root, url=postgres:5432, poolSize=10)], poolSize=10)]

    */

    @Value("${db.pool.size}")   //value annotation is for get values from properties example: db.pool.size
    private Integer poolSize;
}
