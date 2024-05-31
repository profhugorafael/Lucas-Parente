# Introducao ao Java

## Estrutura basica de um projeto Java

`App.java`:

```java
public class App {
    public static void main(String[] args) {
        // seu codigo aqui
    }
}
```

## saidas no Java

> Chamamos a saida pelo seu atalho "sout"

```java
System.out.println("Ola Mundo!");
```

## Variáveis

|tipo|motivo|exemplo|
|:-:|:-:|:-:|
|int|inteiro|`int a = 2;`|
|long|inteiro|`long a = 2L;`|
|float|numero real|`float f = 2.3F;`|
|double|numero real|`double f = 2.3;`|
|boolean|Verdadeiro ou Falso|`boolean b = true;`|
|char|caracter|`char c = 'M';`|
|String|texto|`String s = "Hugo Rafael";`|

exemplo dos mais importantes:

```java
int idade = 23;
double altura = 1.8;
String nome = "Joao";
boolean estaChovendo = false;
```

```java
int a, b; // cria 2 variaveis
a = 2;
b = 3;
```

```java
double raio, pi = 3.14159;
```

```java
double x = 2;
double x = 3; // nao pode
String x = "outra coisa"; // nao pode
```

```java
int numero1, numero2;
```

> padrao de nomenclatura camelCase

ex.: `String ruaDoEnderecoDaPessoa`

```java
double a = 2, b = 3;

System.out.println("soma = " + (a + b));
```

```java
double a = 2, b = 3;
double resultado = a + b;

System.out.println("soma = " + resultado);
```

```java
double raio, pi = 3.14159;

raio = 5;

double area = raio*raio*pi;

System.out.println("Area = " + area);
```

## Entradas

```java
Scanner keyboard = new Scanner(System.in);

keyboard.nextInt();
```
