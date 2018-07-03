package com.lwgame.gdx.ios.bindings.googlemobileads;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import com.lwgame.gdx.ios.bindings.googlemobileads.protocol.GADMediatedUnifiedNativeAd;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GoogleMobileAds")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GADMediatedUnifiedNativeAdNotificationSource extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GADMediatedUnifiedNativeAdNotificationSource(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GADMediatedUnifiedNativeAdNotificationSource alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native GADMediatedUnifiedNativeAdNotificationSource init();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("mediatedNativeAdDidDismissScreen:")
	public static native void mediatedNativeAdDidDismissScreen(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdDidEndVideoPlayback:")
	public static native void mediatedNativeAdDidEndVideoPlayback(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdDidPauseVideo:")
	public static native void mediatedNativeAdDidPauseVideo(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdDidPlayVideo:")
	public static native void mediatedNativeAdDidPlayVideo(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdDidRecordClick:")
	public static native void mediatedNativeAdDidRecordClick(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdDidRecordImpression:")
	public static native void mediatedNativeAdDidRecordImpression(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdWillDismissScreen:")
	public static native void mediatedNativeAdWillDismissScreen(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdWillLeaveApplication:")
	public static native void mediatedNativeAdWillLeaveApplication(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Selector("mediatedNativeAdWillPresentScreen:")
	public static native void mediatedNativeAdWillPresentScreen(
			@Mapped(ObjCObjectMapper.class) GADMediatedUnifiedNativeAd mediatedNativeAd);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}