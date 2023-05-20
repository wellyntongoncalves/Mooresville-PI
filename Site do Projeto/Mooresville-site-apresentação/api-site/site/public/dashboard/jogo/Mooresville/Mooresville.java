
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mooresville {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        double vida = 100;
        double danoInicio = 5;
        double danoMorte = 100;
        double damage5 = vida - danoInicio;
        int temp_dialoglong = 7;
        int temp_dialogshort = 3;
        String start;
        while (true) {

            System.out.println("------------WELCOME TO MOORESVILLE-----------");
            System.out.println("----------DIGITE START PARA COMEÇAR--------");
            start = scan.nextLine();
            if (start.equals("start")) {
                System.out.println("""
                                   Meu tio Tyler \u00e9 uma das personalidades mais bizarras que voc\u00ea poderia conhecer, quer dizer, o cara \u00e9 muito estranho.
                                   N\u00f3s nunca fomos realmente muito pr\u00f3ximos, por\u00e9m ele sempre aparecia para ver minha v\u00f3.\r
                                   Depois daquela porcaria que aconteceu com ele... ele sumiu.
                                   Minha v\u00f3 vivia dizendo:
                                   - Ele \u00e9 um homem ocupado e reservado, n\u00e3o tem como vir visitar a gente,
                                   por\u00e9m ele \u00e9 um dos melhores cientistas deste pa\u00eds. - Dizia ela.
                                   Minha v\u00f3 tamb\u00e9m vivia me contando hist\u00f3rias sobre ele:
                                   \u201cQuando mais novo, seu tio Tyler era um homem muito estressado e mal
                                   conseguia um projeto aprovado na sua empresa, ainda bem que ele encontrou
                                   uma mulher boa para concertar ele.
                                   Suzana fez seu tio mudar por completo, isso foi \u00f3timo, eu nunca o vi t\u00e3o feliz
                                   na minha vida, depois dela ele tamb\u00e9m cresceu muito como cientista na
                                   empresa.\u201d
                                   Em um churrasco quando eu tinha 9 anos eu percebi que tio Tyler tinha uma
                                   mania de ficar murmurando uma m\u00fasica, perguntei para ele que m\u00fasica era
                                   essa e me respondeu com um sorriso no rosto:
                                   
                                   -oiiii garot\u00e3o, essa m\u00fasica \u00e9 que minha esposa fez quando completamos 1 ano
                                   de casado, a gente viajou pro caribe.
                                   Na viagem, escutei ela no barco muitas vezes e eu viciei nessa m\u00fasica e fico
                                   murmurando-a at\u00e9 hoje, porque amo ela... tanto a m\u00fasica quanto minha
                                   Suzana.
                                   ......
                                   
                                   Ele era t\u00e3o feliz e sorridente com aquela mulher, eles iam ter um filho quando
                                   um certo dia.... Suzana saiu de carro para comprar camar\u00e3o para cozinhar e
                                   um caminhoneiro b\u00eabado bateu no carro dela. O beb\u00ea e ela morreram na hora.
                                   A \u00faltima vez que vi meu tio Tyler foi no enterro de Suzana, ele chorava na
                                   frente do caix\u00e3o e murmurava aquela mesma m\u00fasica.
                                   Ap\u00f3s esse ocorrido ele ficou estranho....
                                   
                                   Quando eu tinha 15 anos, tio Tyler mudou-se para o sul, e desde ent\u00e3o tive
                                   poucas \u201cnot\u00edcias\u201d sobre ele, se \u00e9 que se pode chamar algumas cartinhas de
                                   Feliz natal de not\u00edcias, j\u00e1 faz mais de 5 anos que n\u00e3o o vejo.
                                   Ent\u00e3o voc\u00ea pode imaginar meu estado de surpresa em me encontrar dentro do
                                   meu carro, dirigindo em dire\u00e7\u00e3o a Mooresville, uma cidadezinha pacata no
                                   norte do Alabama com incr\u00edveis 60 habitantes... Rumo a casa do meu tio Tyler.
                                   Chegando ao endere\u00e7o que me foi passado, me encontro parado em frente a
                                   enorme casa de 3 andares que parecia ter sa\u00eddo de um seriado de com\u00e9dia
                                   dos anos 60.
                                   Tyler, que naquela altura j\u00e1 estava a 6 anos sem dar nenhum sinal de vida, me
                                   ligou numa manh\u00e3 de segunda-feira e pediu-me que fosse at\u00e9 Mooresville, ele
                                   teria que viajar a um congresso de ci\u00eancias no Rio de Janeiro e n\u00e3o tinha mais
                                   ningu\u00e9m que pudesse cuidar de seus \u201canimais\u201d enquanto ele estivesse fora.
                                   Animais... Lembro de minha m\u00e3e dizer que ele odiava qualquer tipo de animal,
                                   o que ser\u00e1 que o levou a mudar de ideia, e agora criar animais em sua casa,
                                   pensando bem...
                                   Ele sequer citou qual tipo de animais ele tinha aqui, eu mal sei o que estou
                                   fazendo aqui, onde raios estava com a cabe\u00e7a de achar que isso seria uma
                                   boa ideia, mas ele parecia estar realmente precisando de minha ajuda. )""");
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
                System.out.println(">Entrar na casa<");
                System.out.println(">Investigar terreno<");
                String investigar = scan.nextLine();

                if (investigar.equals("Investigar terreno")) {
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
                    System.out.println(">Investigar arbusto<");
                    System.out.println(">Voltar para a casa<");

                    String arbusto = scan.nextLine();

                    if (arbusto.equals("Investigar arbusto")) {

                        System.out.println(" me agacho na frente do arbustro,  coloco meu braço esquerdo dentro para ver se encontro algo");
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
                    if (arbusto.equals("Voltar para a casa")) {

                        System.out.print(nome + ":");
                        System.out.println(" - Melhor não mexer nisso, cidade de interior sai cobra até de dentro do bolso, vai saber que diabo tem ai,melhor entrar e ler a carta de uma vez.");
                        System.out.println("diz resmugando pra sí mesmo");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                        System.out.println("você anda até a parte de frente da casa e abre a porta");
                        TimeUnit.SECONDS.sleep(temp_dialogshort);
                    }

                }
                if (investigar.equals("Entrar na casa")) {
                    System.out.print(nome + ":");
                    System.out.println("- Melhor entrar de uma vez na casa, já perdi muito tempo aqui fora.");
                    System.out.println("você diz, caminhando até a porta e abrindo-a.");
                    TimeUnit.SECONDS.sleep(temp_dialogshort);
                }
                System.out.println("""
                               Voc\u00ea se depara com o hall da casa, com tr\u00eas portas que levavam a c\u00f4modos diferente, no teto, um lustre que provavelmente compraria 4 do meu sedan compacto, e no ch\u00e3o, um grande tapete persa, que se estendia at\u00e9 o p\u00e9 de uma escada de aproximadamente 15 degraus, tudo que eu sabia sobre a profiss\u00e3o de meu tio, era que ele era um renomado cientista, mas eu realmente n\u00e3o fazia ideia de qual era sua \u00e1rea de atua\u00e7\u00e3o, bom, agora sei que a remunera\u00e7\u00e3o deve ser excelente. 
                               Apolo ent\u00e3o, saltou do meu colo e correu pra dentro de uma das tr\u00eas portas que haviam no HALL, e eu ent\u00e3o, decidi ler a carta que Joanna havia me entregado.   """);
                TimeUnit.SECONDS.sleep(temp_dialogshort);
                System.out.println("carta:");
            }
        }
    }
}
