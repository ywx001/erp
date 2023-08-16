package com.sn.controller;

import com.sn.entity.Client;
import com.sn.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {


    @Resource
    private ClientService clientService;

    @RequestMapping("findAll")
    public List<Client> findAllClient(){
        return clientService.findAllClient();
    }


}
