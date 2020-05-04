class NegociacaoController {
    constructor() {
        // adicionando no construtor, para agir como se fosse um cache e percorrer apenas uma vez o dom
        // precisa dar o bind porqu se nao o this perde o document
        let $ = document.querySelector.bind(document);

        this._inputData = $('#data');
        this._inputQuantidade =  $('#quantidade');
        this._inputValor = $('#valor');
    }

    adiciona(event) {
        event.preventDefault();
        // spread operator permite que um objeto iterável, como um array ou string, seja expandida
        // quando passa para uma funcao, com o spread operator, cada item do array é passado como parametro
        // ex anyFunction(itemArray1, itemArray2, itemArray3)
        // var arr1 = [0, 1, 2];
        // var arr2 = [3, 4, 5];
        // arr1.push(...arr2);
        let data = new Date(...this._inputData.value
            .split('-') //converte o array para uma string separado por '-'
            .map(function(item, indice) { // cria um novo array subtraindo o mes em -1
                if(indice == 1) {
                    return item - 1;
                }
                return item;
            })
        );
        console.log(data);

        // sem uso do if
        let data2 = new Date(...this._inputData.value
            .split('-')
            .map(function(item, indice) {
            return item - indice % 2;
        }));

        // com arrow function, quando tem apenas uma instrucao no arrow function pode-se omitir o {} do bloco, nem do return ela ja vai retornar
        let data3 = new Date(...this._inputData.value
            .split('-')
            .map((item, indice) => item - indice % 2));

        console.log(data3);

        // sem o método static na classe
        //let date = new DateHelper().textoParaData(this._inputData.value);
        
        //com método static
        let date = DateHelper.textoParaData(this._inputData.value);

        let negociacao = new Negociacao(
            date,
            this._inputQuantidade.value,
            this._inputValor.value
        );
        console.log(negociacao);

       
    }
}