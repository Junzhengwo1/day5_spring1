package com.kou.factory;

import com.kou.service.IAccountService;
import com.kou.service.impl.AccountServiceImpl;

/**
 * @author JIAJUN KOU
 */
public class InstanceFactory {

    public IAccountService getIAccountService(){
        return new AccountServiceImpl();
    }
}
