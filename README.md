# Genymotion fork of Lawnchair 14.0
This is a fork of the `14-dev` branch of the [lawnchair](https://github.com/LawnchairLauncher/) repository.

Lawnchair is based on the AOSP Launcher3 launcher.

We adjust it to our Genymotion products needs.
For example, we change the default home screen workspaces to add our wanted apps and widgets, like the Qwant search bar.

## Build the apk
You can use Git to clone this repository:

```
git clone --recursive git@github.com:Genymobile/Lawnchair.git
```

To build the app, select the `lawnWithQuickstepDebug` build type.

Should you face errors relating to the `iconloaderlib` and `searchuilib` projects, run `git submodule update --init --recursive`.

## Integrate the apk in the AOSP build
At the moment, we embark the Lawnchair release apk directly as a prebuilt in our AOSP builds. We put it in this private internal repository: https://github.com/Genymobile/genymotion_private_vendor_genymotion_prebuilts_apps

To update this prebuilt:
- build the `lawnWithQuickstepMarketRelease` build variant via Gradle;
- copy the obtained apk in `vendor/genymotion/prebuilts/Lawnchair/`;
- rename it `lawnchair-<android-version>-<sha-1>.apk`
- update the apk name in the `vendor/genymotion/prebuilts/Lawnchair/Android.bp`.

Ideally, we should update the initial Launcher3 Android.bp of this repository to make it properly build the Lawnchair app. This would allow us to directly embark the source code of this repository in our AOSP environments and ease versioning.
