@echo off
::cacls . /t /e /g Everyone:f
attrib -r *.* /s
call projects
for /f "usebackq delims=" %%a in (projects.txt) do call clean_single "%%a"
pause