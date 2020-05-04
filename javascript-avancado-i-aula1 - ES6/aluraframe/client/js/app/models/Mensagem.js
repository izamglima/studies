class Mensagem {
    // ES6 permite instanciar um parametro default caso nao tenha sido passado nenhum valor
    // texto será string vazia caso nao chegue nenhum parametro na instancia 
    constructor(texto='') {

        this._mensagem = texto;
    }

    get mensagem () {

        return this._mensagem;
    }

    set mensagem (texto) {

        this._mensagem = texto;
    }
}