package com.lwgame.gdx.ios;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.iosmoe.IOSApplication;
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration;
import com.lwgame.gdx.Lw;
import com.lwgame.gdx.conf.Configuration;
import com.lwgame.gdx.ios.ads.IOSAdmob;
import com.lwgame.gdx.ios.billing.IOSBilling;
import com.lwgame.gdx.ios.bindings.FIRApp;
import com.lwgame.gdx.ios.platform.IOSGameCenter;
import com.lwgame.gdx.ios.platform.IOSPlatform;

import org.moe.natj.general.Pointer;

import apple.foundation.NSDictionary;
import apple.foundation.NSLocale;
import apple.foundation.c.Foundation;
import apple.uikit.UIApplication;
import apple.uikit.c.UIKit;

public abstract class IOSMoeBaseLauncher extends IOSApplication.Delegate {

    protected IOSMoeBaseLauncher(Pointer peer) {
        super(peer);
    }

    @Override
    protected IOSApplication createApplication() {
        initDefaultLocale();
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        config.useAccelerometer = false;
        return new IOSApplication(createApplicationListener(), config);
    }

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary<?, ?> launchOptions) {
        boolean r = super.applicationDidFinishLaunchingWithOptions(application, launchOptions);
        FIRApp.configure();
        IOSApplication app = (IOSApplication) Gdx.app;
        Lw.configuration = new Configuration();
        Lw.billing = new IOSBilling();
        Lw.gameCenter = new IOSGameCenter(app);
        Lw.platform = new IOSPlatform();
        Lw.ads = new IOSAdmob(app);
        return r;
    }

    protected void initDefaultLocale() {
        NSLocale nsLocale = NSLocale.autoupdatingCurrentLocale();
        String language = nsLocale.objectForKey(Foundation.NSLocaleLanguageCode()).toString();
        String country = nsLocale.objectForKey(Foundation.NSLocaleCountryCode()).toString();
        System.setProperty("user.language", language);
        System.setProperty("user.region", country);
    }

    protected abstract ApplicationListener createApplicationListener();

    public static void main(String[] argv) {
        UIKit.UIApplicationMain(0, null, null, IOSMoeBaseLauncher.class.getName());
    }
}
