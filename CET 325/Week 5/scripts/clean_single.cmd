@echo off
if [%1]==[] goto usage
set GRADLE_VER=2.14.1
set GRADLE="%GRADLE_HOME%"\bin\gradle
:: delete all versions except GRADLE_VER
for /D %%d in (%1\.gradle\*) do if "%%d" neq "%1\.gradle\%GRADLE_VER%" rmdir /s/q "%%d"
:: remove previous build folders
if exist %1\app\build rmdir /s/q %1\app\build
if exist %1\build rmdir /s/q %1\build
cd %1
echo ----------------------------
echo cleaning %1
echo ----------------------------
call %GRADLE% clean
cd ..
goto:eof
:usage
echo usage: %0 projectname