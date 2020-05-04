class Negociacao {

    constructor (data, quantidade, valor) {
        this._data = data; //_data constante, valor nao pode ser alterado fora dos métodos da classe
        this._quantidade = quantidade;
        this._valor = valor;
    }

    get data() {

        return this._data;

    }

    get quantidade() {

        return this._quantidade;

    }

    get valor() {

        return this._valor;
    }

    get volume() {

        return this._quantidade * this._valor;
    }
}