@echo off
:: save a list of all folders, except FOLDER2EXCLUDE to a file
set FOLDER2EXCLUDE="_hfcfg backup done"
dir/b *. | findstr /v %FOLDER2EXCLUDE% > projects.txt
