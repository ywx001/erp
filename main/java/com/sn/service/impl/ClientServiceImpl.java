package com.sn.service.impl;

import com.sn.dao.ClientDao;
import com.sn.entity.Client;
import com.sn.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ClientServiceImpl  implements ClientService {

    @Resource
    private ClientDao clientDao;
    @Override
    public List<Client> findAllClient() {
        return clientDao.findAllClient();
    }
}
