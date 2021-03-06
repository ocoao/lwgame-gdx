package com.lwgame.gdx.ios.bindings.googlemobileads.protocol;


import com.lwgame.gdx.ios.bindings.googlemobileads.DFPCustomRenderedAd;
import com.lwgame.gdx.ios.bindings.googlemobileads.DFPInterstitial;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleMobileAds")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("DFPCustomRenderedInterstitialDelegate")
public interface DFPCustomRenderedInterstitialDelegate {
	@Generated
	@Selector("interstitial:didReceiveCustomRenderedAd:")
	void interstitialDidReceiveCustomRenderedAd(DFPInterstitial interstitial,
			DFPCustomRenderedAd customRenderedAd);
}