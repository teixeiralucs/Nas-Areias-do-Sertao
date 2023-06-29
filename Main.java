import java.util.Scanner;

public class Main {
        public static void print(String a){
            System.out.println(a);
        }
        public static void divisor (String a){
            System.out.println("==================================================\n");
        }
    public static void main(String [] args) {
        Scanner leitor = new Scanner (System.in);

        print("=====================Nas Areias do Sertão===========================");
        // print("Antes de começarmos, qual idioma você gostaria de jogar?\n" +
        // "Before we start, which language would you like to play?\n" + "Digite PT para Português e EN para Inglês\n"
        // + "Type PT to Portuguese or EN to English");
        // String pt = ("PT");
        // String language = leitor .nextLine();

        // if (language.equalsIgnoreCase(pt)){
            print("Em um futuro desértico, a água potável do planeta acabou\n"+ 
            "as calotas polares derreteram e o oceano inundou a maioria\n"+
            "das cidades, matou bilhões e forçou os cidadãos que restaram\n"+
            "a procurar no interior um jeito de viver. Numa cidade pequena,\n" +
            "no sertão brasileiro, um herói tem que escolher entre amar e lutar.\n" +
            "Bem-vindo ao Nas Areias dos Sertões");
            print("Aperte qualquer tecla para continuar...");
            leitor .nextLine();
            divisor(null);
            print("Nessa sessão vamos escolher alguns aspectos o seu personagem " +
            "tais como nome e arma favorita\n");
            // adicionar gênero no futuro
            // print("Seu personagem é HOMEM ou MULHER?");
            // String homem = ("HOMEM");
            // String genero = leitor .nextLine();
            // if (genero.equalsIgnoreCase(homem)){
                
                divisor(null);
                print("Qual nome seu personagem terá?");
                String name = leitor .nextLine();            
                print("\nAgora você irá escolher sua a arma favorita, você tem três escolhas: \n");
                divisor(null);
                print(" - A CARABINA é uma arma de fogo de longo alcance, medindo 1 metro e equipada\n" +
                "com balas de 5mm, foi muito utilizada no século XX por Cangaceiros e Vaqueiros,\n");
                
                print("- A PEIXEIRA será sua arma de corpo a corpo, trazendo uma lâmina e 30cm presa\n" +
                "a um cabo de feito de restos de crânio de Jaguatirica, essa arma poderá te ajudar\n" +
                "em momentos de conflito direto com os inimigos que surgirão na sua aventura.\n");

                print("- Nossa ultima arma é a MANDALA, uma armamento místico com escritas antigas\n"+
                "que canaliza as energia dos elementos naturais a força do Mandacaru e a areia\n" +
                "escaldante do sertão e libera como finos e longos espinhos ou energia quente como sol.\n");
                divisor(null);
                print("Qual arma você prefere?\n"+
                "- CARABINA;\n"+"- PEIXEIRA\nou\n- MANDALA?");
                
                String arma = leitor .nextLine();
                persona mainPersona = new persona(name, 100, arma);
                print("Ok, vou chamá-lo de " + mainPersona.name);
                print("Utilizaremos a metríca de FORÇA DO CUSCUZ como medidor de sua vitalidade, lembre-se, se sua " +
                "FORÇA DO CUSCUZ chegar a 0 o jogo acaba.");
                print("Agora que temos tudo vamos dar inicio a nossa aventura\n"+
                "Bem vindo a Nas areias do Sertão");
                print("Capitulo 1: A Invasão do Leste");
                print("No ano de 35 d.I (depois da Inundação), o jovem " + mainPersona.name +
                " vive um dia após o outro, com recursos limitados\n" + 
                "e poucas chances de sobrevivencia\n"+
                "há poucos momentos de felicidade, exceto quando encontra o seu amor Catarina, filha\n" +
                "do Capitão Hermenegildo, que assumiu a liderança das terras ao redor do rio no\n"+
                "segundo ano após a grande inundação e que conflita diretamente com a familia do\n"+
                "nosso herói, por isso que todos os encontros do casal são sempre às escondidas,\n" +
                "numa área sagrada e que os mais antigos evitam pisar pela força espiritual do lugar.\n" +
                "Em um desses encontros, Catarina propõe uma ideia maluca\n" +
                "'- E se fugíssemos?' diz ela, empolgada!\n" +
                "'- Para aonde? Todo o mundo é igual aqui' diz " + mainPersona.name + " com tristeza na fala 'O mundo " +
                "acabou Catarina.'\n" +
                "'- Mas não precisa ser assim, encontros às escondidas, sempre nesse lugar velho, poderíamos\n" +
                "ser felizes, sabe? Existe um lugar, onde a água salgada não destuiu os rios, onde há vida e "+
                "esperança!'\n"
                + mainPersona.name + " fica em silêncio, tudo que ele mais quer é fugir daquele lugar, daquelas pessoas.\n " +
                "'- Poderíamos fugir do meu pai' diz Catarina após perceber a pausa do seu amado\n" +
                "ela sabe como o assunto é delicado e isso o fará pensar sobre.\n" +
                "'- Acho que deveríamos ir, já está ficando tarde!' " + mainPersona.name + " se levanta e se despede.\n" +
                "'- Amanhã a gente se encontra, tá bem?' eles se beijam e " + mainPersona.name + " vai embora.\n" +
                "No caminho para casa " + mainPersona.name + " pensou muito no que Catarina disse, ele já havia ouvido falar " +
                "de Paradiso, um lugar onde a água salgada do mar não destruiu a vida, mas esse lugar " +
                "é apenas um mito, ao longo dos anos diversos viajantes passaram pelas terras da familía de " +
                mainPersona.name + " sempre famintos e com sede, sempre dizendo sobre esse lugar e suas maravilhas, mas nunca " +
                "soube era verdade ou não e ele também nunca foi procurar.\n" +
                "Já em casa " + mainPersona.name + " encontra sua mãe e eles discutem um pouco sobre o dia, "+
                "após o papo ela pergunta se ele quer comer, a janta do dia é buchada, a preferida dele, mas "+
                "depois da ultima coversa com Catarina ele não está com vontade de nada, então" +
                "diz apenas que irá dormir. Em seus sonhos, " + mainPersona.name + " tem a visão de um mundo melhor, " +
                "cheio de árvores e vida mas que rapidamente é destruido por uma nuvem vermelha que engole tudo. "+
                "Já na parte da manhã " + mainPersona.name + "acorda atordoado, procurando sentido no que acabou de sonhar" +
                "parece ser mais tarde do que ele costuma acordar já que não ouve os barulhos tradicionais do "+
                "seu dia-a-dia, porém um estrondo urge no limiar da sua audição, estremecendo seus timpanos e " +
                "fazendo-o perder um pouco do seu equilibrio. " + mainPersona.name + " não sabe o que está acontecendo " +
                "mas logo logo irá descobrir que seu pesadelo irá se tornar realidade. " +
                "Fora de sua casa ele segue os sons de balas e gritos até que chega ao centro da vila e " +
                "encontra uma cena de desolação, as pessoas, que tanto lutaram pela sua sobrevivencia" +
                "familias que há mais de decadas vem se esfoçando o máximo para remanecer nas terras centenárias " +
                "de seus antepassados, agora estão caidos no chão, sem vida no olhar, nesse momento vem em sua mente " +
                "Catarina, onde ela está, como ela está, ele empunha sua " + mainPersona.weapon + " e vai à procura de sua amada. "+ 
                "No caminho ele faz algumas vitimas, pessoas estranhas vestidas de modo completamente diferente e " +
                "hostis.\n" +
                "Ao virar em uma pequena viela ele se depara uma uam cena que o faz perder novamente seu equilibrio " +
                "seu pai, caido no chão, sangrando e sem vida sob o sol daquela manhã. Isso enfurece-o e ele sai a " +
                "a procura de quem fez aquilo.");
                if (mainPersona.weapon.equalsIgnoreCase("CARABINA")){
                    print(mainPersona.name + ", furtivamente anda pelas ruelas da vila, ocasionalmente atirando em mais algumas" +
                    "pessoas vestidas como aquele primeiro soldado, após alguns minutos ele finalmente se encontra "+
                    "com a origem de toda aquele caos " + "Uma mulher alta, proximo dos 1m80 esguia e com "+
                    "um rosto asustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
                    "ele pensa em atirar e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das" +
                    "casas. Prestes a atirar, ele vê o rosto de sua amada, que trás todo o corforto que ele procurava" +
                    "naquele momento.\n Ele contou a ela sobre seu pai e ela falou que perdeu sua mãe também, " +
                    " e que movida pelo luto decidiu que iria, naquele momento, embora dali, e convida " + mainPersona.name +
                    "para se juntar a ela. Nesse momento " + mainPersona.name + " se vê encurralado, ao mesmo tempo que " +
                    "ele deseja vingar a morte de seu pai, aquela é a hora perfeita para que os dois possam " +
                    "ter o mais próximo de uma vida normal naquele mundo tão surreal. Ele se vê sem tempo para " +
                    "tomar uma decisão, ele deseja ficar mas também deseja fugir na mesma intensidade. O que " +
                    mainPersona.name + " deverá fazer, ele deve FUGIR com sua amada ou FICAR e lutar?");
                    String decisao = leitor .nextLine();
                    if (decisao.equalsIgnoreCase("FUGIR")){
                        print("Apesar da dor naquele momento, " + mainPersona.name + " decide que deve ser racional e pensar no "+
                        " seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
                        "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
                        "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
                        "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
                        print("FIM DO CAPITULO 1");
                        print("EPÍLOGO");
                        print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
                        "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
                        "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
                        "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + " se depara com um " +
                        "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
                        "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
                        "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + " e Catarina foram bem recebiddos pelos "+
                        "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
                        "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
                        "não vendo sentido em fazer todo aquele esforço em vão.");
                        print("CINCO ANOS DEPOIS");
                        print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
                        "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
                        "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
                        "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
                        "porém o que ele descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que " +
                        mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
                        "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
                        "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + " se sente muito culpado" +
                        "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.");
                        print("FIM DA HISTÓRIA");
                    }
                    else{
                        print("Apesar da dor naquele momento, " + mainPersona.name + " decide que deve ser racional e pensar na "+
                        "sua familia. Ele diz não para o seu amor, e a vê partindo para longe de seus braços " +
                        "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
                        "morte de seu pai, ele faz uma prece a Padre Cícero e começa a procurar sua família e " +
                        "esquecer aquela que um dia foi seu grande amor.");
                        print("FIM DO CAPITULO 1");
                    }
                }
                else{
                    print(mainPersona.name + ", furtivamente anda pelas ruelas da vila, ocasionalmente atacando mais algumas" +
                    "pessoas vestidas como aquele primeiro soldado, após alguns minutos ele finalmente se encontra "+
                    "com a origem de toda aquele caos " + "Uma mulher alta, proximo dos 1m80 esguia e com "+
                    "um rosto asustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
                    "ele pensa em ataca-la e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das" +
                    "casas. Prestes a atirar, ele vê o rosto de sua amada, que trás todo o corforto que ele procurava" +
                    "naquele momento.\n Ele contou a ela sobre seu pai e ela falou que perdeu sua mãe também, " +
                    "e que movida pelo luto decidiu que iria, naquele momento, embora dali, e convida " + mainPersona.name +
                    " para se juntar a ela. Nesse momento " + mainPersona.name + " se vê encurralado, ao mesmo tempo que " +
                    "ele deseja vingar a morte de seu pai, aquela é a hora perfeita para que os dois possam " +
                    "ter o mais próximo de uma vida normal naquele mundo tão surreal. Ele se vê sem tempo para " +
                    "tomar uma decisão, ele deseja ficar mas também deseja fugir na mesma intensidade. O que " +
                    mainPersona.name + " deverá fazer, ele deve FUGIR com sua amada ou FICAR e lutar?");
                    String decisao = leitor .nextLine();
                    if (decisao.equalsIgnoreCase("FUGIR")){
                        print("Apesar da dor naquele momento, " + mainPersona.name + " decide que deve ser racional e pensar no "+
                        " seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
                        "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
                        "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
                        "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
                        print("FIM DO CAPITULO 1");
                        print("EPÍLOGO");
                        print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
                        "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
                        "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
                        "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + " se depara com um " +
                        "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
                        "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
                        "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + " e Catarina foram bem recebiddos pelos "+
                        "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
                        "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
                        "não vendo sentido em fazer todo aquele esforço em vão.");
                        print("CINCO ANOS DEPOIS");
                        print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
                        "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
                        "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
                        "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
                        "porém o que ele descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que " +
                        mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
                        "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
                        "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + " se sente muito culpado" +
                        "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.");
                        print("FIM DA HISTÓRIA");
                    }
                    else{
                        print("Apesar da dor naquele momento, " + mainPersona.name + " decide que deve ser racional e pensar na "+
                        "sua familia. Ele diz não para o seu amor, e a vê partindo para longe de seus braços " +
                        "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
                        "morte de seu pai, ele faz uma prece a Padre Cícero e começa a procurar sua família e " +
                        "esquecer aquela que um dia foi seu grande amor.");
                        print("FIM DO CAPITULO 1");
                print("Capitulo II - O Confronto");
                print("Decidido dar continuidade a sua vingança " + mainPersona.name + " começa a sua procura por sua mãe e "
                + "irmã, ele se direciona para sua casa, para começar as buscas, ao chegar lá encontra sua residência " +
                "completamente destruida, ação atribuida a mulher misteriosa da praça, em completo desespero ele começa a " +
                "gritar os mainPersona.names das sua familiares, em busca de encontrá-las, para seu alivio, surgindo ao longe "+
                "elas aparacem, um pouco abatidas mas bem. " + mainPersona.name + " fala sobre o destino do seu pai, o que deixa o tom " +
                " da conversa ainda mais tenso, em seguida fala sobre seu plano, de abater a odiosa mulher que tanto o tirou" +
                "sua mãe recomenda então que ele vá a procura o Capitão, tendo em vista que eo antigo militar, apesar de " +
                "há muito tempo fora da ativa, ainda é conhecido por toda a região como o eximio estrategista que, porém" +
                "apesar de ser o mais sensato a se fazer ele ainda possui muitos ressentimentos em relação ao Capitão. " +
                "Após ponderar e não chegar a nenhuma decisão " + mainPersona.name + " fita o horizonte em busca de uma resposta divina " +
                "talvez seu pai, em algum lugar possa dar a ele um sinal. Porém nada acontece e a decisão ainda precisa ser" +
                "dele, ele deveria BUSCAR ajuda do Capitão ou LUTAR sozinho a majestosa vilã?");
                decisao = leitor .nextLine();
                if (decisao.equalsIgnoreCase("buscar")){
                    print("FIM DO CAPITULO II");
                    print("CAPITULO III - Embate no Ninho de Tubarões");
                    print("Decidido a tomar a decisão correta, ele busca ajuda com o Capitão," +
                    "colocando todas as suas diferenças de lado e indo buscar a vingnça que ele tanto" +
                    "almeja. Chegando na residencia do Capitão, ele é recebido por um homme em tormenta" +
                    "preocupado com sua filha desaparecida e em luto pela mulher que acabara de perder" +
                    "ele ouve " + mainPersona.name + " falar mas sem muito interesse, porém quando o assunto da derrota " +
                    "surge ele se mostra interessado, e logo os dois montam um plano para expulsarem a mulher " +
                    "da vila. Com o plano em mente ambos vão para o centro da vila para expurgarem o mal " +
                    "de vez. No caminho eles são avistados por dois capangas que dão ordem de pare e falam que "+
                    "eles devem ser encaminados para a lider Shayanne. Eles então se entregam, como parte do plano" +
                    "para alcaçarem mais rapidamente o covil principal da líder." +
                    "O plano foi bem sucedido e ambos são levados direto a chefe da facção, algemados" + 
                    "eles não mostram resistencia até chegarem no local final de encontro com Shayanne." +
                    "Durante a curta estadia ele discursou sobre seus planos de escravizar aquela região" +
                    "os forçando a trabalhar nas minas de carvão que ela possui. Entre palavras de ameaça o " +
                    "General dá o sinal que " + mainPersona.name + " esperando. Eles facilmente consguem se soltar e "
                    + "investem contra dois dos guardas armados, nocauteando-os e conseguindo subjulgar " +
                    "mais dois, só então, " + mainPersona.name + " percebe algo que até então não havia notado " +
                    "todos os dentes dos capangas foram modificados para parecer dentes de tubraão" +
                    "assim como suas peles receberam uma camada grossa de algo que pareciam escamas" +
                    "que tornou o combate um pouco mais complicado do que eles imaginavam que seria" +
                    "passado esse momento de reflexão acerca dos soldados caídos sobou apenas a líder dos "
                    + "homens tubarões para se preocupar, e que naquela distancia pode-se perceber mais " +
                    "claramente como ela alterada igualmente, apesar dos dentes não serem muito diferentes " +
                    "do nosso heroi, a pele era igualmente grossa e escamosa, talvez até mais dificil de penetrar" +
                    "que as dos seus capangas e o que mais chamou atenção foi os olhos dela, negros e preenchia " +
                    "completamente as orbitas e seus olhos, quase que o hipnotizando. Ao resistir àquele transe" +
                    mainPersona.name +" consegue retornar a batalha, ");
                        if (arma.equalsIgnoreCase("carabina")){
                            print("recarregando rapidamente sua arma e buscando cobertura, ele não deixa de notar" +
                            "que ela possui sua arma propria também, uma especie de besta feita de um material branco-" +
                            "amarelado, algo parecido com ossos\n '- Talvez seja ossos de tubarão', pensou, "+
                            "Dentre os proximos minutos houve uma luta de proporções" +
                            "épicas, trocas de tiros e flechas de ossos cobertos de seiva de Jurubeba, planta que pode causar" +
                            "necropsia gradativamente. Apesar das altas habilidades de Shayanne, nossos herois consegem derrotá-" +
                            "la com um tiro generoso na região abdominal, que fura as duras escamas e conseguem penetrar e "+
                            "destuir os orgãos internos da rainha-tubrão, que cai no chão perdendo sangue e sentindo sua vida" +
                            "se esvair, cansados mas vitoriosos o Capitão Hermenegildo e " + mainPersona.name + " retornam as suas casas" +
                            "com uma promessa de paz de ambas as partes e de cooperação para a reconstrução da vila" +
                            "com os poucos moradores restantes.");
                            print("FIM DA HISTORIA");
                            print("EPÍLOGO");
                            print("Ao retornar para a casa ele se encontra com sua mãe e irmã, ao ver a destuição do "+
                            "seu lar, ele não consegue não pensar em seu amor, Catarina. Com o coração dividido entre "+
                            "continuar ali e reconstruir os danos causados no ultimo dia e se aventurar a procurar seu amor," +
                            mainPersona.name + " se vê novamente sem saída, deveria ele ir ATRAS de sua amada ou RECONSTRUIR a vila com sua familia?");
                                decisao = leitor. nextLine();
                                if (decisao.equalsIgnoreCase("atras")){
                                    print("Após conversar com sua mãe, ele finalmente consegue seguir em paz, a procura " +
                                    "da felicidade com sua amada, enquanto tem garantia que sua família ficará feliz.");
                                }
                                else{
                                    print("Mesmo de coração partido ele decide cumprir com seu dever perante" +
                                    "a sua família e decide continuar cuidando dela.");
                                }
                        }
                        if (arma.equalsIgnoreCase("PEIXEIRA")){
                            print("sacando rapidamente sua "+ arma + " ele parte para cima dela "+
                            "desferindo golpes de faca, que gradativamente vão perfurando sua " +
                            "dura pele de escamas, ele não deixa de notar que ela possui sua" +
                            "arma propria também, uma especie de besta feita de um material branco-"+
                            "amarelado, algo parecido com ossos -Talvez seja ossos de tubarão', pensou,"  + 
                            "Dentre os proximos minutos houve" +
                            "uma luta de proporções épicas, golpes massivos de faca e " +
                            "flechas de ossos cobertos de seiva de Jurubeba, planta que pode causar" +
                            "necropsia gradativamente voando em direção ao nosso heroi." + 
                            "Apesar das altas habilidades de Shayanne nosso heroi consegue " +
                            "derrotá-la com um golpe estratégico no abdomem, região de menor" +
                            "prevalencia de escamas destuir os orgãos internos da rainha-tubrão," +
                            "que cai no chão perdendo sangue e sentindo sua vida" +
                            "se esvair, cansados mas vitoriosos o Capitão Hermenegildo e " + mainPersona.name + 
                            " retornam as suas casas com uma promessa de paz de ambas as partes " +
                            "e de cooperação para a reconstrução da vila com os poucos moradores restantes.");
                            print("FIM DA HISTORIA");
                            print("EPÍLOGO");
                            print("Ao retornar para a casa ele se encontra com sua mãe e irmã, "+
                            "ao ver a destuição do seu lar, ele não consegue não pensar em seu amor," +
                            "Catarina. Com o coração dividido entre continuar ali e reconstruir os " +
                            "danos causados no ultimo dia e se aventurar a procurar seu amor," +
                            mainPersona.name + "se vê novamente sem saída, deveria ele ir ATRAS de sua amada" +
                            "ou RECONSTRUIR a vila com sua familia?");
                            decisao = leitor. nextLine();
                            if (decisao.equalsIgnoreCase("atras")){
                                print("Após conversar com sua mãe, ele finalmente consegue seguir em paz, a procura " +
                                "da felicidade com sua amada, enquanto tem garantia que sua família ficará feliz.");
                            }
                            else{
                                print("Mesmo de coração partido ele decide cumprir com seu dever perante" +
                                    "a sua família e decide continuar cuidando dela.");
                            }
                        }
                        if (arma.equalsIgnoreCase("mandala")){
                            print("tirando sua Mandala ele começa a se concentrar para ativar "+
                            "os poderes, após conseguir liberar as pimeiras rajadas de energia " +
                            "ele se sente preparado para atacar, entrando em combate com a rainha-" +
                            "tubarão, que retrucava com alvejando-o com sua besta feita de um material" +
                            "branco-amarelao, parecido com ossos, - Talvez seja ossos de tubarão pensou, " +
                            mainPersona.name + ", e com suas flechas de osso cobertas" +
                            "de seiva de Jurubeba, planta que pode causar necropsia gradativamente voavam em "+
                            "direção ao nosso heroi. Após queimar muito a pele de Shayanne e lhe causar uma dor " +
                            "terrivel com os espinhos, finaemnte a líder sucumbe aos ferimentos e vê seu fim" +
                            "na morte. Caída, sem vida os nossos vitoriosos podem finalmente desfrutar de alguma " +
                            "calmaria, vendo que não há mais por que lutar. Capitão Hemernegildo e " + mainPersona.name +
                            " retornam as suas casas com uma promessa de paz de ambas as partes " +
                            "e de cooperação para a reconstrução da vila com os poucos moradores restantes.");
                            print("FIM DA HISTORIA");
                            print("EPÍLOGO");
                            print("Ao retornar para a casa ele se encontra com sua mãe e irmã, "+
                            "ao ver a destuição do seu lar, ele não consegue não pensar em seu amor," +
                            "Catarina. Com o coração dividido entre continuar ali e reconstruir os " +
                            "danos causados no ultimo dia e se aventurar a procurar seu amor," +
                            mainPersona.name + "se vê novamente sem saída, deveria ele ir ATRAS de sua amada" +
                            "ou RECONSTRUIR a vila com sua familia?");
                            decisao = leitor. nextLine();
                            if (decisao.equalsIgnoreCase("atras")){
                                print("Após conversar com sua mãe, ele finalmente consegue seguir em paz, a procura " +
                                "da felicidade com sua amada, enquanto tem garantia que sua família ficará feliz.");
                            }
                            else{
                                print("Mesmo de coração partido ele decide cumprir com seu dever perante" +
                                    "a sua família e decide continuar cuidando dela.");
                        }
                        }    
                
                    
                    }
                else {
                    print("Ainda ressentido por todos os anos de desavenças, " + mainPersona.name + " decide enfrentar a grande "+
                    "ameaça por si só, apenas armado com sua " + arma + " ele decide furtivamente invadir a " +
                    "a base no centro da vila. Porém com pouca esperiência em batalha e sem o Capitão como " +
                    "ajuda nas estratégias ele é capturado e se vê aos pés da assustadora mulher. Nesse ponto " +
                    "ele consegue notar mais detalhes dela e de seus aliados, como suas peles grossas e escamosas" +
                    "que todos eles compartilham e os olhos profundos e negros, que preenche toda as órbitas "+
                    "de seus olhos. Enquanto a vilã discursava sobre o futuro da vila e de " + mainPersona.name + ", ele "+
                    "procurava manteiras de fugir daquela situação. Antes mesmo de Shayanne encerrar seu " +
                    "monólogo, " + mainPersona.name + "consegue se desvencilhar dos capagangas e sacar sua arma");
                    if (arma.equalsIgnoreCase("carabina")){
                            print("recarregar rapidamente, de modo que ele consegue alvejar a mulher, " +
                        "porém não houve muita efetividade, sem a ajuda do Capitão a luta se torna um " +
                        "pouco injusta para o lado do nosso heroi. Lutando bravamente contra a besta feita " +
                        "de ossos e as flechas cobertas de seiva de Jurubeba, que podem necrosar gradativamente" +
                        "o alvo, o nosso herói se ve desesperançoso, mas nada o preparou para a flecha que " +
                        "vem e empala, diretamente no coração, o matando imediatamente, e condenando sua vila "+
                        "às maiores atocidades cometidas por Shayanne");
                        }
                    if (arma.equalsIgnoreCase("peixeira")){
                        print("e se dirigir direamente para a posição da mulher, pegando-a de surpresa " +
                        "porém não houve muita efetividade, sem a ajuda do Capitão a luta se torna um " +
                        "pouco injusta para o lado do nosso heroi. Lutando bravamente contra a besta feita " +
                        "de ossos e as flechas cobertas de seiva de Jurubeba, que podem necrosar gradativamente" +
                        "o alvo, o nosso herói se ve desesperançoso, mas nada o preparou para a flecha que " +
                        "vem e empala, diretamente no coração, o matando imediatamente, e condenando sua vila "+
                        "às maiores atocidades cometidas por Shayanne");
                        }
                    if (arma.equalsIgnoreCase("mandala")){
                        print("e se dirigir direamente para a posição da mulher, pegando-a de surpresa " +
                        "porém não houve muita efetividade, sem a ajuda do Capitão a luta se torna um " +
                        "pouco injusta para o lado do nosso heroi. Lutando bravamente contra a besta feita " +
                        "de ossos e as flechas cobertas de seiva de Jurubeba, que podem necrosar gradativamente" +
                        "o alvo, o nosso herói se ve desesperançoso, mas nada o preparou para a flecha que " +
                        "vem e empala, diretamente no coração, o matando imediatamente, e condenando sua vila "+
                        "às maiores atocidades cometidas por Shayanne");
                        }   
                    print("FIM DA HISTORIA");
                    print("EPILOGO");
                    print("CINCO ANOS DEPOIS");
                    print("Após cinco anos vivendo em perfeita harmonia, na maravilhosa Paradiso, um evento" +
                    "pertuba a vida de Catarina e seu filho. Um viajante surge na garupa do cavalo de um dos " +
                    "vaqueiros da comunidade, é o primeiro desde que ela mesma esteve nessa posição." +
                    "após se recuperar, Catarina foi perguntar sobre sua vila, se ele tem noticias mas o que " +
                    "ela descobre parte seu coração, ao descobrir que não apenas a lider Shayanne destruiu todo " +
                    "o seu lar assim como matou seu pai e ambém aquele homem que um dia ela implorou para que "+
                    "fugisse com ela. Desolada e muito triste ela só pensa em seu filho, que nunca conhecerá seu pai.");    

                }
            }
        }
        leitor .close();
        }
    }
    

            
    //         else{
    //             print("Qual mainPersona.name seu personagem terá?");
    //             String mainPersona.name = leitor .nextLine();
    //             print("Ok, vou chamá-la de " + mainPersona.name);
    //             print("Agora você irá escolher sua a arma favorita, você tem três escolhas: \n"+
    //             "A CARABINA é uma arma de fogo de longo alcance, medindo 1 metro e equipada com balas de 5mm, "+
    //             "foi muito utilizada no século XX por Cangaceiros e Vaqueiros,\n" +
    //             "A PEIXEIRA será sua arma de corpo a corpo, trazendo uma lâmina e 30cm presa a um cabo de feito de " +
    //             "restos de crânio de Jaguatirica, essa arma poderá te ajudar em momentos de conflito direto com os "+
    //             "inimigos que surgirão na sua aventura.\n"+
    //             "Nossa ultima arma é a MANDALA, uma armamento místico com escritas antigas "+
    //             "que canaliza as energia dos elementos naturais "+
    //             "como as águas do São Francisco e a areia escaldante do sertão e libera como" +
    //             "rajadas de água congelante ou energia quente como sol.");
    //             print("Qual arma você prefere? CARABINA, PEIXEIRA ou MANDALA?");
    //             String arma = leitor .nextLine();
    //             print("Agora que temos tudo vamos dar inicio a nossa aventura\n"+
    //             "Bem vindo a Nas areias do Sertão");
    //             print("Capitulo 1: A Invasão do Leste");
    //             print("No ano de 35 d.I (depois da Inundação), a jovem " + mainPersona.name +
    //             " vive um dia após o outro, com recursos limitados\n" + 
    //             "e poucas chances de sobrevivencia\n"+
    //             "há poucos momentos de felicidade, exceto quando encontra o seu amor Ícaro, filho\n" +
    //             "do Capitão Baltazar, que assumiu a liderança das terras ao redor do rio no\n"+
    //             "segundo ano após a grande inundação e que conflita diretamente com a familia da\n"+
    //             "nossa heroína, por isso que todos os encontros do casal são sempre às escondidas,\n" +
    //             "numa área sagrada e que os mais antigos evitam pisar pela força espiritual do lugar.\n" +
    //             "Em um desses encontros, Ícaro propõe uma ideia maluca\n" +
    //             "'- E se fugíssemos?' diz ele, empolgado!\n" +
    //             "'- Para aonde? Todo o mundo é igual aqui' diz " + mainPersona.name + " com tristeza na fala 'O mundo " +
    //             "acabou Ícaro.'\n" +
    //             "'- Mas não precisa ser assim, encontros às escondidas, sempre nesse lugar velho, poderíamos\n" +
    //             "ser felizes, sabe? Existe um lugar, onde a água salgada não destuiu os rios, onde há vida e "+
    //             "esperança!'\n"
    //             + mainPersona.name + " fica em silêncio, tudo que ela mais quer é fugir daquele lugar, daquelas pessoas.\n " +
    //             "'- Poderíamos fugir do meu pai' diz Ícaro após perceber a pausa da sua amada\n" +
    //             "ele sabe como o assunto é delicado e isso a fará pensar sobre.\n" +
    //             "'- Acho que deveríamos ir, já está ficando tarde!' " + mainPersona.name + " se levanta e se despede.\n" +
    //             "'- Amanhã a gente se encontra, tá bem?' eles se beijam e " + mainPersona.name + " vai embora.\n" +
    //             "No caminho para casa " + mainPersona.name + " pensou muito no que Ícaro disse, ela já havia ouvido falar " +
    //             "de Paradiso, um lugar onde a água salgada do mar não destruiu a vida, mas esse lugar " +
    //             "é apenas um mito, ao longo dos anos diversos viajantes passaram pelas terras da familía de " +
    //             mainPersona.name + " sempre famintos e com sede, sempre dizendo sobre esse lugar e suas maravilhas, mas nunca " +
    //             "soube era verdade ou não e ela também nunca foi procurar.\n" +
    //             "Já em casa " + mainPersona.name + " encontra sua mãe e eles discutem um pouco sobre o dia, "+
    //             "após o papo sua mãe pergunta se ela quer comer, a janta do dia é xerém com galinha, " +
    //             "a preferida dela, mas depois da ultima coversa com Ícaro ela não está com vontade de nada, então" +
    //             "diz apenas que irá dormir. Em seus sonhos, " + mainPersona.name + " tem a visão de um mundo melhor, " +
    //             "cheio de árvores e vida mas que rapidamente é destruido por uma nuvem vermelha que engole tudo. "+
    //             "Já na parte da manhã " + mainPersona.name + "acorda atordoada, procurando sentido no que acabou de sonhar" +
    //             "parece ser mais tarde do que ela costuma acordar já que não ouve os barulhos tradicionais do "+
    //             "seu dia-a-dia, porém um estrondo urge no limiar da sua audição, estremecendo seus timpanos e " +
    //             "fazendo-o perder um pouco do seu equilibrio. " + mainPersona.name + "não sabe o que está acontecendo " +
    //             "mas logo logo irá descobrir que seu pesadelo irá se tornar realidade. " +
    //             "Fora de sua casa ela segue os sons de balas e gritos até que chega ao centro da vila e " +
    //             "encontra uma cena de desolação, as pessoas, que tanto lutaram pela sua sobrevivencia" +
    //             "familias que há mais de decadas vem se esfoçando o máximo para remanecer nas terras centenárias " +
    //             "de seus antepassados, agora estão caidos no chão, sem vida no olhar, nesse momento vem em sua mente " +
    //             "Ícaro, onde ele está, como ele está, ela empunha sua " + arma + "e vai à procura de seu amado. "+ 
    //             "No caminho ele faz algumas vitimas, pessoas estranhas vestidas de modo completamente diferente e " +
    //             "hostis.\n" +
    //             "Ao virar em uma pequena viela ela se depara uma uam cena que o faz perder novamente seu equilibrio " +
    //             "seu pai, caido no chão, sangrando e sem vida sob o sol daquela manhã. Isso enfurece-a e ela sai a " +
    //             "a procura de quem fez aquilo.");
    //             if (arma.equalsIgnoreCase("CARABINA")){
    //                 print(mainPersona.name + ", furtivamente anda pelas ruelas da vila, ocasionalmente atirando em mais algumas" +
    //                 "pessoas vestidas como aquele primeiro soldado, após alguns minutos ela finalmente se encontra "+
    //                 "com a origem de toda aquele caos " + "Uma mulher alta, proximo dos 1m80 esguia e com "+
    //                 "um rosto asustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
    //                 "ela pensa em atirar e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das" +
    //                 "casas. Prestes a atirar, ele vê o rosto de seu amado, que trás todo o corforto que elq procurava" +
    //                 "naquele momento.\n Ela contou a ele sobre seu pai e ele falou que perdeu sua mãe também, " +
    //                 "e que movido pelo luto decidiu que iria, naquele momento, embora dali, e convida " + mainPersona.name +
    //                 "para se juntar a ele. Nesse momento " + mainPersona.name + " se vê encurralada, ao mesmo tempo que " +
    //                 "ela deseja vingar a morte de seu pai, aquela é a hora perfeita para que os dois possam " +
    //                 "ter o mais próximo de uma vida normal naquele mundo tão surreal. Ela se vê sem tempo para " +
    //                 "tomar uma decisão, ela deseja ficar mas também deseja fugir na mesma intensidade. O que " +
    //                 mainPersona.name + " deverá fazer, ela deve FUGIR com sua amada ou FICAR e lutar?");
    //                 String decisao = leitor .nextLine();
    //                 if (decisao.equalsIgnoreCase("FUGIR")){
    //                     print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar no "+
    //                     " seu futuro. Ela diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
    //                     "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ela olha para "+
    //                     "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
    //                     "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
    //                     print("FIM DO CAPITULO 1");
    //                     print("EPÍLOGO");
    //                     print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
    //                     "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
    //                     "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
    //                     "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + "se depara com um " +
    //                     "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
    //                     "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
    //                     "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + "e Catarina foram bem recebiddos pelos "+
    //                     "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
    //                     "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
    //                     "não vendo sentido em fazer todo aquele esforço em vão.");
    //                     print("CINCO ANOS DEPOIS");
    //                     print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
    //                     "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
    //                     "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
    //                     "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
    //                     "porém o que ele descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que " +
    //                     mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
    //                     "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
    //                     "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + "se sente muito culpado" +
    //                     "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.");
    //                     print("FIM DA HISTÓRIA");
    //                 }
    //                 else{
    //                     print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar na "+
    //                     "sua familia. Ele diz não para o seu amor, e a vê partindo para longe de seus braços " +
    //                     "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
    //                     "morte de seu pai, ele faz uma prece a Padre Cícero e começa a procurar sua família e " +
    //                     "esquecer aquela que um dia foi seu grande amor.");
    //                     print("FIM DO CAPITULO 1");
    //                 }
    //             }
    //             else{
    //                 print(mainPersona.name + ", furtivamente anda pelas ruelas da vila, ocasionalmente atacando mais algumas" +
    //                 "pessoas vestidas como aquele primeiro soldado, após alguns minutos ele finalmente se encontra "+
    //                 "com a origem de toda aquele caos " + "Uma mulher alta, proximo dos 1m80 esguia e com "+
    //                 "um rosto asustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
    //                 "ele pensa em ataca-la e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das" +
    //                 "casas. Prestes a atirar, ele vê o rosto de sua amada, que trás todo o corforto que ele procurava" +
    //                 "naquele momento.\n Ele contou a ela sobre seu pai e ela falou que perdeu sua mãe também, " +
    //                 "e que movida pelo luto decidiu que iria, naquele momento, embora dali, e convida " + mainPersona.name +
    //                 "para se juntar a ela. Nesse momento " + mainPersona.name + " se vê encurralado, ao mesmo tempo que " +
    //                 "ele deseja vingar a morte de seu pai, aquela é a hora perfeita para que os dois possam " +
    //                 "ter o mais próximo de uma vida normal naquele mundo tão surreal. Ele se vê sem tempo para " +
    //                 "tomar uma decisão, ele deseja ficar mas também deseja fugir na mesma intensidade. O que " +
    //                 mainPersona.name + " deverá fazer, ele deve FUGIR com sua amada ou FICAR e lutar?");
    //                 String decisao = leitor .nextLine();
    //                 if (decisao.equalsIgnoreCase("FUGIR")){
    //                     print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar no "+
    //                     " seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
    //                     "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
    //                     "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
    //                     "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
    //                     print("FIM DO CAPITULO 1");
    //                     print("EPÍLOGO");
    //                     print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
    //                     "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
    //                     "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
    //                     "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + "se depara com um " +
    //                     "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
    //                     "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
    //                     "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + "e Ícaro foram bem recebiddos pelos "+
    //                     "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
    //                     "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
    //                     "não vendo sentido em fazer todo aquele esforço em vão.");
    //                     print("CINCO ANOS DEPOIS");
    //                     print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
    //                     "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
    //                     "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
    //                     "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
    //                     "porém o que ele descobre lhe causa uma tristeza profunda. O viajante conta que o mulher que " +
    //                     mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
    //                     "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
    //                     "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + "se sente muito culpado" +
    //                     "e se isola por anos pois se sente de certa forma culpada pelo que aconteceu à sua familia.");
    //                     print("FIM DA HISTÓRIA");
    //                 }
    //                 else{
    //                     print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar na "+
    //                     "sua familia. Ela diz não para o seu amor, e o vê partindo para longe de seus braços " +
    //                     "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
    //                     "morte de seu pai, ela faz uma prece a Padre Cícero e começa a procurar sua família e " +
    //                     "esquecer aquele que um dia foi seu grande amor.");
    //                     print("FIM DO CAPITULO 1");
    //                 }
    //             }
    //         }
    //     leitor.close();
    //     }
    // }


                
            
    
        // else{
        //     print("In a wasteland future, the potable water of the planet has gone\n" +
	    //                     "the polar ice caps melted and the ocean drowned most of the cities,\n" +
        //                     "killed billions and forced the left citizen to search in the countryside\n" +
        //                     "a way to live. In a small city, in Brazilian's Sertão,\n" +
        //                     "a hero has to choose between love and fight.\n" +
        //                     "Welcome to In Sertão's Sands");
        //     print("In this section we're going to choose a few aspects\n" +
        //                     "of your character, as name, gender and favorite weapon. Let 's start.");
        //     print("Is your character a MAN or a WOMAN?");
        //     String man = ("MAN");
        //     String gender = leitor .nextLine();

        //     if (gender.equalsIgnoreCase(man)){
        //         print("What will be the name of your character?");
        //         String name = leitor .nextLine();
        //         print("Okay, will call him " + name);
        //         print("Now we're going to chose your favorite weapon, you have three choices: \n"+
        //         "The CARABINA is a long distance fire gun, with a size of 3ft2 and and 2.1 inc bullets "+
        //         "was spread used in 20th Century by Cangaceiros and Vaqueiros,\n" +
        //         "The PEIXEIRA will be your hand-to-hand weapon, with a 11.8 inc blade stuck in a handle made of" +
        //         "Jaguatirica's left skull, this one can help you in close combat with the several enemies "+
        //         "your journey.\n"+
        //         "Your last choice is the MANDALA, a mystical weapon with ancient writting "+
        //         "that channel the natural element's energy "+
        //         "as the São Francisco's waters and the sertão's scorching sand and releases as " +
        //         "torrentials freezing waterror energy as hot as the sun.");
        //         print("Which weapon would you rather? CARABINA, PEIXEIRA or MANDALA?");
        //         String weapon = leitor .nextLine();
        //         print("Now we have everything we can start our advnture\n"+
        //         "Welcome to Nas areias do Sertão");
        //         print("Chapter 1: The East Invasion");
        //         print("In the year 35 a.F (after the Flood), the young " + name +
        //         " lives one day after other, whti limited resources\n" + 
        //         "and a few chances to survive\n"+
        //         "there's a few joyfull moments, one of them is when he get together with his love Catarina,\n" +
        //         "daugther of Capitain Hermenegildo, who became the land around the river leader's in\n"+
        //         "the second year after the big flood and conflicts directly with our heroe's family,\n"+
        //         "that's the reason every couple's meetings are secret,\n" +
        //         "in a secred area that the old ones avoy to be becouse of the place's spiritual.\n" +
        //         "In one of these getting together, Catarina propose a crazy idea\n" +
        //         "'- If we run away?' she says, excited!\n" +
        //         "'- Where would we go? Everywhere is just like here, says " + name + " with a sad voice 'The World " +
        //         "ends Catarina.'\n" +
        //         "'- But doesn't to be like this, secret rendezvous, always in this old place, we could be happy,\n" +
        //         " you know? There's a place, where the salt water didn't kil the rivers, where's life and hope'\n"
        //         + name + " keep quiet, everything he most want is to flee from that place, from those people.\n " +
        //         "'- We could escape from my father' Catarina syas, after notice her loved pauses\n" +
        //         "she knows how delicate is this subject and bring this up wil me him think about it.\n" +
        //         "'- I think we should go, it's getting late!' " + name + " get up and say goodbye.\n" +
        //         "'- I see you tomorrow, okay?' they kiss and " + name + " goes away.\n" +
        //         "In the way to home " + name + " think a lot about what Catarina said, he already heard about " +
        //         "Paradiso, a place where the salted water didn't destroyed life, but this place " +
        //         "is just a mith, through the years several travelers past through his family's land and " +
        //         "always starving and thristy, and always talking about this placeand it' wonders, but he never " +
        //         "knew if was true of not and he never went to find this place.\n" +
        //         "At home " + name + " find his mom and they talk about their day, "+
        //         "after the chat she ask if he want to eat, today dinner is buchada, his favorite, but "+
        //         "after his last talk with Catarina his isn't in the mood for anything, so " +
        //         "he's just go to sleep. In his dreams, " + name + " has a vision of a better world, " +
        //         "full of trees and life, but quickly destroyed by a red cloud who swallows everything. "+
        //         "In the morning " + name + "awakes dizzy, looking for meanng in his dream" +
        //         "seems later than he arre used to wake becouse he's not hearing the usual daily noises, "+
        //         "but a runble came from his hearing threshold shaking his eadrum and " +
        //         "making him lose his balance. " + name + "doesn't know what is happening " +
        //         "but very soon willl find out his nightmare will become reality. " +
        //         "Outside the hose he follow the bullet and scream sounds untill he made to the village's center and " +
        //         "see aheartbreaking scene, the people, who fought bravely for them survival," +
        //         "decades of families who was trying to thrive in them centurys ancestors land, " +
        //         "now are laid on the ground, eyes lifeless, in this moment Catarina comes to his mind, " +
        //         "where she is? how shw is? he equips his " + weapon + "and go in the look for his loved one. "+ 
        //         "In the way he make some casualties, weird people dressed completely different and very hostiles " +
        //         "When he turn a narrow street he face a scene that makes he lose his balanc again" +
        //         "his dad, laid on the ground, bleeding and lifeless, under that morning's sun.This make him enraged" +
        //         "and goes to find who did this.");
        //         if (weapon.equalsIgnoreCase("CARABINA")){
        //             print(name + ", furtively walks through the village's narrow streets, ocasionally shooting some " +
        //             "people dressed like that first soldier, after a few minutes he finally see himsilf upfront "+
        //             "the chaos origin. " + "A tall woman, near 5ft9, slender, with a horrific face ordering "+
        //             "her men an women to take her all the survivers. He thought shooting her an and all that but,  " +
        //             "suddenly he's pulled inside one of the houses. Ready to shoot he see the face of his lover" +
        //             "that brings all the confort that he needs in that moment. He told her about his father " +
        //             "and she told him that she lose her mother too and shaken becouse the grief she decided, to leave " +
        //             "in that moment , and ask " + name + "to join her. In this moment" + name + "see himself trapped" +
        //             "at the same time he want to revange his father's death, that's the perfect time for the two to" +
        //             "have the closest thing to a normal life in that surreal world." +
        //             "He see out of time to make a decision, he want to stay but in the same intensity  " +
        //             "he want to leave. What should " + name + " do, will he LEAVE with his loved one " +
        //             "or STAY and fight?");
        //             String decision = leitor .nextLine();
        //             if (decision.equalsIgnoreCase("LEAVE")){
        //                 print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar no "+
        //                 " seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
        //                 "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
        //                 "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
        //                 "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
        //                 print("FIM DO CAPITULO 1");
        //                 print("EPÍLOGO");
        //                 print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
        //                 "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
        //                 "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
        //                 "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + "se depara com um " +
        //                 "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
        //                 "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
        //                 "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + "e Catarina foram bem recebiddos pelos "+
        //                 "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
        //                 "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
        //                 "não vendo sentido em fazer todo aquele esforço em vão.");
        //                 print("CINCO ANOS DEPOIS");
        //                 print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
        //                 "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
        //                 "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
        //                 "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
        //                 "porém o que ele descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que " +
        //                 mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
        //                 "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
        //                 "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + "se sente muito culpado" +
        //                 "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.");
        //                 print("FIM DA HISTÓRIA");
        //             }
        //             else{
        //                 print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar na "+
        //                 "sua familia. Ele diz não para o seu amor, e a vê partindo para longe de seus braços " +
        //                 "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
        //                 "morte de seu pai, ele faz uma prece a Padre Cícero e começa a procurar sua família e " +
        //                 "esquecer aquela que um dia foi seu grande amor.");
        //                 print("FIM DO CAPITULO 1");
        //             }
        //         }
        //         else{
        //             print(mainPersona.name + ", furtivamente anda pelas ruelas da vila, ocasionalmente atacando mais algumas" +
        //             "pessoas vestidas como aquele primeiro soldado, após alguns minutos ele finalmente se encontra "+
        //             "com a origem de toda aquele caos " + "Uma mulher alta, proximo dos 1m80 esguia e com "+
        //             "um rosto asustador ordenando a seus homens e mulheres que levem a ela os sobreviventes " +
        //             "ele pensa em ataca-la e acabar com tudo aquilo, quando subitamente é puxado para dentro de uma das" +
        //             "casas. Prestes a atirar, ele vê o rosto de sua amada, que trás todo o corforto que ele procurava" +
        //             "naquele momento.\n Ele contou a ela sobre seu pai e ela falou que perdeu sua mãe também, " +
        //             "e que movida pelo luto decidiu que iria, naquele momento, embora dali, e convida " + mainPersona.name +
        //             "para se juntar a ela. Nesse momento " + mainPersona.name + " se vê encurralado, ao mesmo tempo que " +
        //             "ele deseja vingar a morte de seu pai, aquela é a hora perfeita para que os dois possam " +
        //             "ter o mais próximo de uma vida normal naquele mundo tão surreal. Ele se vê sem tempo para " +
        //             "tomar uma decisão, ele deseja ficar mas também deseja fugir na mesma intensidade. O que " +
        //             mainPersona.name + " deverá fazer, ele deve FUGIR com sua amada ou FICAR e lutar?");
        //             String decisao = leitor .nextLine();
        //             if (decisao.equalsIgnoreCase("FUGIR")){
        //                 print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar no "+
        //                 " seu futuro. Ele diz sim para o amor e para sua amada, juntos eles conseguem chegar ao limiar" +
        //                 "da cidade, abatendo alguns poucos soldados, quando chegam ao fim da cidade ele olha para "+
        //                 "trás e vê ali onde um dia chamou de lar, mas agora não é hora de se lamentar, eles começam" +
        //                 "a correr sem olhar para trás, sem olhar para o que agora é seu passado.");
        //                 print("FIM DO CAPITULO 1");
        //                 print("EPÍLOGO");
        //                 print("Após dias caminhando no sol escaldante, sem perspectiva de quando acharão a "+
        //                 "tal terra prometida, o nosso casal é salvo por um vaqueiro desconhecido que os leva "+
        //                 "na garupa do seu cavalo, ao sentarem no animal ambos desmaiam de exaustão, se questionando "+
        //                 "se deveriam mesmo ter tido aquela atitude. Após acordar " + mainPersona.name + "se depara com um " +
        //                 "lugar que nem em sonho conseguria idealizar, não se via um sinal de seca, de areia ou de " +
        //                 "desolação, grama verde percorria todo o espaço até perder a vista, árvores e uma água cristalina "+
        //                 "cobriam cada m² de beleza deslumbrante. " + mainPersona.name + "e Catarina foram bem recebiddos pelos "+
        //                 "locias que os alimentaram e ensinaram os valores e regras de Paradiso, ao fim foram " +
        //                 "perguntados se gostariam de ficar na comunidade e se juntar a eles, o que ambos assentiram" +
        //                 "não vendo sentido em fazer todo aquele esforço em vão.");
        //                 print("CINCO ANOS DEPOIS");
        //                 print("Após vivendo em perfeita harmonia durante cinco anos, os habitantes de Paradiso" +
        //                 "são surpreendidos por um novo morador, um dos vaqueiros da comunidade recolhe uma pessoa " +
        //                 "que estava caída em algum lugar do deserto do sertão, quando o viajante recobra os sentidos" +
        //                 "afim de saber o destino de sua família " + mainPersona.name + " o questiona da situação na sua vila, " +
        //                 "porém o que ele descobre lhe causa uam tristeza profunda. O viajante conta que o mulher que " +
        //                 mainPersona.name + "viu cinco anos atrás era na verdade uma conquistadora de terras, que ia aos poucos " +
        //                 "subjulgando e escravizando as vilas e pequenas cidades ao longo do São Francisco e que " +
        //                 "esse teria sido o fim de sua vila e sua família. " + mainPersona.name + "se sente muito culpado" +
        //                 "e se isola por anos pois se sente de certa forma culpado pelo que aconteceu à sua familia.");
        //                 print("FIM DA HISTÓRIA");
        //             }
        //             else{
        //                 print("Apesar da dor naquele momento, " + mainPersona.name + "decide que deve ser racional e pensar na "+
        //                 "sua familia. Ele diz não para o seu amor, e a vê partindo para longe de seus braços " +
        //                 "sem olhar para trás. A partir dali ele decide procurar sua mãe e sua irmã, e vingar a "+
        //                 "morte de seu pai, ele faz uma prece a Padre Cícero e começa a procurar sua família e " +
        //                 "esquecer aquela que um dia foi seu grande amor.");
        //                 print("FIM DO CAPITULO 1");
        //             }
        //         }
        //     }
            
        //     else{
        //         print("What will be the name of your character?");
        //         String name = leitor .nextLine();
        //         print("Okay, will call her " + name);
        //         print("Now we're going to chose your favorite weapon, you have three choices: \n"+
        //         "The CARABINA is a long distance fire gun, with a size of 3ft2 and and 2.1 inc bullets "+
        //         "was spread used in 20th Century by Cangaceiros and Vaqueiros,\n" +
        //         "The PEIXEIRA will be your hand-to-hand weapon, with a 11.8 inc blade stuck in a handle made of" +
        //         "Jaguatirica's left skull, this one can help you in close combat with the several enemies "+
        //         "your journey.\n"+
        //         "Your last choice is the MANDALA, a mystical weapon with ancient writting "+
        //         "that channel the natural element's energy "+
        //         "as the São Francisco's waters and the sertão's scorching sand and releases as " +
        //         "torrentials freezing waterror energy as hot as the sun.");
        //         print("Which weapon would you rather? CARABINA, PEIXEIRA or MANDALA?");
        //         String weapon = leitor .nextLine();  

