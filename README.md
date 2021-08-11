
# <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\institucional\logoativo.png" alt="Logo Laboratório Côrtes Villela Simples" style="zoom:5%;" /> Hackathon Laboratório Côrtes Villela

Agosto/2021.

## O que é?

O Hackathon é organizado pelo [Laboratório Côrtes Villela](https://www.cortesvillela.com.br/) e pelo [Centro Regional de Inovação e Transferência de Tecnologia - CRITT (UFJF)](https://www2.ufjf.br/critt/);
A ideia inicial é de buscar soluções na **área da saúde e logística**, com foco na *automação de rotas e melhorias da experiência do usuário* dos serviços do Laboratório.
Buscar formas de otimizar custos relacionados a exames domiciliares e cadastro de pacientes.




## O projeto:

### Ideia inicial:

* Melhorar a **experiência do paciente** com o uso de um aplicativo; 
* Melhorar a **coordenação da movimentação dos coletores**;
* Unificar as informações dos pacientes, coletores e gestores. Para isso, o aplicativo reúne as opções de registro e login dos três grupos e oferece as seguintes opções:
  * Permite ao gestor melhor conhecimento sobre a localização e sobre o estado das coletas;
  * Permite ao coletor visualizar um resumo das coletas do dia, suas localizações (o que pode ser alinhado com serviços de otimização de rotas, um exemplo é o serviço [Circuit](https://getcircuit.com/));
  * Permite ao usuário encontrar todos os serviços desejados. Estarão disponíveis opções de agendamento e recebimento de resultados, além de acompanhamento de coleta de exame domiciliar;

### O que será feito?

Protótipo de **aplicativo** nativo para **Android** que reúne essas informações em um só lugar.

### Como será feito? Quais tecnologias serão usadas?

* Aplicativo nativo para Android feito em Java;
* Android Studio para criação e programação dos arquivos;
* Autenticação, base de dados e integração com [Firebase](https://firebase.google.com/?hl=pt);

### Existe algum plano para o futuro?

Devido ao curto tempo disponível, não será possível que todas as funções sejam implementadas. Apesar disso, há ideias para trazer a localização em tempo real dos coletores para os gestores e pacientes. Melhorar, também, o acesso às informações sobre os exames.



## Como utilizar?

1. Em um celular Android 8.0 ou acima, instale o arquivo [apk]() disponível para [download](). Se não sabe instalar, [este guia pode te ajudar](https://www.techtudo.com.br/dicas-e-tutoriais/2018/10/como-instalar-apk-no-android.ghtml).
   * O aplicativo é completamente seguro, não há nenhum tipo de vírus. As únicas bibliotecas utilizadas são do próprio [Android](https://developer.android.com/?hl=pt-br), do [Firebase](https://firebase.google.com/?hl=pt) e do [Material Design](https://material.io/).
2. Faça registro e entre em sua conta.
3. Aproveite!

*Observações:*

* As telas que não estiverem terminadas terão um aviso (estarão em Mockup).
* Nem todas as funcionalidades estão disponíveis.
* Foram criadas contas padrão para login:
  * Paciente:
    * E-mail (não funcional): paciente@gmail.com
    * Senha: paciente
  * Coletor:
    * E-mail (não funcional): coletor@gmail.com
    * Senha: coletor
  * Gestor:
    * E-mail (não funcional): adminteste@gmail.com
    
    * Senha: admin1122
    
      

## Partes funcionais:

* Activities (telas) e chamadas para activities (telas);
* Cadastro e login;
* Sincronização do cadastro e login com banco de dados (Firebase Realtime Database);
  * Para fins de demonstração e segurança, os únicos dados armazenados no momento são nome, e-mail e senha.

## Imagens das Telas do Aplicativo:

* Tela de Login:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\01login.png" alt="Tela de Login" style="zoom: 15%;" />

* Tela para Criar Conta:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\02criarconta.png" alt="Tela para Criar Conta" style="zoom:15%;" />

* Tela de Menu - Paciente:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\03pacientemenu.png" alt="Tela de Menu - Paciente" style="zoom:15%;" />

* Tela de Resultados - Paciente:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\04pacienteresultados.png" alt="Tela de Resultados - Paciente" style="zoom:15%;" />

* Tela de Marcação de Exames - Paciente:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\05agendar1.png" alt="Tela de Marcação de Exames - Paciente 1" style="zoom:15%;" />

  

  

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\06agendar2.png" alt="Tela de Marcação de Exames - Paciente 2" style="zoom:15%;" />

* Tela de Acompanhamento do Coletor - Paciente:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\10gestordados.png" alt="Tela de Acompanhamento do Coletor - Paciente" style="zoom:15%;" />

* Tela de Menu - Coletor:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\07coletormenu.png" alt="Tela de Menu - Coletor" style="zoom:15%;" />

* Tela de Dados - Coletor:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\08coletordados.png" alt="Tela de Dados - Coletor" style="zoom:15%;" />

* Tela de Menu - Gestor:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\09gestormenu.png" alt="Tela de Menu - Gestor" style="zoom:15%;" />

* Tela de Dados - Gestor:

  <img src="C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\screenshots\10gestordados.png" alt="Tela de Dados - Gestor" style="zoom:15%;" />

  

## Integrantes do grupo: Equipe 2 - Cheetah:

Grupo formado aleatoriamente no Hackathon. Nenhum dos participantes se conhecia anteriormente.

* **UX Design:** [Danielle Mattos de Sousa](https://www.linkedin.com/in/danielle-mattos-de-sousa-975672209/);
* **Desenvolvimento:** [Isadora Gonçalves Ferreira](https://www.linkedin.com/in/isadorafer/);
* **Negócios:** [João Lucas dos Anjos](https://www.linkedin.com/in/joão-lucas-dos-anjos-9828b1193).

### Mentores:

* UX Design: João Torman;

* Desenvolvimento: Leandro Wong;

* Negócios: Leonardo Frossard.

  ![Logo Laboratório Côrtes Villela Grande](C:\Users\isado\AndroidStudioProjects\HackathonLabCV\docshackathon\institucional\logolabc.png)

