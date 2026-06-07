# GCI – Gerenciamento de Cuidados para Pacientes Idosos

Projeto – Parte 2 | Engenharia de Software  
Jean Faro · João Victor · Guilherme Paiva

---

## Como rodar os testes

Abra o cmd na pasta do projeto e execute:

```
compile_and_test.bat
```

## Como gerar o JavaDoc

```
generate_javadoc.bat
```

A documentação é gerada na pasta `docs/`. Abra `docs/index.html` no navegador.

---

## Branches

- `main` — código estável, entregável final
- `develop` — integração das features

---

## Casos de Teste

| # | Tipo | O que testa |
|---|---|---|
| TC01 | Válido | Cadastro de residente |
| TC02 | Exceção | Nome nulo lança exceção |
| TC03 | Válido | Cálculo dinâmico de idade |
| TC04 | Válido | Classificação por faixa etária |
| TC05 | Válido/Alt | Busca por ID existente e inexistente |
| TC06 | Válido | Filtra residentes por faixa etária |
| TC07 | Válido/Alt | Remoção de residente |
| TC08 | Válido | Cadastro de medicamento |
| TC09 | Válido | Alerta de estoque baixo |
| TC10 | Exceção | Dose maior que estoque lança exceção |
| TC11 | Válido | Dose decrementa estoque corretamente |
| TC12 | Válido | Registro de atendimento |
| TC13 | Exceção | Atendimento sem residente lança exceção |
| TC14 | Válido | Histórico filtra por residente |
| TC15 | Válido/Alt | Validação de turno do enfermeiro |

---

https://github.com/JeanFarodev/EngSoftware-Geriatrico-GCI-Part2