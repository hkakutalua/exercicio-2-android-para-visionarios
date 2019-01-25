# Exerc\355cio N\372mero 2  - RecyclerView
  
## Descri\347\343o  
Este aplicativo exibe em uma lista ve\355culos populares. Os dados sobre os ve\355culos s\343o gerados na pr\363pria aplica\347\343o, ent\343o o aplicativo funciona sem conex\343o \340 internet.

O aluno ter\341 de criar um RecyclerView, seu seu adapter correspondente para exibir os ve\355culos populares.

## O que n\343o \351 necess\341rio codificar e/ou configurar?
J\341 \351 fornecido o c\363digo base da aplica\347\343o, n\343o ser\341 necess\341rio usar APIs ou obter os dados de qualquer outra fonte.

## Configurar o Projecto No Seu Computador
Caso baixe e abra o projecto pela primeira vez no seu **Android Studio**. Na parte superior do editor, clique em **File > Sync Project With Gradle Files** para baixar as depend\352ncias do projecto e configurar o Gradle para que seja poss\355vel executar o projecto.

## Passos Para Resolu\347\343o
Os passos para a resolu\347\343o deste exerc\355cio s\343o as que seguem:

 - 1 - Substituir o ScrollView e TextView pelo RecyclerView no layout activity_main;
 - 2 - Criar o XML que represente cada item gr\341fico que \351 exibido no RecyclerView;
 - 3 - Criar o Adapter;
 - 4 - Criar a ViewHolder dentro da classe do Adapter previamente criado;
- 5 - Implementar os m\351todos **onCreateViewHolder()** para inflar um item e guard\341-lo no view holder, **onBindViewHolder()** para atribuir os dados para o item e **getItemCount** para retornar o n\372mero de itens;
- 6 - Apagar o c\363digo que tem rela\347\343o com a atribui\347\343o de dados em uma TextView, j\341 que estaremos a usar RecyclerView;
- 7 - Obter a refer\352ncia do RecyclerView por meio do seu ID;
- 8 - Instanciar um LinearLayoutManager vertical e atribu\355-lo ao RecyclerView;
- 9 - Instanciar o Adapter previamente criado e atribu\355-lo ao RecyclerView;
- 10 - Passar os dados para o Adapter para que o RecyclerView possa exibi-los;