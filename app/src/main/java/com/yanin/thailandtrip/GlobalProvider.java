package com.yanin.thailandtrip;

import android.content.Context;

import com.yanin.thailandtrip.db.DBComponent;
import com.yanin.thailandtrip.db.DBModule;
import com.yanin.thailandtrip.db.DaggerDBComponent;
import com.yanin.thailandtrip.repository.DaggerRepoComponent;
import com.yanin.thailandtrip.repository.RepoComponent;

public class GlobalProvider {

    public static DBComponent dbComponent;
    public static RepoComponent repoComponent;

    public static void init(Context context){
        dbComponent = DaggerDBComponent
                .builder()
                .dBModule(new DBModule(context))
                .build();
        repoComponent = DaggerRepoComponent
                .builder()
                .dBComponent(dbComponent)
                .build();
    }

}
