@echo off
REM =====================================================================
REM generate_javadoc.bat
REM Gera a documentação JavaDoc do projeto GCI
REM =====================================================================

SET SRC=src
SET DOCS=docs

echo [1] Gerando JavaDoc...
javadoc -d %DOCS% -sourcepath %SRC% -subpackages model:service ^
        -encoding UTF-8 -charset UTF-8 ^
        -windowtitle "GCI - Gerenciamento de Cuidados para Idosos" ^
        -doctitle "GCI - Documentacao Tecnica v1.0" ^
        -author -version

echo [2] JavaDoc gerado na pasta %DOCS%
pause
