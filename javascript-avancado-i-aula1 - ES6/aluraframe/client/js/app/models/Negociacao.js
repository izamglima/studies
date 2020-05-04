class Negociacao {

    constructor(data, quantidade, valor){
        // constructor só sera chamado quando houver o operador new 
        this._data = new Date(data.getTime()); // programacao defensiva, retorna um novo objeto para n ser alterado de fora
        this._quantidade =  quantidade;
        this._valor = valor;
        Object.freeze(this);
    }

    // old
    // getVolume() {
    //     return this._quantidade * this._valor;
    // }
    // getData() {
    //     return this._data;
    // }
    // getQuantidade() {
    //     return this._quantidade;
    // }
    // getValor() {
    //     return this._valor;
    // }

    // uso do GET permite acessar o valor como se fosse uma propriedade e nao um metodo
    // negociacao.volume
    // e nao negociacao.getVolume()
    // ao invocar o negociacao.volume, nao conseguimos passar um valor novo, apenas ler
    get volume() {
        return this._quantidade * this._valor;
    
    }
    
    get data() {
        return new Date(this._data.getTime());
    }
    
    get quantidade() {
        return this._quantidade;
    }
    
    get valor() {
        return this._valor;
    }
}