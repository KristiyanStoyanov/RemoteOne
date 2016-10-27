@echo off
call projects
for /f "usebackq delims=" %%a in (projects.txt) do call build_single "%%a"
pause