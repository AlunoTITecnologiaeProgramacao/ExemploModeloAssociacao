package exemplomodeloassociacao;

public class ExemploModeloAssociacao {

    public static void main(String[] args) {
        
        Caminhao c = new Caminhao("Caminhao Grande", "Ford", 
                new Motor(300, 200, "bio-Combustivel", 
                            new Parafuso("10cm", "ferro", 
                                    new Fornecedor("393928121/1212", "Testador 1") )), 
                new Roda(7, "Ford", "Prata", 
                        new Parafuso("27", "ferro", 
                                new Fornecedor("192120210/12123", "Testadora 2") ) ), 
                new Pneu( 15, "Pneu XYZ", 
                        new Fornecedor("3939929121/192929", "Testador 3") ) );
        
        System.out.println(c);
    }
}
