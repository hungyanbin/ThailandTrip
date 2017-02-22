package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.FragmentScope;
import com.yanin.thailandtrip.GlobalProvider;
import com.yanin.thailandtrip.repository.RepoComponent;
import com.yanin.thailandtrip.repository.RepoModule;

import dagger.Component;

@FragmentScope
@Component(dependencies = RepoComponent.class, modules = ScheduleModule.class)
public interface ScheduleComponent {
    void inject(ScheduleFragment scheduleFragment);
}
