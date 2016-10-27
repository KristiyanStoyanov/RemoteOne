@echo off
call projects
for /f "usebackq delims=" %%a in (projects.txt) do call zip_single "%%a"
pause