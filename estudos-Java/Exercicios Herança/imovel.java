public class Imovel {
    protected String endereco;
    protected double valorEmReais;

    public void setValor (double preco) {
        valorEmReais = preco;
    }

    public void setEndereco (String end) {
        endereco = end;
    }

    public void imprimeValor () {
        System.out.println (valorEmReais);
    }

    public void imprimeEndereco () {
        System.out.println (endereco);
    }
}

public class Novo extends Imovel {
    protected double adicional;

    public void setAdicional (double adc) {
        this.adicional = adc;
        valorEmReais += taxa;
    }
    public double getValorEmReais () {
        return valorEmReais;
        }
    }
    @Override
    public void imprimeValor () {
        System.out.println("Valor do Imóvel com Adicional");
        System.out.println (valorEmReais);
    }
}
