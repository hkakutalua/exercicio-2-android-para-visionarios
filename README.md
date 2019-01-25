
# Exercício Número 2  - RecyclerView
  
## Descrição  
Este aplicativo exibe em uma lista veículos populares. Os dados sobre os veículos são gerados na própria aplicação, então o aplicativo funciona sem conexão à internet.

O aluno terá de criar um RecyclerView, seu seu adapter correspondente para exibir os veículos populares.

## O que não é necessário codificar e/ou configurar?
Já é fornecido o código base da aplicação, não será necessário usar APIs ou obter os dados de qualquer outra fonte.

## Configurar o Projecto No Seu Computador
Caso baixe e abra o projecto pela primeira vez no seu **Android Studio**. Na parte superior do editor, clique em **File > Sync Project With Gradle Files** para baixar as dependências do projecto e configurar o Gradle para que seja possível executar o projecto.

## Passos Para Resolução
Os passos para a resolução deste exercício são as que seguem:

 - 1 - Substituir o ScrollView e TextView pelo RecyclerView no layout activity_main;
 - 2 - Criar o XML que represente cada item gráfico que é exibido no RecyclerView;
 - 3 - Criar o Adapter;
 - 4 - Criar a ViewHolder dentro da classe do Adapter previamente criado;
- 5 - Implementar os métodos **onCreateViewHolder()** para inflar um item e guardá-lo no view holder, **onBindViewHolder()** para atribuir os dados para o item e **getItemCount** para retornar o número de itens;
- 6 - Apagar o código que tem relação com a atribuição de dados em uma TextView, já que estaremos a usar RecyclerView;
- 7 - Obter a referência do RecyclerView por meio do seu ID;
- 8 - Instanciar um LinearLayoutManager vertical e atribuí-lo ao RecyclerView;
- 9 - Instanciar o Adapter previamente criado e atribuí-lo ao RecyclerView;
- 10 - Passar os dados para o Adapter para que o RecyclerView possa exibi-los;