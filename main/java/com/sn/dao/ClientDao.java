package com.sn.dao;


import com.sn.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao {


    List<Client>findAllClient();

}
