package com.allebd.dispatchsystem.dagger;

import com.allebd.dispatchsystem.ui.activity.HospitalFinderActivity;
import com.allebd.dispatchsystem.ui.fragment.profile.ProfileFragment;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Digz on 02/04/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(HospitalFinderActivity target);
    void inject(ProfileFragment target);
}
