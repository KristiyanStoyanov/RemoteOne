@echo off
:: this script prints a list of pairs (folder name - project name) for every project already built in your folder
:: set SDK_PATH to the path of at the Android SDK - check on your machine!
set SDK_PATH=%ANDROID_SDK_HOME%\sdk
set BUILD_TOOLS=24.0.3
set AAPT=%SDK_PATH%\build-tools\%BUILD_TOOLS%\aapt
dir/b *. > projects.txt
for /f "usebackq delims=" %%f in (projects.txt) do (
if exist "%%f/app/build/outputs/apk/app-debug.apk" (
%AAPT% dump badging "%%f/app/build/outputs/apk/app-debug.apk" | findstr/r "package: name='[a-z]*' versionCode=" > package.tmp
for /f "tokens=1-3 delims='" %%A in (package.tmp) do echo %%f - %%B
del /q package.tmp
)
)
