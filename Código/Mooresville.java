import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Mooresville{

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        //danos

        double danoMorte = 100;
        double criticalhit = 120;
        double danoVsDog = 20;
        double mordida = 15;
        double boca = 10;
        double queda = 9;
        double danoInicio = 5;
        double raspao = 3;
        // vida e dano personagem
        double vida = 100;
        double damage10 = vida - boca;
        double damage3 = vida - raspao;
        double damage9 = vida - queda;
        double damage5 = vida - danoInicio;
        double damage15 = vida - mordida;
        double damage20 = vida - danoVsDog;
        double damage100 = vida - danoMorte;
        //final dano jogador

        //mobs e  suas vidas
        double vidaCachorro = 100;
        double tiotyler = 140;
        //dano mob cachorro.
        double danochutedog = 50;
        double bicuda = vidaCachorro - danochutedog;
        double matadog = vidaCachorro - criticalhit;
        double batecabeca = vidaCachorro - danoMorte;
        //dano tio tyler
        double vidatyler10 = tiotyler - boca;
        double vidatyler15 = tiotyler - mordida;
        double vidatyler20 = tiotyler - danoVsDog;
        double vidatyler100 = tiotyler - danoMorte;
        double vidatylercritico = tiotyler - criticalhit;

        int temp_dialoglong = 7;
        int temp_dialogshort = 3;
        String start;
        while (true) {

            System.out.println(";█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█   █▀▄▀█ █▀█ █▀█ █▀█ █▀▀ █▀ █░█ █ █░░ █░░ ");
            System.out.println(";▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█   █░▀░█ █▄█ █▄█ █▀▄ ██▄ ▄█ ▀▄▀ █ █▄▄ █▄▄ ██▄");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼┼┼█████┼┼┼┼┼█████");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼┼┼┼▒▒▒┼┼┼┼┼┼┼▒▒▒");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼┼┼┼▒▒▒┼┼┼┼┼┼┼▒▒▒");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼┼┼░▒░▒░▒░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼┼░▒░▒░▒░▒░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼┼░▒░▒░▒░▒███▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼┼┼░▒░▒░▒░▒█████▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼┼░▒░▒░▒░▒░█░█░█░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼░▒░▒░▒░▒░▒█████▒░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░▒░");
           System.out.println("                         ┼┼┼┼┼┼┼▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("                         ┼┼┼┼┼┼┼▒▒▒███▒▒▒▒▒███▒▒▒▒▒███▒▒▒");
           System.out.println("                         ┼┼┼┼┼░┼░▒█░█░█▒▒▒█░█░█▒▒▒█░█░█▒▒");
           System.out.println("                         ┼┼┼┼░░░░░█████▒▒▒█████▒▒▒█████▒▒");
           System.out.println("                         ┼░░┼░░░░░█░█░█▒▒▒█░█░█▒▒▒█░█░█▒▒");
           System.out.println("                         ░░░░░░░░▒█░█░█▒▒░░░░░░░▒▒█░█░█▒▒");
           System.out.println("                         ░░░░░░░░▒░░███▒▒░█░█░█░▒▒█████▒▒");
           System.out.println("                         ┼░░░░█░░░░░░▒▒▒▒░█░█░█░▒▒▒▒▒▒▒▒▒┼┼█");
           System.out.println("                         ░█░░██░░░░░░▒▒▒▒░░░░░░░▒▒▒▒▒▒▒▒▒┼███");
           System.out.println("                         ░██░██░█░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████");
           System.out.println("                         ░░░█████░░░▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒┼░░░┼");
           System.out.println("                         ░░░████░░░███▒▒▒░░█░█░░▒▒▒███▒▒▒┼░░░┼");
           System.out.println("                        ┼░░███┼▒▒█░█░█▒░░██░██░░▒█░█░█▒▒┼░░░┼");
           System.out.println("                        ┼┼░███┼▒▒█████▒░███░███░▒█████▒▒┼███┼");
           System.out.println("                        ┼┼┼███┼▒▒█░█░█▒░███░███░▒█░█░█▒▒┼┼█┼┼");
           System.out.println("                        ┼┼┼███┼▒▒█░█░█▒░███░███░▒█░█░█▒▒┼┼█┼┼");
           System.out.println("                        ┼┼┼███┼▒▒█████▒░███░███░▒█████▒▒┼┼█┼┼");
           System.out.println("                        ┼┼┼███┼▒▒▒▒▒▒▒▒░███░███░▒▒▒▒▒▒▒▒┼┼█┼┼");
           System.out.println("                        ┼┼┼███┼▒▒▒▒▒▒▒▒░███░███░▒▒▒▒▒▒▒▒┼┼█┼┼");
           System.out.println("                        ┼░████░▒▒▒▒▒▒▒▒░███░███░▒▒▒▒▒▒▒▒┼┼█┼┼");
           System.out.println("                        ░░░┼░░░▒▒▒▒▒▒▒▒░███░███░▒▒▒▒▒▒▒▒┼┼█┼┼");
           System.out.println("                        ░░░░░░░░┼░░░┼░░▒▒▒▒▒▒▒▒▒░░░░░░░░░███┼");
           System.out.println("                        ┼░░░░┼░░░░░┼░░▒▒▒▒▒▒▒▒▒▒▒░░┼░░░░░███┼");
           System.out.println("                        ░░░░░░░░┼░░░┼▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░███┼");
           System.out.println("                        ░░░┼░░░░░░░░░░░┼░░░┼░░░░░░░░┼░░░░░░░░");
            System.out.println("             *Dentro do jogo digite o numero referente a sua escolha*");
            System.out.println("                    ----------DIGITE START PARA COMEÇAR--------");
            start = scan.nextLine();
            if (start.equals("start")) {
                System.out.println("""
                                   Meu tio Tyler era uma das personalidades mais bizarras que se pode imaginar, mas nem sempre ele foi assim. 
                                   Nós nunca fomos realmente muito próximos, porém ele sempre aparecia para ver minha vó. depois daquela porcaria que aconteceu com ele... ele sumiu. 
                                   Minha v\u00f3 vivia dizendo:
                                   Minha vó sempre o defendia.
                                  
                                   - Ele é um homem ocupado e reservado, não tem como vir visitar a gente, porém ele é um dos melhores cientistas deste país. - Dizia ela. 
                                   Minha vó também vivia me contando histórias sobre ele: 
                                   “Quando mais novo, seu tio Tyler era um homem muito estressado e mal conseguia um projeto aprovado na sua empresa, ainda bem que ele encontrou uma mulher boa para concertar ele. 
                                   Suzana fez seu tio mudar por completo, isso foi ótimo, eu nunca o vi tão feliz na minha vida, depois dela ele também cresceu muito como cientista na empresa.” 
                                   Em um churrasco quando eu tinha 9 anos eu percebi que tio Tyler tinha uma mania de ficar murmurando uma música, perguntei para ele que música era essa e me respondeu com um sorriso no rosto: 
                                   
                                  - oiiii garotão, essa música é que minha esposa fez quando completamos 1 ano de casados, fomos ao caribe. 
                                   Na viagem, escutei ela no barco muitas vezes, essa música grudou na minha cabeça e agora vivo a murmurá-la até hoje, porque amo ela... tanto a música quanto minha Suzana. 
                                   ......
                                   Ele era tão feliz e sorridente com aquela mulher, eles estavam prestes a ter um filho quando aconteceu. 
                                   Um certo dia, Suzana saiu de carro para fazer algumas compras de essênciais e um caminhoneiro bêbado bateu no carro dela. O bebê e ela morreram na hora. 
                                   A última vez que vi meu tio Tyler foi no enterro de Suzana, ele chorava na frente do caixão e murmurava aquela mesma música. 
                                   Após esse ocorrido ele ficou estranho....  
                                   
                                   Quando eu tinha 15 anos, tio Tyler mudou-se para o sul, e desde então tive poucas “notícias” sobre ele.
                                   se é que se pode chamar algumas cartinhas de Feliz natal de notícias, já faz mais de 5 anos que não o vejo. 
                                  Então você pode imaginar meu estado de surpresa em me encontrar dentro do meu carro, dirigindo em direção a Mooresville, uma cidadezinha pacata no norte do Alabama com incríveis 60 habitantes... 
                                   Rumo a casa do meu tio Tyler.
                                   Chegando ao endereço que me foi passado, me encontro parado em frente a enorme casa de 2 andares
                                   que parecia ter saído de um seriado de comédia dos anos 60. 
                                   
                                   Tyler, que naquela altura já estava a 6 anos sem dar nenhum sinal de vida, me ligou numa manhã de segunda-feira e pediu-me que fosse até Mooresville;
                                    ele teria que viajar a um congresso de ciências no Rio de Janeiro e não tinha mais ninguém que pudesse cuidar de seus “animais” enquanto ele estivesse fora.  
                                Animais... Lembro de minha mãe dizer que ele odiava qualquer tipo de animal, o que será que o levou a mudar de ideia, e agora criar animais em sua casa, pensando bem...
                                   Ele sequer citou qual tipo de animais ele tinha aqui, eu mal sei o que estou
                                   fazendo aqui, onde raios estava com a cabeça de achar que isso seria um boa ideia, mas ele parecia estar realmente precisando de minha ajuda. )""");

                 System.out.println("Insira seu nome");
                String nome = scan.nextLine();
                System.out.println("senhora misteriosa :");
                System.out.print(nome + "? " + nome + " Dawson, sobrinho do Tyler Dawnson?  ");
                System.out.println(" Disse uma voz rouca, com um forte e típico sotaque caipira do sul, me tirando do transe em que eu estava.");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println(" (Quanto tempo eu tinha ficado parado ali, encarando a porta?)");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println(nome + ":");
                System.out.println("- Sim, sou eu! ");

                System.out.println(" Digo me virando, para encarar uma senhora, de aparentemente uns 65 anos, com um vestido preto bordado, que parecia uma obra da Guerra de Secessão. A senhora também segurava um gato preto em uma mão e uma carta selada na outra. ");
                TimeUnit.SECONDS.sleep(temp_dialoglong);
                System.out.println("senhora misteriosa :");
                System.out.println("- Prazer, Me chamo Joanna Smith. Moro nessa casa aqui em frente, é um prazer te conhecer garoto, na verdade, é um prazer conhecer qualquer parente do Tyler, ele costuma ser um homem tão solitário... ");
                TimeUnit.SECONDS.sleep(temp_dialoglong);
                System.out.println(nome + ":");
                System.out.println(" - Pois é.... tio Tyler consegue ser uma pessoa bem retraída as vezes!. ");
                System.out.println(" Digo eu, demonstrando uma intimidade inexistente.");
                TimeUnit.SECONDS.sleep(temp_dialoglong);
                System.out.println("Joanna:");
                System.out.println("- A anos que somos vizinhos e nunca vi ele conversar com ninguém, ou levar alguém a sua casa...  ");
                System.out.println(" Bom, imagino que você esteja cansado da viagem e não vou ficar te incomodando com minha conversa mole. Esse é o gato de Tyler, Apolo, e Tyler também deixou esta carta para você com algumas instruções...");
                TimeUnit.SECONDS.sleep(temp_dialoglong);
                System.out.print(nome + ":");
                System.out.println("- Muito obrigado, Sra. Joanna! ");
                System.out.println("Digo pegando a carta e começando a abrir o selo. ");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println("Joanna:");
                System.out.println("- ESPERA! ");
                System.out.print(" Gritou mudando completamente de expressão, aquela Aura amigável havia sumido.");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println("– Tyler me pediu para aconselhá-lo a abrir a carta só quando estivesse dentro de casa...");
                System.out.println(" empurrou o gato preto em minhas mãos, virou suas costas e em um passo acelerado voltou para sua casa e bateu a porta sem dizer mais nada. ");
                TimeUnit.SECONDS.sleep(temp_dialoglong);
                System.out.print(nome + ":");
                System.out.println(" (Tudo isso que acabou de acontecer foi muito estranho... aquela senhora que antes parecia tão amigável, subitamente mudou... sua expressão parecia de.... medo! ) ");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println(">O que você quer fazer?<");
                System.out.println(">1-Entrar na casa<");
                System.out.println(">2-Investigar terreno<");
                int investigar = scan.nextInt();

                if (investigar == 2) {
                    
                
                
                    
                    System.out.println("depois de me perder por mais alguns minutos em meus pensamentos, decido dar uma olhada em volta do velho terreno da casa. ");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println("Atrás da casa havia um jardim, com plantas que pareciam que não viam um Regador a séculos...");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println(" Enquanto estou olhando, ouço um barulho atrás de um dos arbustos, e enquanto me aproximo para ver o que era, sinto uma aflição imensa... parece que algo não está certo...");
                    TimeUnit.SECONDS.sleep(temp_dialoglong);
                    System.out.println("Apollo:");
                    System.out.println("-!!!!!!!!! GHWIII MEEEEOOOWM!!!!");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.print(nome + ":");
                    System.out.println("minha alma quase sai do meu corpo, de tão grande susto que levei, eu estava tão desligado que até me esqueci que o bendito gato estava comigo. ");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println(">O que você quer fazer?<");
                    System.out.println(">1-Investigar arbusto<");
                    System.out.println(">2-Voltar para a casa<");

                    int arbusto = scan.nextInt();

                    if (arbusto == 1) {

                        System.out.println(" me agacho na frente do arbusto,  coloco meu braço esquerdo dentro para ver se encontro algo");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                        System.out.println("PLAK");
                        System.out.println("você prendeu o dedo na ratoeira que ali estava e gritou de dor e  susto");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                        System.out.print("dano: ");
                        System.out.println(danoInicio);
                        System.out.print("total de vida restante:");
                        System.out.println(damage5);
                        System.out.print(nome);
                        System.out.println(":");
                        System.out.println("-PUTA QUE PARIU, MEU DEDO!!!");
                        TimeUnit.SECONDS.sleep(temp_dialoglong);
                        System.out.println("após tirar a ratoeira de seu dedo, você anda até a entrada da casa resmungando e xingando.");
                        TimeUnit.SECONDS.sleep(temp_dialoglong);
                        System.out.println("você entra na casa e fecha com pressa a porta, a dor excruciante em seu dedo ainda te atormenta");

                    }
                    if (arbusto == 2) {

                        System.out.print(nome + ":");
                        System.out.println(" - Melhor não mexer nisso, cidade de interior sai cobra até de dentro do bolso, vai saber que diabo tem ai,melhor entrar e ler a carta de uma vez.");
                        System.out.println("diz resmugando pra sí mesmo");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                        System.out.println("você anda até a parte de frente da casa e abre a porta");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                    }

                }
                if (investigar == 1) {
                    System.out.print(nome + ":");
                    System.out.println("- Melhor entrar de uma vez na casa, já perdi muito tempo aqui fora.");
                    System.out.println("você diz, caminhando até a porta e abrindo-a.");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                }
                // if > explorar hall

                System.out.println("O Hall da casa era imenso, com três portas que levavam a cômodos diferente, no teto, um lustre que provavelmente compraria o meu sedan velho.  ");
                System.out.println(" no chão tinha um grande tapete persa, que se estendia até o pé de uma escada de aproximadamente 30 degraus, tudo que eu sabia sobre a profissão de meu tio, era que ele era um renomado cientista, mas eu realmente não fazia ideia de qual era sua área de atuação ");
                System.out.println("bom, agora sei que a remuneração deve ser excelente.");
                System.out.println("volto a realidade quando então apollo saltou do meu colo e correu e subiu as escadas");
                //fim do if do hall.

                //if subir as escadas
                System.out.println(">O que você quer fazer?<");
                System.out.println(">1-Subir escadas<");

                int nextmove = scan.nextInt();

                if (nextmove == 1) {

                    System.out.println(" decido subir  para ir atras do gato e ver como era a parte de cima da casa.");
                    System.out.println("subindo as escadas escuto um barulho, me deparo com um rápido vulto passando em minha frente, fingo não ter visto nada.");
                    System.out.println("o corredor a minha frente  leva a 4 quartos diferentes, 3 portas simples de um lado e do outro, uma entrada grande com uma porta dupla, uma suíte master da casa. ");
                    System.out.println("decido me mover e sigo andando em frente, derrepente  escuto um barulho de batida, Logo percebo que está extremamente escuro no segundo andar.");
                    System.out.println("olho para meu relógio e vejo que ainda são 15:00. Logo começo a transpirar e sentir a estranha sensação de que não estou sozinho,  sou acometido de uma grande aflição");
                    System.out.println(" olho em volta e para meu alívio encontro um interruptor de luz, assim que o aciono, as luzes do corredor se acendem e instantaneamente aquela estranha sensação passa.");
                    System.out.println("eu nunca fui de acreditar no sobrenatural, mas cada minuto em que eu passava nessa casa, me fazia entrar em choque com minhas crenças pessoais.");

                }

                //fim if subir escadas
                //if investigar primeira porta
                while (true) {
                    System.out.println(">O que você quer fazer?<");
                    System.out.println(">1-Investigar primeira porta<");
                    System.out.println(">2-Investigar segunda porta<");
                    System.out.println(">3-Investigar terceira porta<");
                    System.out.println(">4-Investigar Ultima porta<");
                    int investigar1 = scan.nextInt();
                    if (investigar1==1){
                        System.out.println("vou em rumo a primeira porta ,  após girar a maçaneta, tenho  acesso ao quarto, sinto uma mudança de temperatura incrível, o quarto era extremamente gelado");
                        System.out.println(" nele possuía uma porta que eu imagino levar ao banheiro;");
                        System.out.println("Olho rapidamente para o closet que estava aberto e minha alma congela quando penso ter visto um par de olhos me encarando de dentro da escuridão que envolvia aquele closet...");
                        System.out.println(" Quando firmo meu olhar na direção em que pensei ter visto os olhos, não havia nada lá. Após isso, decido fechar a porta da suíte e verificar os outros quartos.");
                        System.out.println("As duas portas mais ao fundo estavam trancadas, o que me levava ao primeiro quarto do corredor. minha última chance, nem morto eu dormiria naquela suíte.");
                    }
                    if (investigar1==2) {
                        System.out.println("A porta está trancada");

                    }

                    if (investigar1==3) {
                        System.out.println("A porta está trancada!");
                    }
                    //fim if investigar primeira porta.               

                    // if ultima porta
                    if (investigar1==4) {
                        System.out.println("ando para ultima porta não aberta, giro a maçaneta, a porta se abre e dou de cara com um quarto humilde, que possuia uma cama, uma prateleira de vasos a cima da cama");
                        System.out.println("um armário pequeno e uma escrivaninha com uma cadeira. Coloco, finalmente, minha mochila no chão e vou em direção a janela na intenção de abri-la para aliviar um pouco do cheiro de mofo presente no quarto");
                        System.out.println("Quando chego a janela, olho para baixo, vejo Joanna, parada na calçada olhando para mim, ela não parecia ter expressão nenhuma em seu rosto.");
                        System.out.println("fiquei sem reação, porém só conseguia lhe encarar de volta, eu queria parar de encará-la, porém meus músculos não respondiam aos comandos, eu não conseguia me mover, estava completamente paralisado. ");
                        System.out.println(" Depois de intermináveis segundos parado ali, sem que nenhum de nós dois nos movessemos, Joanna simplesmente virou a cabeça como se ouvisse algo, e começou a caminhar na direção do suposto. ");
                        System.out.println("percebi que estou muito nervoso desde que cheguei e decido sentar na cama para respirar..");
                        System.out.println("ouço um barulho em cima de mim e logo então na tentativa de olhar pra cima minha vista e coberta e levo uma forte pancada na cabeça, sinto minha energia esvaecer e minha vista ficar escura.");
                        vida = vida - 20;
                        break;
                    }
                }
                //desmaiar e fim if ultima porta.
                //adicionar 20 de dano pois um vaso acabou de cair na cabeça do homi

                //acordando
                System.out.println("Acordei deitado no chão, primeiramente não reconheci o ambiente em que estava, olhei para meu relógio e eram 2:45 da manhã");
                System.out.println(" eu estava no escuro e logo aquela aflição encontrou seu caminho de volta até mim. Quase entro em desespero completo quando percebo que estou dentro da suíte, no escuro total e acordado no meio da noite.");
                System.out.println("Logo após ter essa realização, eu escuto uma voz.");
                System.out.println("voz rouca misteriosa :");
                System.out.print("-faz muito  tempo não vejo  te vejo jovem  " + nome);
                System.out.println("a voz retumbava de todos os cantos do quarto sem deixar pista de onde se originára.");
                System.out.println(nome + ":");
                System.out.println("- Q… Quem está aí? ");
                System.out.println("respondo vacilante, porém sou acometido por nada além de silêncio. ");
                System.out.println("eu sinto uma mão tocar meu ombro, agora com meus olhos acostumados com a escuridão, corro até a direção da porta e saio para o corredor.");
                System.out.println(" este que estava iluminado, olho para trás, para dentro do quarto escuro e vejo apenas uma silhueta que não consigo definir o que era, me olhando e indo para trás até sumir na escuridão. Era como se a coisa não tivesse a forma...");
                System.out.println("Quando me viro para o corredor, percebo uma peculiaridade. As portas dos demais quartos, que estavam trancadas, agora estavam abertas… abertas não, escancaradas.");
                System.out.println("Me aproximo e entro no primeiro quarto.  Ele estava completamente destruído, os móveis virados de cabeça para baixo e no chão havia um lampião, então eu me abaixo e pego-o, nunca se sabe quando vai precisar...");
                //ler carta:
                System.out.println(">O que você quer fazer?<");
                System.out.println(">1-ler carta<");
                int ler = scan.nextInt();

                if (ler==1) {

                    System.out.println("ao agachar a carta de tio tyler cai de meu bolso, pego ela rapidamente do chão e começo a ler.");
                    System.out.println("carta:");
                    System.out.println("“ Olá, garotão. Espero que esteja tudo bem. Sei que tenho sido muito ausente nos últimos anos e gostaria que as coisas tivessem sido diferentes, mas não posso mudar o que já passou.");
                    System.out.println(" Gostaria que houvesse outro jeito, um jeito em que eu não precisasse te envolver nisto, porém, o avanço científico que proporcionará, está acima de qualquer vínculo entre nós. Espero que me perdoe. ");
                    System.out.println(" Voltarei dentro de 3 dias, uma vez dentro da casa, você não poderá sair mais. Não se preocupe, na dispensa tem tudo que você vai precisar nesses tempo. Se você quiser sobreviver, precisará seguir estas regras abaixo:");
                    System.out.println(">Sempre que andar pela casa, garanta que você tenha uma lanterna, quedas de e luz são comuns por aqui. ");
                    System.out.println(">Não fique no escuro total por mais de 2 minutos, quando dormir deixe um abajur ligado e garanta que não vai acordar no meio da noite, caso acorde, não abra os olhos.");
                    System.out.println("> Caso tenha uma queda de luz e sua lanterna não funcione, corra para dentro do banheiro da suíte master no segundo andar, eles não podem entrar lá.");
                    System.out.println("> Durma no banheiro nessa noite, pela manhã, tudo deve estar mais tranquilo.");
                    System.out.println(" caso você ouça um suspiro profundo e passos, espere até que os passos fiquem distantes.");
                    System.out.println(">Por fim, não abra a porta na cozinha que dá ao porão, ela deve permanecer fechada todo tempo, caso em qualquer um dos dias você a veja aberta, entre no banheiro   e fique lá até eu voltar. ");
                    System.out.println(">NÃO DURMA NA SUITE MASTER.");
                    System.out.println("Seguindo essas regras, tudo deve ficar bem. Nos falamos na minha volta. Boa sorte!”");

                    System.out.println("eu estou tão assustado que não sei se ele escreveu isso como forma de piada ou isso realmente está acontecendo....");
                    System.out.println("uma mão acabou de tocar meu ombro e acabei de escutar uma voz do além, tudo estranho desde que cheguei, não vou arriscar, vou seguir as regras, mesmo que nada disso faça sentido.");
                }
                System.out.println(">O que você você quer fazer?<");
                System.out.println(">1-investigar o outro quarto<");

//seguir para outro quarto e ler a carta na mesa:
                int outro = scan.nextInt();
                if (outro==1) {
                    System.out.println("levanto e vou em rumo a outro quarto.");
                    System.out.println("entrando no outro quarto, vejo que na verdade é um escritório, com diversos livros e troféus científicos. No meio do escritório uma bela mesa de madeira maciça servia de descanso para um caderno aberto.");
                    System.out.println("ento-me na Grande poltrona para ler do que se de trata.");
                    System.out.println("Carta:");
                    System.out.println("“ Tantas tentativas e nada… ");
                    System.out.println("cheguei tão perto com o 61°, mas ainda falta algo para que o experimento fique perfeito! ");
                    System.out.println("cerébro jovem e sangue fresco... e esse sangue precisa ser compatível com o meu, afim de que ela possa me reconhecer.");
                    System.out.println(". Eu não deveria fazer isso, mas acredito que essa seja a única solução. Espero que Deus me perdoe por isso, ou que pelo menos o inferno não seja tão ruim.”.");
                    System.out.println("nesse momento um arrepio sobe meu braço inteiro então decido sair daquele comodo");
                    System.out.println("começo a observar ao redor para ver se reconheço o local...");
                    System.out.println("parando pra pensar eu estava no quarto de cima quando desmaiei, agora estou em outro lugar;  ");
                    System.out.println("VERDADE");
                    System.out.println(" aqui se parece com o hall da casa, devo esta perto do hall.");
                    System.out.println("irei procurar as escadas para ir até onde desmaiei e investigar para ver se acho algo útil.");
                System.out.println(">O que você você quer fazer?");
                System.out.println(">1-subir escada<");
                }
                

                int subirQuarto = scan.nextInt();
                //subir escadas >adicionar ação de subir diretamente para as escadas.
                if (subirQuarto==1) {
                    System.out.println("subindo as escadas  dou de cara com o corredor dos quartos novamente, a luz do corredor começa a piscar oscilando .");
                    System.out.println(" a segunda porta do corredor começa a se abrir devagar, ao mesmo tempo rangendo");
                    System.out.println("um cachorro de médio porte com metade do cérebro esposto sai de trás dessa porta rosnando;");
                    System.out.println("ele vira a cabeça devagar em minha direção em quanto as luzes não param de piscar, Ele me avista  e avança  querendo me matar.");
                
                System.out.println(">O que você quer fazer?<");
                System.out.println(">1-deixar lampião no chão e lutar");
                System.out.println(">2-fugir correndo ");
                }
                //nessa parte a seguir você decide se vai levar um pouco de dano e bater de frente ou se você corre pra procurar algo
                // se escolher luta na hora vai ter 2 opções de luta
                // se fugir vai ter 2 opções de luta
                // ou seja são 4 ifs diferentes que vão levar ao mesmo lugar, que é pegar o lampião do chão e voltar a investigar o 2 andar.


                //se por a caso escolher lutar com o cachorro, temos 2 tipos de combates para acontecer:
                int luta1 = scan.nextInt();
                if (luta1==1) {
                    System.out.println("a criatura avança contra você pulando e abrindo a boca em sua direção");
                    System.out.println(">O que você quer fazer?<");
                    System.out.println(" >1-chutar a cabeça do animal<");//1
                    System.out.println(" >2-se proteger usando seus braços<");   //2

                    int luta11 = scan.nextInt();

                    if (luta11==1) {

                        // 1> SE VOCÊ CHUTAR VAI ACONTECER ISSO:
                        System.out.println("você acerta um potente chute na direção do pescoço,o inimigo se choca com força na parede do corredor");
                        System.out.println("cachorro deformado:");
                        System.out.print("dano: " + danochutedog);
                        System.out.println(" total vida Cachorro deformado: " + bicuda);
                        System.out.print("cachorro deformado: atordoado.");
                        System.out.println(">avançar em cima do monstro e finalizar enforcando ele.");
                        System.out.println("perto de alcançar para enforca-lo, ele gruda sua mão com os dentes e lhe morde e não solta.");
                        System.out.println(" você pula pra cima com o cachorro nas mãos, coloca embaixo do seu peito e se joga no chão,");
                        System.out.println(" caindo e prensando ele com seu peso e impacto, ele  por baixo é esmagado.");
                        System.out.println(" dano sofrido: " + danoVsDog + " ~~ causado pelo impacto ao chão e mordida~~ ");
                        System.out.print("seu total de vida restante:" + damage20);
                        System.out.println("cachorro deformado dano: " + criticalhit + " (critical hit)");
                        System.out.println("vida  cachorro deformado:" + matadog);
                        System.out.println("_____você venceu a luta.___");
                        System.out.println(" após finalizar o monstro, você investiga o corpo com frieza e percebe que o animal foi modificado cientificamente.");
                        System.out.println(" tomado  por adrenalina você apenas pega seu lampião do chão, vira as costas e segue em frente para investigar o resto do corredor.");
                    }
                    if (luta11==2) {
                        //2> CASO VOCÊ SE PROTEJA USANDO O BRAÇO.
                        System.out.println("o cachorro deformado gruda em seus braços cravando os dentes.");
                        System.out.println("você aproveita que ela esta em seus braços e lhe segura, bate a cabeça dele com força repetidas vezes na parede do corredor até que  ele morra e te solte.");
                        System.out.println("cachorro deformado:");
                        System.out.print("dano causado: " + danoMorte);
                        System.out.println("  vida Cachorro deformado: " + batecabeca);
                        System.out.print("dano sofrido:  " + mordida);
                        System.out.println("seu total de vida:" + damage15);
                        System.out.println("seu braço esquerdo esta sangrando");
                        System.out.println("____ você venceu a luta_____");
                        System.out.println(" após finalizar o monstro, você investiga o corpo com frieza e percebe que o animal foi modificado cientificamente.");
                        System.out.println(" tomado  por adrenalina você apenas pega seu lampião do chão, vira as costas e segue em frente para investigar o resto do corredor.");
                    }
                }
                if (luta1==2) {

                    //CASO VOCÊ DESÇA AS ESCADAS CORRENDO:
                    System.out.println("você desce as escadas correndo e volta ao hall da casa, o cachorro segue correndo atrás de você ");
                    System.out.println("você escuta latidos grosso,  a corda vocal aparentemente do monstro aparentemente está estragada pelo o som de seus latidos.");
                    System.out.println("chegando ao tapete persa que vai da escada a porta de entrada, a luz do lustre reflete na mesa que você esbarrou quando entrou");
                    System.out.println("você avista uma faca pexeira em cima dessa mesa e corre em sua direção e deixa seu lampião para trás.");

                    System.out.println(">O que deseja fazer?<");
                    System.out.println("> 1-pegar faca");
                    int faca = scan.nextInt();
                    if (faca==1) {
                        System.out.println(" cachorro deformado:  tropeça no tapete persa");
                        System.out.println(">O que deseja fazer?<");
                        System.out.println(">1-aproveitar o tropeço do animal e esfaqueá-lo");
                        System.out.println(">2-esperar ele atacar e contra-atacar");

                        int luta12 = scan.nextInt();
                        if (luta12==1) {
                            //COMBATE 1 ESCADA
                            System.out.println(" avança correndo e pula em cima do cachorro deformado, atravessa ele com a faca, gira a faca e retira do inimigo.");
                            System.out.print("você balança a faca para limpar o sangue");
                            System.out.println("cachorro deformado dano: " + criticalhit + "(critical hit)");
                            System.out.print("vida  cachorro deformado:" + matadog);
                            System.out.println("_____você venceu a luta.___");
                            System.out.println("após finalizar o monstro, você investiga o corpo com frieza e percebe que o animal foi modificado cientificamente.");
                            System.out.println("tomado  por adrenalina você apenas pega seu lampião do chão, vira as costas e volta sentido a escada para subir  e terminar de investigar o resto do corredor.");
                        }
                        if (luta12==2) {
                            //combate 2 escada
                            System.out.println("o cachorro levanta e se desenrola do tapete e pula em sua direção abrindo a boca para lhe morder");
                            System.out.println(" você desvia pulando para o lado esquerdo e ataca na direção da barriga do cachorro deformado");
                            System.out.println("afunda a faca em sua barriga e arrasta ela baixo fazendo força para abrir");
                            System.out.println("as tripas do animal sai do buraco onde você abriu com ele ainda no ar, as tripas caem de um lado e o monstro de outro.");
                            System.out.println("o sangue espirra na sua cara, e você apenas limpa na camisa.");
                            System.out.print(nome + ":");
                            System.out.println(" - seu merda, você me sujou");
                            System.out.print("dano causado ao cachorro deformado: " + criticalhit);
                            System.out.println("total de vida cachorro deformado: " + matadog);
                            System.out.println("_____você venceu a luta.___");
                            System.out.println("após finalizar o monstro, você investiga o corpo com frieza e percebe que o animal foi modificado cientificamente.");
                            System.out.println("tomado  por adrenalina você apenas pega seu lampião do chão, vira as costas e volta sentido a escada para subir  e terminar de investigar o resto do corredor.");
                        }
                    }
                }

                //houve 4 interações diferentes  logo acima ,porem todas as quatro levam ao mesmo lugar: que é investigar o quarto onde você desmaiou.
                System.out.println("andando pelo corredor, as luzes continuam a piscar, vou até o gerador de energia e desligo e ligo para ver se a lampada para de piscar. ");
                System.out.println("VOCE DESLIGOU E LIGOU A LUZ");
                System.out.println("por fim algo deu certo, a luz voltou ao normal.");
                System.out.println("investigando  o corredor, vou direto para primeira porta novamente; Onde o cachorro dos infernos saiu, logo então vou de guarda fechada.");
                System.out.println("quando entrei nesse quarto a primeira vez, senti a temperatura cair e algo me observando, porém agora não sinto mais nada me observando....");
                System.out.println("talvez aquele dêmonio estava me observando desde que cheguei, porém agora eu o matei.");
                System.out.println("ao redor do quarto vejo apenas  marcas de mordidas nos moveis e arranhões, não tem nada util então decido ir para suite master.");
                System.out.println("no corredor, chego em frente a suite master.");
                System.out.println(">O que deseja fazer?<");
                System.out.println(">1-observar da porta ");//1
                System.out.println(">2-entrar");//2 

                int acao = scan.nextInt();

                //2
                if (acao==1) {
                    //1 > se observar da porta:
                    System.out.println("você verefica se há inimigos antes, pois não quer nenhum outro cachorro tentando te matar...");
                    System.out.println("não há inimigos ");

                    System.out.println(">O que deseja fazer?<");
                    System.out.println(">1-entrar");
                    int acao1 = scan.nextInt();

                    if (acao1==1) {

                        System.out.println("me adentro na suite e por surpresa ela parece o unico lugar da casa que ainda está inteiro e organizado");
                        System.out.println("caminhando devagar escuto repetido barulhos de pancada e uma voz que parecia ser de joana, implorando por ajuda.");
                    }
                }
                if (acao==2) {
                    //se 2> entrar:
                    System.out.println("me adentro na suite e por surpresa ela parece o unico lugar da casa que ainda está inteiro e organizado");
                    System.out.println("caminhando devagar escuto repetido barulhos de pancada e uma voz que parecia ser de joana, implorando por ajuda.");
                    //da decisão de observar ou entrar/
                }

                int morte = scan.nextInt();

                System.out.println(">O que deseja fazer?<");
                System.out.println(">1-investigar barulho");//1
                System.out.println(">2-dar meia volta");//2

                if (morte==1) {
                    //se 1 > investigar barulho: morte. 
                    System.out.println(" o barulho vem de atrás de outra porta dentro da suite master");
                    System.out.println("....ABRINDO PORTA....");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println("você se depara com um dêmonio sem forma, ele possui garras enormes. ");
                    System.out.println("o dêmonio avança em sua direção e atravessa seu estomago em alta velocidade sem tempo de reação.");
                    System.out.print("dano sofrido: " + danoMorte);
                    System.out.println("total de vida : " + damage100);
                    System.out.println("___você morreu___");
                    System.out.println("===================================");
                    System.out.println("=   --------FIM DE JOGO--------   =");
                    System.out.println("===================================");
                    break;
                }
                if (morte==2) {
                    //se 2> dar meia volta: você continua vivinho
                    System.out.println("lembro agora que tio tyler disse para não abrir portas se ouvir alguem, mesmo se parecesse familiar, até mesmo se fosse ele.");
                    System.out.println("não irei nessa direção. irei dar meia volta e investigar o local cujo eu desmaiei.");
                }
                //proxima fase.
                System.out.println("saio da suite e volto ao corredor, chegando perto do quarto onde desmaiei; percebo que o piso de entrada  do quarto esta um pouco desgastado.");
                System.out.println("encosto minha cabeça na porta e apoio o ouvido nela para ver se escuto algo dentro do quarto e nenhum som é emetido. ");
                System.out.println("...ABRINDO PORTA...");
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println("o quarto esta escuro, a janela que encarei joana esta com uma cortina e não consigo ver o lado de fora.");

                System.out.println(">O que deseja fazer?<");
                System.out.println(">1-tirar cortina e olhar fora");
                // (não tem outra opção, ou você tira ou você tira)
                //se tirar
                int cortina = scan.nextInt();
                if (cortina==1) {
                    System.out.println("vou andando em rumo a janela e a cada passo que dou escuto o ranger das madeiras.");
                    System.out.println("estou quase alcançando  a janela.");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println("*KRAAAAK*");
                    System.out.println("o chão quebra, prendendo sua perna no piso");
                    System.out.println("você faz força para tentar tirar sua perna de dentro do piso, a madeira toda se quebra, caindo andar a baixo.");
                    System.out.print(nome + ":");
                    System.out.println(" - AAAAAAAAAAAAAAAAA");
                    System.out.println("*ploft*");
                    System.out.println("cai em solo desconhecido");
                    System.out.println("dano sofrido: " + queda);
                    System.out.println("seu total de vida: " + damage9);
                    System.out.println("meio tonto ouço uma voz dizendo algo mas não consigo entender pois estou zonzo,  em quanto recobro minha consciência, vejo um homem alto de costas para mim ");
// BOSS FINAL
                    if (vida < 80) {
                        //SE  vida FOR <80:
                        System.out.print("homem misteirioso:");
                        System.out.println("ainda de costa o homem diz:");
                        System.out.println("- aparentemente meus animaizinhos deram trabalho para você senhor " + nome);
                        //fim if
                    }
                    if (vida > 80) {
                        //se  vida for >80:
                        System.out.print("homem misteiroso");
                        System.out.println("ainda de costas o homem diz:");
                        System.out.println("- pelo jeito o garoto medroso e fracote ficou bem mais forte... por essa eu não esperava.");
                        //fim if
                    }

                    System.out.println("a voz  deste era familiar, era a  mesma voz que ecoou pelo corredor  agora pouco...");
                    System.out.print("homem misteiroso:");
                    System.out.println("-olhe em volta, olhe em volta agora! " + nome);
                    System.out.println("o que eu fiz não é algo digno de perdão porém eu preciso ter ela de volta");
                    System.out.println(" ela era meu equilibrio, observe o que me tornei sem ela, um maniaco, um louco!.");
                    System.out.print(nome + ":...");
                    System.out.println("me levanto do chão se recuperando do baque e observo o local.");
                    System.out.println("Estou em um laboratório gasto com animais pendurados em ganchos.");
                    System.out.println("alguns sem vida e alguns com vida;sua anatomia é totalmente destorcida, os que possuem vida respiram com dificuldade.");
                    System.out.println("vejo crianças amarradas e sangrando, alguns com a cabeça aberta e outros inconscientes, poucas das crianças estão acordadas. ");
                    System.out.print(nome + ":");
                    System.out.println("- QUEM É VOCÊ É QUE MERDA É ESSA?");
                    System.out.println("POR QUE ESSAS CRIANÇAS TIVERAM UM FINAL TÃO HORRIVEL, POR QUE VOCÊ FEZ ISSO SEU ANIMAL?.");

                    System.out.print("homem misterioso: ");
                    System.out.println("- HAHAHAHAHAHAA");
                    System.out.println("  risada escadalosa e escandalosa ecoa por todo ambiente");
                    System.out.println("Que cruel meu garotão, como você se esqueceu de mim tão facil?");

                    System.out.println("o homem começa a se virar lentamente...");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                    System.out.println("ao ver seu rosto eu começo a suar frio e meu corpo é tomado por ódio, surpresa e medo, um sentimento misto.");
                    System.out.print(nome + ":");
                    System.out.println("voce....");

                    System.out.print("tio tyler: ");
                    System.out.println("- isso mesmo, sou eu.");
                    System.out.println(" parabens por procurar as pistas; você finalmente me encontrou pequeno detetive.");
                    System.out.print(nome + ":");
                    System.out.println("-por... por... POR QUE ISSO ESTÁ ACONTECENDO!!!!??? ");
                    System.out.println("você grita colocando as duas mãos na cabeça totalmente chocado.");
                    System.out.print("tio tyler: ");
                    System.out.println("- desde que parti daquela cidade após perder minha mulher, vim tentando esquecer ela e seguir em frente... porém eu...eu não conseguia!.");
                    System.out.println("diz com tristeza na voz");
                    System.out.println("- isso foi me corroendo por dentro, aquele caminonheiro bebado filha de uma puta pegou apenas 1 ano de cadeia e nunca pediu desculpas a família... im.. imperdoavel!!!.");
                    System.out.println("começa a dizer as palavras gritando e surtando");
                    System.out.println("-comecei a estudar todo tipo de método para conseguir reanimar um cérebro e  um corpo.");
                    System.out.println("relaxa o tom de voz e volta a falar naturalmente");
                    System.out.println("-vim a moresville para que ninguem me atrapalhasse em minha pesquisa!.");
                    System.out.println("esses animais e crianças são experiência para que eu consiga reanimar um morto,todos são falhos porém o numero 78 teve exito.");
                    System.out.println("consegui trazer um morto de volta a vida, usei sangue compativel porém o cerebro usado para reanimar era velho... ");
                    System.out.println(" se tornou em uma experiência quase bem sucedida se ele não se tornasse em uma aberração que quase me matou.");
                    System.out.println("inclusive eu tranquei essa experiência na suite master, ainda bem que seguiu as regras e não abriu a segunda porta.");
                    System.out.println("emfim, para experiência dar certo eu preciso de sangue jovem  compativel ao meu e um cerébro jovem.... ");
                    System.out.println(" a criança que estava na barriga dela tinha meu dna então ela acordaria com apenas com meu sangue,porém, eu sou velho.");
                    System.out.println("você é perfeito pra isso meu garotão, " + nome + " seu sangue é compativel ao meu e és jovem, seu cérebro também é jovem");
                    System.out.print(nome + ":");
                    System.out.println("-  você não passa de um egoista burro e filha da puta!. ");
                    System.out.println("acha mesmo que Suzana ficará feliz ao acordar e saber que você matou esse tanto de pessoas para traze - la de volta!");
                    System.out.println("diz gritando com muito ódio");
                    System.out.println("-eram pessoas.... pessoas inocentes sua aberração desgraçada!.");
                    System.out.println("diz com tristeza e frustação");
                    System.out.println("-você não perdeu todos, você ainda tinha a mim e a fámilia porém isso é imperdoavel tyler, ESSAS CRIANÇAS E ANIMAIS ERAM INOCENTES!.");
                    System.out.println("grita com ódio");

                    System.out.println("tyler te encara com um olhar de raiva");
                    System.out.print("tio tyler:");
                    System.out.println("-CALE A BOCA INSETO! ");
                    System.out.println("grita  tyler");
                    System.out.print("tio tyler:");
                    System.out.println("-inocentes? todas essas crianças possui grau parentesco com o bebado que matou suzana... ");
                    System.out.println("diz tio tyler abaixando a voz aos poucos, com raiva e dando um soco na mesa a frente dele");
                    System.out.print("tio tyler:");
                    System.out.println("- se ele tirou alguem de mim e nem se desculpou, eu tirarei todas as pessoas da vida dele.");
                    System.out.println("elimarei todos que ele ama  até recuperar a  quem esse desgraçado tirou de mim!.");
                    System.out.print(nome + ":...");
                    System.out.println("sinto  ódio puro correndo ao redor de meu corpo e se preparo para combate.");
                    System.out.println("tio tyler puxa um bisturi de cima da mesa do laboratório e começa a caminhar em minha direção.");
                    System.out.println("começo a caminhar na direção dele com meus dois punhos cerrados.");
                    System.out.print(nome + ":");
                    System.out.println("TYLEEEEEEEEEEEEEEEEEER!!!!!!!!!!!!!!!");
                    System.out.print("tyler:");
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAHHH!!!!!");

                    System.out.println(">O que deseja fazer?<");
                    System.out.println(">1-lutar para matar tyler.");
                    System.out.println(">2-tentar Prender Tyler.");

                    int tyler = scan.nextInt();
                    // a decisão para matar e para prender vão levar ao mesmo final que é: desmontar de cima do tio tyler e ter a interação para desamarrar as crianças.
                    if (tyler==1) {
                        // SE LUTAR PARA MATAR.:
                        System.out.println("tio tyler começa a correr com o bisturi em maos na sua direção e tenta desferir um corte em região de seus olhos");
                        System.out.println(">O que deseja fazer?<");
                        System.out.println(">1-esquivar e contra-atacar");//1
                        System.out.println(">2-defender com as mãos");//2
                        int combate1 = scan.nextInt();

                        if (combate1==1) {
                            //decisão combate 1>:
                            System.out.println("o bisturi passa raspando em sua bochecha, só faz um pequeno arranhão, tyler deixou sua guarda aberta.");

                            System.out.println(">1-socar boca do inimigo");
                            int AcertarBoca = scan.nextInt();
                            if (AcertarBoca==1) {
                                System.out.println(" você acerta um golpe em cheio nos dentes de tyler.");
                                System.out.println("Dano causado a tio tyler: " + boca);
                                System.out.println("tio tyler total vida: " + vidatyler10);
                                System.out.print("dano sofrido: " + raspao);
                                System.out.println("vida total: " + damage3);
                            }
                        }

                        //decisão combate 2>
                        if (combate1==2) {
                            System.out.println("o bisturi fura sua mão e te perfura.");
                            System.out.println("segurando o bisturi com a mão esquerda perfurada, você usa a mão direita e acerta um soco no nariz de tyler.");
                            System.out.print("tio tyler:");
                            System.out.println("dano causado : " + mordida);
                            System.out.println(" tio tyler total vida: " + vidatyler15);
                            System.out.println("dano sofrido: " + danoVsDog);
                            System.out.println("seu total de vida restante: " + damage20 + " ~~sangrando~~");
                        }

// fim decisão COMBATE                               
// decisão 1 ou 2 vai te levar a :   
                        System.out.println("tyler se recupera do golpe rapidamente e avança um chute em direção  de sua barriga.");

                        System.out.println(">1-desviar e contra-atacar");
                        int decisao = scan.nextInt();
                        if (decisao==1) {
                            //só tem essa opção, tu leva dano de todo jeito e poucas.
                            System.out.println("você tenta desviar porém é atingido por um chute certeiro no estomago e te deixa sem ar:");
                            System.out.println("dano sofrido: " + mordida);
                            System.out.println("total de vida restante: " + damage15);
                            System.out.println("seu estado: ~~Atordoado~~. ");
                            System.out.println("tio tyler aproveita que você esta atordoado  e te acerta uma rasteira, você cai de costas no chão.");
                            System.out.println("dano sofrido : " + danoInicio);
                            System.out.println("Seu Total de vida restante: " + damage5);
                        }
                        System.out.println("tyler avança para subir em cima de você para te furar com o bisturi.");
                        System.out.println(">1-chutar-lo");
                        int decisao1 = scan.nextInt();
                        if (decisao1==1) {
                            System.out.println("você espera tyler se aproximar, quando ele vai montar em você, por fim você acerta um chute  e ele cai de cabeça no chão e deixa o bisturi cair.");
                            System.out.println("dano causado: " + mordida);
                            System.out.println("tio tyler total vida: " + vidatyler15);
                            System.out.println("estado de tyler: ~Atordoado~ (pela pancada na cabeça ao cair)");
                            System.out.println(">levantar, correr, pegar bisturi e montar em cima de tio tyler.");
                            System.out.print(nome + ":");
                            System.out.println("- depois de tantos inocentes machucados e assasinados, você tera sua punição. ");
                            System.out.println(" você ainda tinha a família porém nem mesmo suzana te perdoaria.");
                        }

                        //opção if pro fatality
                        System.out.println(">O que deseja fazer?<");
                        System.out.println(">1-Cortar Pescoço");//1
                        System.out.println(">2-Rasgar do estomago.");//2
                        int fatality = scan.nextInt();
                        if (fatality==1) {
                            //se fatality 1.
                            System.out.println("com o bisturi em mãos você aproxima lentamente e olhando nos olhos de tyler.");
                            System.out.print("tyler:");
                            System.out.println("- me perdoe suza-");
                            System.out.println("você rasga a garganta dele na horizontal antes de tyler terminar de pedir perdão.");
                            System.out.println("dano causado: " + criticalhit);
                            System.out.println("vida tyler:" + vidatylercritico);
                            System.out.println("_____você venceu a luta.___");
                        }
                        //se fatality 2.
                        if (fatality==2) {
                            System.out.print("tyler:");
                            System.out.println("- não faz isso, eu sou seu tio!, eu só queria ela de volta!.");
                            System.out.print(nome + ":");
                            System.out.println(" sim... um tio, um tio que tentou me matar!");
                            System.out.println("você junta  as duas mãos no bisturi, leva até a cima da cabeça e crava no estomago de tyler");
                            System.out.println("quando cravado no estomago, você afunda mais pra dentro e arrasta pra baixo a lamina");
                            System.out.println("fazendo que a barriga do mesmo seja aberta.");
                            System.out.println("dano causado: " + criticalhit);
                            System.out.println("vida tyler:" + vidatylercritico);
                            System.out.println("_____você venceu a luta.___");
                        }
                    }
                    if (tyler==2) {
                        //se  lutar para tentar Prender Tyler.
                        System.out.println("tio tyler começa a correr com o bisturi em maos na sua direção e tenta desferir um corte em região de seus olhos");
                        System.out.println(">O que deseja fazer?<");
                        System.out.println(">1-esquivar e contra atacar");//1
                        System.out.println(">2-defender com as mãos");//2
                        int decisao2 = scan.nextInt();
                        if (decisao2==1) {
                            System.out.println("o bisturi passa raspando em sua bochecha, só faz um pequeno arranhão, tyler deixou sua guarda aberta.");

                            System.out.println(">1-socar a boca");
                            int soco = scan.nextInt();
                            if (soco==1) {
                                System.out.println(" você acerta um golpe em cheio nos dentes de tyler.");
                                System.out.println("Dano causado a tio tyler: " + boca);
                                System.out.println("tio tyler total vida: " + vidatyler10);
                                System.out.print("dano sofrido: " + raspao);
                                System.out.println("vida total: " + damage3);
                            }
                        }
                        if (decisao2==2) {
                            System.out.println("o bisturi fura sua mão e te perfura.");
                            System.out.println("segurando o bisturi com a mão esquerda perfurada, você usa a mão direita e acerta um soco no nariz de tyler.");
                            System.out.print("tio tyler:");
                            System.out.println("dano causado : " + mordida);
                            System.out.println(" tio tyler total vida: " + vidatyler15);
                            System.out.println("dano sofrido: " + danoVsDog);
                            System.out.println("seu total de vida restante: " + damage20 + " sangrando..");
                        }

                        System.out.println("tyler se recupera do golpe rapidamente e avança um chute em direção  de sua barriga.");
                        System.out.println(">1-desviar e contra-atacar");
                        int tentar = scan.nextInt();
                        if (tentar==1) {
                            System.out.println("você tenta desviar porém é atingido por um chute certeiro no estomago e te deixa sem ar:");
                            System.out.println("dano sofrido: " + mordida);
                            System.out.println("total de vida restante: " + damage15);
                            System.out.println("seu estado: atordoado. ");
                            System.out.println("tio tyler aproveita que você esta atordoado  e te acerta uma rasteira, você cai de costas no chão.");
                            System.out.println("dano sofrido : " + danoInicio);
                            System.out.println("Seu Total de vida restante: " + damage5);
                        }
                        System.out.println("tyler avança para subir em cima de você para te furar com o bisturi.");
                        System.out.println(">1- chutar-lo");
                        int chutar = scan.nextInt();
                        if (chutar==1) {
                            System.out.println("você espera tyler se aproximar, quando ele vai montar em você, por fim você acerta um chute  e ele cai de cabeça no chão e deixa o bisturi cair.");
                            System.out.println("dano causado: " + mordida);
                            System.out.println("tio tyler total vida: " + vidatyler15);
                            System.out.println("estado de tyler: atordoado (pela pancada na cabeça ao cair)");
                            System.out.println("corre em direção ao bisturi e chuta ele para longe. ");
                            System.out.println("em seguida monta em cima de tio tyler com ele no chão.");
                            System.out.print(nome + ":");
                            System.out.println("- você esta sendo preso,tem o direito de permanecer calado.");
                            System.out.println(">Rajada de socos");
                            System.out.println(" tu começas a encher tio tyler de diversos murros na cara até que ele apague e sua mão fique roxa e cheia de sangue dele.");
                            System.out.println("dano causado: " + danoMorte);
                            System.out.println("vida  de tio tyler: " + vidatyler100);
                            System.out.println("estado atual de tyler: ~~Nocauteado/desmaiado.~~ ");
                        }
                    }
//fim que leva ao mesmo final:                

                    System.out.println("você desmonta de cima de tio tyler e anda em rumo as crianças que estão vivas e presas.");
                    System.out.println("ao começar a desamarrar as crianças algumas delas gritam: não se aproxime!");
                    System.out.println(">O que deseja fazer?<");
                    System.out.println(">1-desamarrar todas as crianças<");//1
                    System.out.println(">2-aproximar-se cuidadosamente<");//2
                    int encerrar = scan.nextInt();
                    //caso 1>
                    if (encerrar==1) {
                        System.out.println("você sente um forte impacto na suas costas e cai de joelhos, olhando pra baixo você observa uma grande lamina que te perfurou por trás.");
                        System.out.println("dano recebido : 185");
                        System.out.println("estado atual : ~~beirando a morte.~~ ");
                    }
                    //sim deixa em txt se não vai dar game over, é aqui o plot twistkkkj, essa parte da vida no finalzinho n precisa de executar um dano real.
                    // caso 2 >
                    if (encerrar==2) {
                        System.out.println("você vira rapidamente e apenas enxerga uma grande lamina em sua direção");
                        System.out.println("tenta se esquivar mas ela atinge seu peito em cheio.");
                        System.out.println("dano recebido : 185");
                        System.out.println("estado atual : beirando a morte. ");
                    }
                    //ambos levam para o finalzin:
                    System.out.println("droga estou apagando aos poucos.. merda..... espero que... achem essas pobres crianças");
                    System.out.println("_seus olhos começam a se fechar_");
                    System.out.print("voz distante: ");
                    System.out.println(nome + "acorda");
                    System.out.print("voz distante: ");
                    System.out.println(nome + "ACORDA LOGO!!!");
                    System.out.println("sinto duas mãos me balançar...");
                    System.out.println("s-sera que o resgate achou meu corpo a beira da morte... e achou as crianças?");
                    System.out.println("ótimo... pelo menos as crianças vão ficar bem.");
                    System.out.print("VOZ:");
                    System.out.println("-ACORDA CARALHO!");
                    System.out.println("levo um forte e potente tapa na cara acompanhado do berro,  levanto minhas costas  do chão em um grande susto.");
                    System.out.print("Joanna:");
                    System.out.println("meu deus garoto que susto pensei que  você tivesse morrido, eu ouvi um barulho de vaso quebrando e não ouvi mas você andando pela casa ");
                    System.out.println("então vim te procurar pra ver se você estava bem.");
                    System.out.print(nome + ":");
                    System.out.println("- ??? por que eu não to morto, eu não fui perfurado?.");
                    System.out.print("Joanna:");
                    System.out.println("- se você tivesse morrido por  um vaso ter caido em sua cabeça ia ser uma coisa tão idiota que era capaz da sua familia rir no enterro.  ");
                    System.out.print(nome + ":");
                    System.out.println("-  va- vaso? eu não fui atravessado por uma lâmina? ");
                    System.out.print("Joanna:");
                    System.out.println("-  acho melhor de fato levar você no hospital, a pancada na cabeça deve ter sido realmente forte.");
                    System.out.println("o apollo deve ter empurrado esse vaso em você quando tu sentou na cama, olha os cacos no chão, foi isso que aconteceu.");
                    System.out.print(nome + ":");
                    System.out.println("- meu deus isso tudo foi um sonho.... impossivel...");
                    System.out.print("Joanna:");
                    System.out.println("- Sim garoto eu não sei com o que diabos você sonhou mas emfim, bem vindo de volta.");
                    System.out.print(nome + ":");
                    System.out.println("-  por que você ficou me encarando daquele jeito na janela?");
                    System.out.print("Joanna:");
                    System.out.println("- eu sou velha, tenho problema de vista, queria saber se o que estava na janela era um cabideiro com roupas ou se era uma pessoa.");
                    System.out.println("por fim era realmente uma pessoa.");
                    System.out.print(nome + ":");
                    System.out.println("-  meu deus...");
                    System.out.print("apollo:");
                    System.out.println("- Meow.");
                    System.out.print(nome + ":");
                    System.out.println("-  SEU GATO DESGRAÇADO VOLTA AQUI!");
                    //fim

                }
            }
        }
    }
}
