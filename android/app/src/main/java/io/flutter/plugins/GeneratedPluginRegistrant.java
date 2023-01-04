package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.androidintent.AndroidIntentPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import com.baseflow.geocoding.GeocodingPlugin;
import com.baseflow.geolocator.GeolocatorPlugin;
import com.humazed.google_map_location_picker.GoogleMapLocationPickerPlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.packageinfo.PackageInfoPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AndroidIntentPlugin.registerWith(registry.registrarFor("io.flutter.plugins.androidintent.AndroidIntentPlugin"));
    FlutterAndroidLifecyclePlugin.registerWith(registry.registrarFor("io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin"));
    GeocodingPlugin.registerWith(registry.registrarFor("com.baseflow.geocoding.GeocodingPlugin"));
    GeolocatorPlugin.registerWith(registry.registrarFor("com.baseflow.geolocator.GeolocatorPlugin"));
    GoogleMapLocationPickerPlugin.registerWith(registry.registrarFor("com.humazed.google_map_location_picker.GoogleMapLocationPickerPlugin"));
    GoogleMapsPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
    PackageInfoPlugin.registerWith(registry.registrarFor("io.flutter.plugins.packageinfo.PackageInfoPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
