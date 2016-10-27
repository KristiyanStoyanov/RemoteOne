@echo off
if [%1]==[] goto usage
set GRADLE="%GRADLE_HOME%"\bin\gradle
cd %1
echo ----------------------------
echo building %1
echo ----------------------------
call %GRADLE% build
cd ..
goto:eof
:usage
echo usage: %0 projectname