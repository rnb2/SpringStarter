package com.rnb.database.repository;

import com.rnb.bpp.InjectBean;
import com.rnb.database.repository.pool.ConnectionPool;
import lombok.ToString;

@ToString
public class CompanyRepository {

    //custom annotation
    @InjectBean
    private ConnectionPool pool;


}
