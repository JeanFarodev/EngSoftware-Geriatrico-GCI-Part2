@echo off
REM =====================================================================
REM compile_and_test.bat
REM Script para compilar o projeto GCI e executar os testes JUnit 4
REM Pré-requisito: Java JDK instalado e os JARs do JUnit na pasta lib\
REM =====================================================================

SET SRC=src
SET TEST=test
SET BIN=bin
SET LIB=lib
SET CP=%LIB%\junit-4.13.2.jar;%LIB%\hamcrest-core-1.3.jar

echo [1] Criando pasta bin...
if not exist %BIN% mkdir %BIN%

echo [2] Compilando classes de modelo e servico...
javac -d %BIN% -sourcepath %SRC% %SRC%\model\*.java %SRC%\service\*.java

echo [3] Compilando testes...
javac -cp %CP%;%BIN% -d %BIN% %TEST%\*.java

echo [4] Executando testes...
java -cp %CP%;%BIN% org.junit.runner.JUnitCore ^
  TC01_CadastroResidenteValido ^
  TC02_CadastroResidenteNomeNulo ^
  TC03_CalculoIdadeResidente ^
  TC04_ClassificacaoFaixaEtaria ^
  TC05_BuscaResidentePorId ^
  TC06_ListagemPorFaixaEtaria ^
  TC07_RemocaoResidente ^
  TC08_CadastroMedicamentoValido ^
  TC09_AlertaEstoqueBaixo ^
  TC10_AdministracaoDoseEstoqueInsuficiente ^
  TC11_AdministracaoDoseValida ^
  TC12_RegistroAtendimentoValido ^
  TC13_RegistroAtendimentoSemResidente ^
  TC14_HistoricoAtendimentoResidente ^
  TC15_ValidacaoTurnoEnfermeiro

pause
