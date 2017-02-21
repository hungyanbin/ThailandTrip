package com.yanin.thailandtrip;

import android.content.Context;

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
