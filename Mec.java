public class Mec {
    public void exibeDadosArray(Universidade [] arrayUniversidades){
        //aqui coloquei o for para entrar dentro e passar um por um e ler tds e ver qual e qual
        for(int i = 0; i < arrayUniversidades.length; i++){
            //Aqui eu coloquei o instanceof para ele buscas so as universidades privadas ou so as publicas
            //E tambem coloquei um lastro de repeticao pois se nao for um vai ser o outro 
            if(arrayUniversidades[i] instanceof Privada){
                arrayUniversidades[i].exibeDados();
                System.out.println("Universidades privdas: ");
            }else if(arrayUniversidades[i] instanceof Publica){
                arrayUniversidades[i]. exibeDados();
                System.out.println("universidade publicas: ");
            }
        }
    }

    public void exibeDadosArrayMesalidade(Privada [] arrayUniversidadespPrivadas){
        double maiorMensalidade = 1;
        int indice = 0;
        // Aqui coloquei um lastro para passar em tds e mostrar so as universidades privadas e as mensalidades delas
        for(int i = 0; i < arrayUniversidadespPrivadas.length; i++){
            if(arrayUniversidadespPrivadas[i] instanceof Privada){
                if(((Privada)arrayUniversidadespPrivadas[i]).getValorMensalidade() > maiorMensalidade){
                    maiorMensalidade = ((Privada)arrayUniversidadespPrivadas [i]).getValorMensalidade();
                    indice = i;
                }
            }
        }
        // Aqui ira mostrar a universidade com a mensalidade mais cara 
        System.out.println("Univercidade privada com maior mensalidade: ");
        arrayUniversidadespPrivadas[indice].exibeDados();
    }

    public void universidadesDoSul(Universidade [] arrayUniversidadesdoSul, String RS, String SC, String PR){
        int flag = 0;
        // Colocando o lastro de repeticao para passar em td o array para buscar as determinadas regioes rs,sc,pr
        //colocando o instanceof para buscas essas regioes de dentro do array das universidades publicas 
        for(int i = 0; i < arrayUniversidadesdoSul.length; i++){
            if(arrayUniversidadesdoSul[i] instanceof Publica){
                if((((Publica) arrayUniversidadesdoSul[i]).getEstado()).equalsIgnoreCase("RS") || 
                ((Publica) arrayUniversidadesdoSul[i]).getEstado().equalsIgnoreCase("SC") ||
                ((Publica) arrayUniversidadesdoSul[i]).getEstado().equalsIgnoreCase("PR"))
                {
                arrayUniversidadesdoSul[i].exibeDados();
                flag = 1;
                }
            }
        }
        // usando o flag para caso nao tenha nenhuma universidade dessas regioes mostrar em tela 
        if(flag == 0){
        System.out.println("Nenhuma universidade foi encontrada nessa geriao!");
        }
    }

    public void universidadesDoSul(Publica[] universidades) {
    }
}


