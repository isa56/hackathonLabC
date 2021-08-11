
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

1. Em um celular Android, instale o arquivo (apk)[] disponível para (download)[].
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
* ~~Atualização da posição por botão do coletor para o usuário e gestor;~~
* ~~Envio de notificações ao se aproximar do local do usuário;~~
* ~~Sincronização da marcação de exames com banco de dados (Firebase Realtime Database);~~

## Integrantes do grupo: Equipe 2 - Cheetah:

Grupo formado aleatoriamente no Hackathon. Nenhum dos participantes se conhecia anteriormente.

* **UX Design:** [Danielle Mattos de Sousa](https://www.linkedin.com/in/danielle-mattos-de-sousa-975672209/);
* **Desenvolvimento:** [Isadora Gonçalves Ferreira](https://www.linkedin.com/in/isadorafer/);
* **Negócios:** [João Anjos](https://www.linkedin.com/in/joão-lucas-dos-anjos-9828b1193).

## 

