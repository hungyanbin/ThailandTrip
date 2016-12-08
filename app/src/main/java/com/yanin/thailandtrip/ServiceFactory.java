package com.yanin.thailandtrip;

import com.yanin.thailandtrip.db.DBService;
import com.yanin.thailandtrip.db.DBServiceImp;

public class ServiceFactory {

    private static DBService dbServiceInstance;

    public static DBService getDBService(){
        if(dbServiceInstance == null){
            dbServiceInstance = new DBServiceImp();
        }

        return dbServiceInstance;
    }
}
