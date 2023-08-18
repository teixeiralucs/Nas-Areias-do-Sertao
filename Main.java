import java.util.Scanner;

public class Main {
        public static void print(String a){
            System.out.println(a);
        }
        public static void divisor (String a){
            System.out.println("==================================================\n");
        }
    public static void main(String [] args) {

        String preTextTitle = "=====================Nas Areias do Sertão==========================="; 
        String preTextText = "Em um futuro desértico, a água potável do planeta acabou\n"+ 
        "as calotas polares derreteram e o oceano inundou a maioria\n"+
        "das cidades, matou bilhões e forçou os cidadãos que restaram\n"+
        "a procurar no interior um jeito de viver. Numa cidade pequena,\n" +
        "no sertão brasileiro, um herói tem que escolher entre amar e lutar.\n" +
        "Bem-vindo ao Nas Areias dos Sertões\n " + "Utilizaremos a metrica de FORÇA DO CUSCUZ como medidor de sua vitalidade, você começará com 100%"+
        " mas poderá perder ou ganhar com o passar do jogo mas lembre-se, se sua " +
        "FORÇA DO CUSCUZ chegar a 0% o jogo acaba.\n" + "Agora que temos tudo vamos dar inicio a nossa aventura\n"+
        "Bem vindo a Nas areias do Sertão\n";
        String chapter1Title = "Capitulo 1: A Invasão do Leste";
        String chapter1Text = "No ano de 35 d.I (depois da Inundação), Claúdio" +
        " vive um dia após o outro, com recursos limitados\n" + 
        "e poucas chances de sobrevivencia\n"+
        "há poucos momentos de felicidade, exceto quando encontra o seu amor Catarina, filha\n" +
        "do Capitão Hermenegildo, que assumiu a liderança das terras ao redor do rio no\n"+
        "segundo ano após a grande inundação e que conflita diretamente com a familia do\n"+
        "nosso herói, por isso que todos os encontros do casal são sempre às escondidas,\n" +
        "numa área sagrada e que os mais antigos evitam pisar pela força espiritual do lugar.\n" +
        "Em um desses encontros, Catarina propõe uma ideia maluca\n" +
        "'- E se fugíssemos?' diz ela, empolgada!\n" +
        "'- Para aonde? Todo o mundo é igual aqui' lhe fala com tristeza na fala 'O mundo " +
        "acabou Catarina.'\n" +
        "'- Mas não precisa ser assim, encontros às escondidas, sempre nesse lugar velho, poderíamos\n" +
        "ser felizes, sabe? Existe um lugar, onde a água salgada não destuiu os rios, onde há vida e "+
        "esperança!'\n"
        + "Você fica em silêncio, tudo que ele mais quer é fugir daquele lugar, daquelas pessoas.\n " +
        "'- Poderíamos fugir do meu pai' diz Catarina após perceber a pausa do seu amado\n" +
        "ela sabe como o assunto é delicado e isso o fará pensar sobre.\n" +
        "'- Acho que deveríamos ir, já está ficando tarde!' " + "você se levanta e se despede.\n" +
        "'- Amanhã a gente se encontra, tá bem?' eles se beijam e " + "você vai embora.";
       int chapter1Mod = -15; 
       String chapter1TextCont = "No caminho para casa você pensou muito no que Catarina disse, ele já havia ouvido falar " +
        "de Paradiso, um lugar onde a água salgada do mar não destruiu a vida, mas esse lugar " +
        "é apenas um mito, ao longo dos anos diversos viajantes passaram pelas terras da sua família" + 
        " sempre famintos e com sede, sempre dizendo sobre esse lugar e suas maravilhas, mas nunca " +
        "soube era verdade ou não e ele também nunca foi procurar.\n" +
        "Já em casa você se encontra sua mãe e eles discutem um pouco sobre o dia, "+
        "após o papo ela pergunta se ele quer comer, a janta do dia é buchada, a sua preferida, mas "+
        "depois da ultima coversa com Catarina você não está com vontade de nada, então" +
        "diz apenas que irá dormir. Em seus sonhos, você tem a visão de um mundo melhor, " +
        "cheio de árvores e vida mas que rapidamente é destruido por uma nuvem vermelha que engole tudo.\n "+
        "Já na parte da manhã você acorda atordoado, procurando sentido no que acabou de sonhar" +
        "parece ser mais tarde do que ele costuma acordar já que não ouve os barulhos tradicionais do "+
        "seu dia-a-dia, porém um estrondo urge no limiar da sua audição, estremecendo seus timpanos e " +
        "fazendo-o perder um pouco do seu equilibrio. Você não sabe o que está acontecendo " +
        "mas logo logo irá descobrir que seu pesadelo irá se tornar realidade. " +
        "Fora de sua casa você segue os sons de balas e gritos até que chega ao centro da vila e " +
        "encontra uma cena de desolação, as pessoas, que tanto lutaram pela sua sobrevivência " +
        "famílias que há mais de decadas vem se esfoçando o máximo para remanecer nas terras centenárias " +
        "de seus antepassados, agora estão caidos no chão, sem vida no olhar, nesse momento vem em sua mente " +
        "Catarina, onde ela está, como ela está, você empunha sua arma" + " e vai à procura de sua amada. "+ 
        "No caminho você faz algumas vitimas, pessoas estranhas vestidas de modo completamente diferente e " +
        "hostis.\n" +
        "Ao virar em uma pequena viela ele se depara uma cena que o faz perder novamente seu equilíbrio " +
        "seu pai, caido no chão, sangrando e sem vida sob o sol daquela manhã. Isso te enfurece e você sai a " +
        "a procura de quem fez aquilo.";
        int chapter1ContMod = -25;
        //"Nessa sessão vamos escolher o nome do seu personagem\n" + "Qual nome seu personagem terá?"
        //String preTextText2 = ("Ok, vou chamá-lo de " + mainPersona.name)

        String chapter1TextCont2 = "você, furtivamente anda pelas ruelas da vila, ocasionalmente atacando mais algumas " +
        "pessoas vestidas como aquele primeiro soldado, após alguns minutos você finalmente se encontra "+
        "com a origem de toda aquele caos " + "Uma mulher alta, próxima dos 1,80m esguia e com "+
        "um rosto assustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
        "ele pensa em atacar e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das " +
        "casas. Prestes a atacar, você vê o rosto de sua amada, que trás todo o corforto que ele procurava " +
        "naquele momento.\n Você conta a ela sobre seu pai e ela falou que perdeu sua mãe também, " +
        "e que movida pelo luto decidiu que iria, naquele momento, embora dali, e convida te convida" +
        "para se juntar a ela. Nesse momento você se vê encurralado, ao mesmo tempo que " +
        "deseja vingar a morte de seu pai, aquela é a hora perfeita para que vocês dois possam " +
        "ter o mais próximo de uma vida normal naquele mundo tão surreal. Você se vê sem tempo para " +
        "tomar uma decisão, você deseja ficar mas também deseja fugir na mesma intensidade. O que você " +
        "deverá fazer, ele deve FUGIR com sua amada ou FICAR e lutar?\n" +
        "Ao decidir FUGIR você ganhará mais 50 pontos de FORÇA DE CUSCUZ\n" +
        "Ao decidir FICAR você ganahrá mais 20 pontos de FORÇA DE CUSCUZ\n";
        String chapter1Choice1 = "FUGIR";
        String chapter1Choice2 = "FICAR";
        String chapter1TextEnd = "Apesar da dor naquele momento, você decide que deve ser racional e pensar no "+
            "seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar " +
            "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
            "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
            "a correr sem olhar para trás, sem olhar para o que agora é seu passado.\n" + "FIM DO CAPITULO \n" +
            "EPÍLOGO\n" + "pós dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
            "tal terra prometida, vocês são salvos por um vaqueiro desconhecido que os leva "+
            "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
            "se deveriam mesmo ter tido aquela atitude. Após acordar você se depara com um " +
            "lugar que nem em sonho conseguria idealizar, não havia um sinal de seca, de areia ou de " +
            "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
            "cobriam cada m² de beleza deslumbrante. Você e Catarina foram bem recebiddos pelos "+
            "locais que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
            "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
            "não vendo sentido em fazer todo aquele esforço em vão.\n" + "CINCO ANOS DEPOIS\n" +
            "Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
            "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
            "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
            "afim de saber o destino de sua família você o questiona da situação na sua vila, " +
            "porém o que você descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que você " +
            "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
            "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
            "esse teria sido o fim de sua vila e sua família. Você se sente muito culpado" +
            "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.";
            String chapter1TextProceed = "Apesar da dor naquele momento, você decide que deve ser racional e pensar na "+
            "sua familia. Você diz não para o seu amor, e a vê partindo para longe de seus braços " +
            "sem olhar para trás. A partir dali você decide procurar sua mãe e sua irmã, e vingar a "+
            "morte de seu pai, você faz uma prece a Padre Cícero e começa a procurar sua família e " +
            "esquecer aquela que um dia foi seu grande amor.\n";
            String chapter1End = "FIM DO CAPITULO I";
            String chapter1End2 = "FIM DA HISTORIA";
            String chapter2Title = "Capitulo II - O Confronto\n";
            String chapter2Text = "Decidido dar continuidade a sua vingança você começa a sua procura por sua mãe e "
            + "irmã, você se direciona para sua casa, para começar as buscas, ao chegar lá encontra sua residência " +
            "completamente destruida, ação atribuida a mulher misteriosa da praça, em completo desespero você começa a " +
            "gritar os nomes de sua familiares, em busca de encontrá-las, para seu alivio, surgindo ao longe "+
            "elas aparacem, um pouco abatidas mas bem. Você fala sobre o destino do seu pai, o que deixa o tom " +
            "da conversa ainda mais tenso, em seguida fala sobre seu plano, de abater a odiosa mulher que tanto o tirou. " +
            "Sua mãe recomenda então que você vá a procura o Capitão, tendo em vista que o antigo militar, apesar de " +
            "há muito tempo fora da ativa, ainda é conhecido por toda a região como o exímo estrategista que, porém" +
            "apesar de ser o mais sensato a se fazer, você ainda possui muitos ressentimentos em relação ao Capitão. " +
            "Após ponderar e não chegar a nenhuma decisão você fita o horizonte em busca de uma resposta divina " +
            "talvez seu pai, em algum lugar possa dar a ele um sinal. Porém nada acontece e a decisão ainda precisa ser" +
            "dele, você deveria BUSCAR ajuda do Capitão ou LUTAR sozinho a majestosa vilã?\n" +
            "Ao decidir BUSCAR você ganhará mais 30 pontos de FORÇA DE CUSCUZ\n"+
            "Ao decidir LUTAR você ganahrá mais 60 pontos de FORÇA DE CUSCUZ\n";
            String chapter2Choice1 = "BUSCAR";
            String chapter2Choice2 = "LUTAR";
            String chapter2End = "FIM DO CAPITULO II";
            String chapter3Title = "CAPITULO III - Embate no Ninho de Tubarõe";
            String chapter3TextBuscar = "Decidido a tomar a decisão correta, você busca ajuda com o Capitão, " +
                "colocando todas as suas diferenças de lado e indo buscar a vingnça que ele tanto " +
                "almeja. Chegando na residencia do Capitão, você é recebido por um homme em tormenta " +
                "preocupado com sua filha desaparecida e em luto pela mulher que acabara de perder " +
                "você o ouve mas sem muito interesse, porém quando o assunto do contra-ataque " +
                "surge você se mostra interessado, e logo os dois montam um plano para expulsarem a mulher " +
                "da vila. Com o plano em mente ambos vão para o centro da vila para expurgarem o mal " +
                "de vez. No caminho eles são avistados por dois capangas que dão ordem de pare e falam que "+
                "eles devem ser encaminados para a lider Shayanne. Eles então se entregam, como parte do plano " +
                "para alcaçarem mais rapidamente o covil principal da líder. " +
                "O plano foi bem sucedido e ambos são levados direto a chefe da facção, algemados " + 
                "eles não mostram resistencia até chegarem no local final de encontro com Shayanne. " +
                "Durante a curta estadia ela discursou sobre seus planos de escravizar aquela região" +
                "os forçando a trabalhar nas minas de carvão que ela possui. Entre palavras de ameaça o " +
                "General dá o sinal que você estava esperando. Eles facilmente consguem se soltar e "
                + "investem contra dois dos guardas armados, nocauteando-os e conseguindo subjulgar " +
                "mais dois, só então, você percebe algo que até então não havia notado " +
                "todos os dentes dos capangas foram modificados para parecer dentes de tubraão " +
                "assim como suas peles receberam uma camada grossa de algo que pareciam escamas " +
                "que tornou o combate um pouco mais complicado do que eles imaginavam que seria " +
                "passado esse momento de reflexão acerca dos soldados caídos sobou apenas a líder dos "
                + "homens tubarões para se preocupar, e que naquela distancia pode-se perceber mais " +
                "claramente como ela alterada igualmente, apesar dos dentes não serem muito diferentes " +
                "do nosso heroi, a pele era igualmente grossa e escamosa, talvez até mais dificil de penetrar " +
                "que as dos seus capangas e o que mais chamou atenção foi os olhos dela, negros e preenchia " +
                "completamente as orbitas e seus olhos, quase que o hipnotizando. Ao resistir àquele transe você " +
                "consegue retornar a batalha. Sacando rapidamente sua arma você parte para cima dela "+
                "desferindo golpes de faca, que gradativamente vão perfurando sua " +
                "dura pele de escamas, você não deixa de notar que ela possui sua " +
                "arma propria também, uma especie de besta feita de um material branco-"+
                "amarelado, algo parecido com ossos\n -Talvez seja ossos de tubarão', pensou,"  + 
                "Dentre os próximos minutos houve " +
                "uma luta de proporções épicas, golpes massivos de faca e " +
                "flechas de ossos cobertos de seiva de Jurubeba, planta que pode causar " +
                "necropsia gradativamente voando em direção ao nosso heroi. " + 
                "Apesar das altas habilidades de Shayanne nosso heroi consegue " +
                "derrotá-la com um golpe estratégico no abdomem, região de menor " +
                "prevalencia de escamas destuir os orgãos internos da rainha-tubrão, " +
                "que cai no chão perdendo sangue e sentindo sua vida " +
                "se esvair, cansados mas vitoriosos o Capitão Hermenegildo e você " +
                "retornam as suas casas com uma promessa de paz de ambas as partes " +
                "e de cooperação para a reconstrução da vila com os poucos moradores restantes." ;
                String chapter3TextLutar = "Ainda ressentido por todos os anos de desavenças, você decide enfrentar a grande "+
                "ameaça por si só, apenas armado você decide furtivamente invadir a " +
                "a base no centro da vila. Porém com pouca esperiência em batalha e sem o Capitão como " +
                "ajuda nas estratégias você é capturado e se vê aos pés da assustadora mulher. Nesse ponto " +
                "você consegue notar mais detalhes dela e de seus aliados, como suas peles grossas e escamosas" +
                "que todos eles compartilham e os olhos profundos e negros, que preenche toda as órbitas "+
                "de seus olhos. Enquanto a vilã discursava sobre o futuro da vila e o seu, você  "+
                "procurava manteiras de fugir daquela situação. Antes mesmo de Shayanne encerrar seu " +
                "monólogo,  você consegue se desvencilhar dos capagangas e sacar sua arma" +
                "e se dirigir direamente para a posição da mulher, pegando-a de surpresa " +
                "porém não houve muita efetividade, sem a ajuda do Capitão a luta se torna um " +
                "pouco injusta para o lado do nosso heroi. Lutando bravamente contra a besta feita " +
                "de ossos e as flechas cobertas de seiva de Jurubeba, que podem necrosar gradativamente" +
                "o alvo, o nosso herói se ve desesperançoso, mas nada o preparou para a flecha que " +
                "vem e empala, diretamente no coração, o matando imediatamente, e condenando sua vila "+
                "às maiores atocidades cometidas por Shayanne";
                String chapter3End = "FIM DA HISTORIA";
                String[] choicesCap1 = new String[2];
                choicesCap1[0] = chapter1Choice1;
                choicesCap1[1] = chapter1Choice2;
                String[] choicesCap2 = new String[2];
                choicesCap2[0] = chapter2Choice1;
                choicesCap2[1] = chapter2Choice2;

                Scanner leitor = new Scanner (System.in);
                Persona character = new Persona ("Claúdio", 100);
                Chapter preChapter = new Chapter (preTextTitle, preTextText, null ,
                character, 0, "");
                Chapter chapter1 = new Chapter (chapter1Title, chapter1Text, null, 
                character, chapter1Mod, "");
                Chapter chapter1Cont = new Chapter ("" , chapter1TextCont, null, 
                character, chapter1ContMod, "");
                Chapter chapter1Cont2 = new Chapter ("", chapter1TextCont2, choicesCap1, 
                character, 0, "");
                Chapter chapter1Final = new Chapter ("", chapter1TextEnd, null, 
                character, -100, chapter1End2);
                Chapter chapter1ToGo = new Chapter ("", chapter1TextProceed, null, 
                character, 0, chapter1End);
                Chapter chapter2 = new Chapter (chapter2Title, chapter2Text, choicesCap2,
                character, 0, chapter2End);
                Chapter chapter3Buscar = new Chapter (chapter3Title, chapter3TextBuscar, null, 
                character, 0, chapter3End);
                Chapter chapter3Lutar = new Chapter (chapter3Title, chapter3TextLutar, null,
                character,  -100, chapter3End );

        preChapter.show();
        chapter1.show();
        chapter1Cont.show();
        chapter1Cont2.show();
        int choiceCap1Array = chapter1Cont2.choose(choicesCap1);

        if (choiceCap1Array == 0){
            character.changeEnergy(50);
            chapter1Final.show();
    
        }
        else if (choiceCap1Array == 1){
            character.changeEnergy(20);
            chapter1ToGo.show();
            chapter2.show();
            int choiceCap2Array = chapter2.choose(choicesCap2);

            if (choiceCap2Array == 0){
                character.changeEnergy(30);
                chapter3Buscar.show();

            }
            else if (choiceCap2Array == 1){
                character.changeEnergy(60);
                chapter3Lutar.show();
            }
        
            
        }
 
 
    leitor .close();
    }
}

    

            
   