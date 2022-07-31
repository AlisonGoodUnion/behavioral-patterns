# behavioral-patterns

Objetivo do repositório é apenas armazenar códigos de treinamentos da Alura.

Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;

Existem três principais categorias de padrões de projeto:
* Comportamentais (que serão vistos neste treinamento)
* Estruturais
* Criacionais

Objetivos de aplicar os padrões</br>
* Não repita código com Template Method
* Saiba da importância de estudar os padrões de projeto
* Resolva problemas de muito ifs usando Strategy
* Adicione comportamentos ao seu objeto com Decorator
* Crie diferentes ações com Observer
* Use o Builder para a criação de objetos complicados

Padrões comportamentais utilizados
* Strategy
* Chain of Responsability
* Template Method
* State
* Command
* Observer

#### Strategy: 
    Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes

    Que tipo de problema o padrão Strategy visa resolver?
    Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo).
    Outro exemplo seria: calcular custo ou tempo de uma viagem de carro, ônibus ou avisão
    Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

##### Muitos IFs:
     Diversos if podem ser um problema, e que ter uma classe que "pode crescer para sempre" também é um problema.
        
     Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o 
     mínimo possível de código já existente.
     Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. 
     Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.

#### Chain of Responsability:
    Que tipo de problema o padrão Chain of Responsability visa resolver?

    Diferente do Strategy, aqui eu não sei de cara o que quero aplicar.
    Então precisamos verificar para cada tipo de ação se devemos aplicar ou não.
    Então o primeiro tipo/etapa sabe se aplica ou passa para a próxima, vamos escalando o processo até a etapa final.
         
#### Template Method
    Que tipo de problema o padrão Chain of Responsability visa resolver?
    O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes,
    evitando assim duplicações de códigos.

    Criação de um método concreto na classe “mãe”,
    que chama métodos abstratos implementados nas classes “filhas”.
    Entao temos o "Metodo Modelo" que faz parte do template, mas outras partes ele delega!


