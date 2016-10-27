@echo off
if [%1]==[] goto usage
:: SDK_PATH should point to the Android SDK on your machine
set SDK_PATH=%ANDROID_SDK_HOME%\sdk
set BUILD_TOOLS=24.0.3
set ADB=%SDK_PATH%\platform-tools\adb
set AAPT=%SDK_PATH%\build-tools\%BUILD_TOOLS%\aapt
set EMULATOR=%SDK_PATH%\tools\emulator
set AVD=Nexus_5_API_23
set ACTIVITY=.MainActivity
:: start emulator
echo Starting the emulator
start %EMULATOR% -netdelay none -netspeed full -avd %AVD%
:: build app
call build_single %1
:: wait for emulator to be on
:wait
set EMULATOR_STATUS=
for /f "delims=" %%a in ('%ADB% shell getprop sys.boot_completed') do @set EMULATOR_STATUS=%%a
if not "%EMULATOR_STATUS%" == "1" (
    timeout /t 2 /nobreak >NUL
    goto wait
)
set APK_LOCATION=%1/app/build/outputs/apk/app-debug.apk
:: retrive package name from manifest file
%AAPT% dump badging %APK_LOCATION% | findstr/r "package: name='[a-z]*' versionCode=" > package.tmp
for /f "tokens=1-3 delims='" %%A in (package.tmp) do SET PACKAGE=%%B
del /q package.tmp
:: echo %PACKAGE%
:: goto end
:: install app
%ADB% push %APK_LOCATION% /data/local/tmp/%PACKAGE%
%ADB% shell pm install -r "/data/local/tmp/%PACKAGE%"
:: launch default activity
%ADB% shell monkey -p "%PACKAGE%" -c android.intent.category.LAUNCHER 1
:: other option if you want to start a specific ACTIVITY
:: %ADB% shell am start -n "%PACKAGE%/%PACKAGE%%ACTIVITY%" 
:: add the following line to start a specific activity
::-a android.intent.action.MAIN -c android.intent.category.LAUNCHER
goto:eof
:usage
echo usage: %0 projectname