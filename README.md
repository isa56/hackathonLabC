# Hackathon Laboratório Côrtes Villela

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

1. Em um celular Android 8.0 ou acima, abra o arquivo [LabCHackathonCheetah.apk](https://github.com/isa56/hackathonLabC/blob/main/docshackathon/LabCHackathonCheetah.apk) disponível no [link](https://github.com/isa56/hackathonLabC/blob/main/docshackathon/LabCHackathonCheetah.apk) para e clique em Download.
2. Instale em seu celular Android. Se não sabe instalar, [este guia pode te ajudar](https://www.techtudo.com.br/dicas-e-tutoriais/2018/10/como-instalar-apk-no-android.ghtml).
   * O aplicativo é completamente seguro, não há nenhum tipo de vírus. As únicas bibliotecas utilizadas são do próprio [Android](https://developer.android.com/?hl=pt-br), do [Firebase](https://firebase.google.com/?hl=pt) e do [Material Design](https://material.io/).
3. Faça registro e entre em sua conta.
4. Quaisquer dúvidas podem ser enviadas para [isadorafer56@gmail.com](mailto:isadorafer56@gmail.com?Subject=Duvida%20sobre%20o%20projeto%20Hackathon%20LabC%20da%20Equipe%20Cheetah).

*Observações:*

* As telas que não estiverem terminadas terão um aviso (estarão em Mockup).

* Nem todas as funcionalidades estão disponíveis.

* Foram criadas contas padrão para login, mas outras podem ser criadas:

  * Paciente:
    * E-mail (não existe de verdade): paciente@gmail.com
    * Senha: paciente
  * Coletor:
    * E-mail (não existe de verdade): coletor@gmail.com
    * Senha: coletor
  * Gestor:
    * E-mail (não existe de verdade): adminteste@gmail.com
    * Senha: admin1122

* O banco de dados está on-line na conta de [Isadora Gonçalves Ferreira](mailto:isadorafer56@gmail.com?Subject=Duvida%20sobre%20o%20projeto%20Hackathon%20LabC%20da%20Equipe%20Cheetah). Para quaisquer dúvidas ou liberação de acesso, mandar e-mail.

  

## Partes funcionais:

* Activities (telas) e chamadas para activities (telas);
* Cadastro e login;
* Sincronização do cadastro e login com banco de dados (Firebase Realtime Database);
  * Para fins de demonstração e segurança, os únicos dados armazenados no momento são nome, e-mail e senha.

## Imagens das Telas do Aplicativo:

* Tela de Login:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/01login.png" alt="Tela de Login" style="zoom: 15%;" />




* Tela para Criar Conta:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/02criarconta.png" alt="Tela para Criar Conta" style="zoom:15%;" />




* Tela de Menu - Paciente:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/03pacientemenu.png" alt="Tela de Menu - Paciente" style="zoom:15%;" />




* Tela de Resultados - Paciente:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/04pacienteresultados.png" alt="Tela de Resultados - Paciente" style="zoom:15%;" />




* Tela de Marcação de Exames - Paciente:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/05agendar1.png" alt="Tela de Marcação de Exames - Paciente 1" style="zoom:15%;" />




  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/06agendar2.png" alt="Tela de Marcação de Exames - Paciente 2" style="zoom:15%;" />





* Tela de Acompanhamento do Coletor - Paciente:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/10gestordados.png" alt="Tela de Acompanhamento do Coletor - Paciente" style="zoom:15%;" />





* Tela de Menu - Coletor:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/07coletormenu.png" alt="Tela de Menu - Coletor" style="zoom:15%;" />





* Tela de Dados - Coletor:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/08coletordados.png" alt="Tela de Dados - Coletor" style="zoom:15%;" />





* Tela de Menu - Gestor:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/09gestormenu.png" alt="Tela de Menu - Gestor" style="zoom:15%;" />





* Tela de Dados - Gestor:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/10gestordados.png" alt="Tela de Dados - Gestor" style="zoom:15%;" />




 

* Banco de Dados:

  <img src="https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/screenshots/11bancodedados.png" alt="Banco de Dados" style="zoom:15%;" />




 

## Integrantes do grupo: Equipe 2 - Cheetah:

Grupo formado aleatoriamente no Hackathon. Nenhum dos participantes se conhecia anteriormente.

* **UX Design:** [Danielle Mattos de Sousa](https://www.linkedin.com/in/danielle-mattos-de-sousa-975672209/);
* **Desenvolvimento:** [Isadora Gonçalves Ferreira](https://www.linkedin.com/in/isadorafer/);
* **Negócios:** [João Lucas dos Anjos](https://www.linkedin.com/in/joão-lucas-dos-anjos-9828b1193).


### Mentores:

* UX Design: João Torman;
* Desenvolvimento: Leandro Wong;
* Negócios: Leonardo Frossard.

  ![Logo Laboratório Côrtes Villela Grande](https://raw.githubusercontent.com/isa56/hackathonLabC/main/docshackathon/institucional/logolabc.png)

