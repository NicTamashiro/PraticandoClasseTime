#  Praticando `java.time`

Este repositório reúne pequenos exercícios desenvolvidos para praticar a API **`java.time`** do Java.

O objetivo foi aprender a manipular datas, horários, fusos horários, formatação e cálculos de tempo utilizando as principais classes da biblioteca.

---

#  Conteúdos praticados

- `LocalDate`
- `LocalTime`
- `ZonedDateTime`
- `ZoneId`
- `Duration`
- `Period`
- `DateTimeFormatter`

---

#  Exercícios

##  PrimeiroContatoComClasseTime

Primeiro contato com a API `java.time`.

### Conceitos praticados

- Data atual (`LocalDate.now()`)
- Criação de datas (`LocalDate.of()`)
- Soma de dias (`plusDays()`)
- Comparação de datas (`isBefore()`)
- Formatação de datas
- Fusos horários
- Diferença entre horários (`Duration`)
- Diferença entre datas (`Period`)

---

##  DataHoraAtual

Simula o registro da criação de uma tarefa.

### Conceitos praticados

- Data atual
- Hora atual

---

##  FormatandoDataHora

Exibe a data e a hora utilizando formatos personalizados.

### Conceitos praticados

- `DateTimeFormatter`
- Formatação de datas
- Formatação de horários

---

## ️ DiferencaEntreHoras

Calcula quanto tempo existe entre dois horários.

### Conceitos praticados

- `Duration`
- Horas
- Minutos

---

##  FusoHorario

Obtém o horário atual em outro país.

### Conceitos praticados

- `ZoneId`
- `ZonedDateTime`

---

##  ConvertendoParaOutroFuso

Converte o horário local para o fuso horário de Sydney.

### Conceitos praticados

- Conversão entre fusos horários
- `withZoneSameInstant()`

---

##  CalculandoDataEntrega

Calcula automaticamente uma data de entrega adicionando dias.

### Conceitos praticados

- `plusDays()`

---

##  AjustandoDataVencimento

Adiciona meses à data de vencimento de um boleto.

### Conceitos praticados

- `plusMonths()`

---

##  LembretePagamento

Calcula quando um lembrete de pagamento deve ser enviado antes do vencimento.

### Conceitos praticados

- `minusDays()`

---

##  VerificandoDataEvento

Verifica se um evento já aconteceu ou ainda está por vir.

### Conceitos praticados

- `isAfter()`
- Comparação de datas

---

##  ControleDeExpediente

Simula um controle de jornada de trabalho.

O usuário informa:

- horário de entrada;
- carga horária diária;
- horário de saída.

O programa calcula automaticamente o saldo de horas (positivo ou negativo).

### Conceitos praticados

- Entrada de dados (`Scanner`)
- `LocalTime`
- `Duration`
- Cálculo de horas extras
- Formatação de horário

---

#  O que aprendi

Durante esses exercícios pratiquei:

- Manipulação de datas
- Manipulação de horários
- Formatação personalizada
- Operações de soma e subtração de datas
- Comparação entre datas
- Cálculo de duração
- Diferença entre datas
- Trabalhar com fusos horários
- Conversão entre fusos horários

---

#  Tecnologias

- Java
- API `java.time`

---

# Objetivo

Este projeto faz parte dos meus estudos em Java e tem como objetivo fortalecer o domínio da API **`java.time`**, muito utilizada no desenvolvimento de aplicações para manipulação de datas e horários.