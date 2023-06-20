import java.util.Scanner;


public class LivroInterativo {
    public static void main(String[] args)  {
        
        
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Alberto está em uma fuga intensa de um grupo de mafiosos que está encurralando ele por todos os lados, alberto duas opções possiveis, se esconder descendo pelos esgotos da cidade ou tentar subir no quinta do predio a sua esquerda\nAlfredo sobe ou desce:");
        
        leitor1.useDelimiter("[\n\r]+");
        String decisao1 = leitor1.next();
        

        if(decisao1.equals("sobe"))
        {
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Alfredo entao ver de cima todos os mafiosos passando a sua procura sem encontra-ló, entao alfredo entra na casa cujo ele subiu a varanda, alfredo infelizmente se depara com um pinscher rosnando para ele, alfredo entao pode lutar com o feroz pinscher ou desesperadamene pular de volta a rua onde estão os mafiosos a sua procura\n Alfredo luta ou pula?");
            
            leitor2.useDelimiter("[\n\r]+");
            String decisao2 = leitor2.next();
                    if(decisao2.equals("luta"))
                    {
                        System.out.println("Alfredo entao chuta o pinsher pela varada, porem enquanto alfredo comemorava sua vitoria,nao se deu conta que o pinsher nao estava sozinho, com ele havia um pitbull, alfredo sem se dar conta e atacado pelo pitbullque destroi alfredo em pedacinhos enquanto comemorava sua vitoria");
                    }
                    else if(decisao2.equals("pula"))
                    {
                        System.out.println("Alfredo desesperado pelo perigo do pinscher pula de volta na frente dos seus algozes, que o capturam, espancam e colocam no porta-mala de carro da mafia, alfredo nunca mais sera visto");
                    }
                    else{
                        System.out.println("opcao invalida, voce retornará ao começo do livro");
                        main(args);
                    }
        }
        else if(decisao1.equals("desce"))
        {
                Scanner leitor3 = new Scanner(System.in);
            System.out.println("Alberto entra por um bueiro para escapar de qualquer forma dos seus perseguidores, quando ele entra no esgoto se depara com milhares de ratos amontoados e pisa na água do esgoto, e agora Alberto tem duas opções Subir de volta e encarar os seus perseguidores mafiosos ou ir em frente e encarar milhares de ratos dentro dos esgotos\n frente ou subir: ");
    
                leitor3.useDelimiter("[\n\r]+");
            String decisao2 = leitor3.next();
                if(decisao2.equals("frente"))
                {
                    System.out.println("Alberto segue em frente correndo contra os ratos e consegue escapar dos seus perseguidores.\n3 meses depois alberto morre de leptospirose adquirida na fulga dos seus perseguidores pelo esgoto, triste fim para Alberto");
                }
                else if(decisao2.equals("subir"))
                {
                    System.out.println("Alberto sobe para encarar seus perseguidores, entra em luta corporal, e perde feio  mas suja todos com a água do esgoto que estava no seu corpo, Alberto é assassinado no local e esse é o fim de Alberto.\nmas meses depois todos os que lutaram com Alberto morrem por contrair leptospirose na luta, alberto se foi, mas levou seus assassinos com ele");
                }
                else{
                    System.out.println("opcao invalida, voce retornará ao começo do livro");
                    main(args);
                }

        }
        else{
            System.out.println("opcao invalida, voce retornará ao começo do livro");
            main(args);
        }

    }
}
