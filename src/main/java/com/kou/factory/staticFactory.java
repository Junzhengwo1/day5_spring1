package com.kou.factory;

import com.kou.service.IAccountService;
import com.kou.service.impl.AccountServiceImpl;

/**
 * @author JIAJUN KOU
 */
public class staticFactory {
    public  static IAccountService getIAccountService(){
        return new AccountServiceImpl();
    }
}
